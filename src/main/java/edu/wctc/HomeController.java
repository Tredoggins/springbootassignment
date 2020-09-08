package edu.wctc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHome(){
        return "index.html";
    }
    @RequestMapping("/step1")
    public String showStep1(){
        return "pages/step1.html";
    }
    @RequestMapping("/step2")
    public String showStep2(){
        return "pages/step2.html";
    }
    @RequestMapping("/step3")
    public String showStep3(){
        return "pages/step3.html";
    }
}
