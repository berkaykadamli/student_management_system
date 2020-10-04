package com.example.student_management_system.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Berkay KADAMLI
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    @ResponseBody
    public String home() {
        return "This comes from HomeController Class";
    }
}
