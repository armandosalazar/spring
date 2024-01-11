package mvc.controller;

import mvc.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/students")
public class StudentsController {

    @RequestMapping("/show-form")
    public String showForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);

        return "students/form";
    }

    @RequestMapping("/add-student")
    public String addStudent(@ModelAttribute("student") Student student) {
        System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
        return "students/index";
    }
}
