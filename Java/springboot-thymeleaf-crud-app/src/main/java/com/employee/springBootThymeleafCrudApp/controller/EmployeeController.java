package com.employee.springBootThymeleafCrudApp.controller;

import com.employee.springBootThymeleafCrudApp.model.Employee;
import com.employee.springBootThymeleafCrudApp.service.EmployeeServiceable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeServiceable employeeServiceable;

    @GetMapping("/")
    public String viewHomePage(Model model){
        model.addAttribute("listEmployee",employeeServiceable.getAllEmployees());
        return "index";
    }
    @GetMapping("/newEmployeeForm")
    public String newEmployeeForm(Model model){
        Employee employee = new Employee();
        model.addAttribute("employee",employee);
        return "new_employee";
    }
    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee){
        employeeServiceable.saveEmployee(employee);
        return "redirect:/";
    }
    @GetMapping("/showFormUpdate/{id}")
    public String showFormUpdate(@PathVariable int id, Model model){
        Employee employee = employeeServiceable.getEmployeeById(id);
        model.addAttribute("employee",employee);
        employeeServiceable.deleteEmployee(id);
        return "update_employee";
    }
    @GetMapping("/deleteEmployee/{id}")
    public String deleteEmployee(@PathVariable int id){
        employeeServiceable.deleteEmployee(id);
        return "redirect:/";
    }

}
