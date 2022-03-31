package pl.tk.videoapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;


@Controller
public class TestController {
    private Logger log = LoggerFactory.getLogger(TestController.class);
    @GetMapping("/home")
    public String home(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        log.info("abc");
        model.addAttribute("name", name);
        return "home";
    }
}
