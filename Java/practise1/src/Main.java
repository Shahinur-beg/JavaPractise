import com.Practise.Student;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Shahinur", "beg");
        Student student2 = new Student("Rumman", "Rahman");
        try{
           student1.setAge(10);
           student2.setAge(-10);

        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("Total no of student :"+Student.noOfStudent());
        
    }
}