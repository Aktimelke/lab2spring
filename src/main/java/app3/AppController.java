package app3;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
@RequestMapping("/")
public class AppController {

    @GetMapping("/")
    public String mainForm(@RequestParam(required = false) String name,@RequestParam(required = false) String password, Model model){
        if(name == null){
            name="";
        }
        model.addAttribute("name",name);
        model.addAttribute("password",password);
        return "main";
    }

    @PostMapping("/check-user")
    public String checkUser(@RequestParam String name,@RequestParam String password, Model model){
        model.addAttribute("user",new User(name,password));
        return "page";
    }

}
