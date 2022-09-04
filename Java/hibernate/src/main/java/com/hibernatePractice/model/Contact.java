package com.hibernatePractice.model;

import jakarta.persistence.*;

@Entity
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;
    @Column
    private String phone;

    public Contact(){};
    public Contact(ContactBuilder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
    public static class ContactBuilder{
        private String firstName;
        private String lastName;
        private String email;
        private String phone;
        public ContactBuilder(String firstName, String lastName){
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public ContactBuilder withEmail(String email){
            this.email = email;
            return this;
        }
        public  ContactBuilder withPhone(String phone){
            this.phone = phone;
            return this;
        }
        public Contact build(){
            return new Contact(this);
        }
    }

}
