package bpp.com.devops;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class NameController {

    private NameManager nameManager;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("name", nameManager.createName());
        return "index";
    }

    @PostMapping("/api/submit/animal")
    public String submitAnimal(@RequestParam("textInput") String textInput) {
        this.nameManager.addAnimal(textInput);
        return "redirect:/";
    }

    @PostMapping("/api/submit/adjective")
    public String submitAdjective(@RequestParam("textInput") String textInput) {
        this.nameManager.addAdjective(textInput);
        return "redirect:/";
    }

    @Autowired
    public void setNameManager(NameManager nameManager) {
        this.nameManager = nameManager;
    }
}
