package mvc.controller;

// import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormsController {
    @RequestMapping("/forms")
    public String forms() {
        return "forms";
    }

    @RequestMapping("/process-form")
    public String processForm() {
        return "process-form";
    }

    @RequestMapping("process-form-model")
    // public String processFormModel(HttpServletRequest request, Model model) {
    public String processFormModel(@RequestParam("name") String name, Model model) {
        // String name = request.getParameter("name");
        name = name.concat(" Welcome.");
        String message = "Message: ".concat(name);

        model.addAttribute("message", message);

        return "process-form";
    }
}
