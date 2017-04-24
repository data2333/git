package com.springapp.mvcaa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/3/17.
 */
@Controller
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping(value = "/hello.do",method = RequestMethod.GET)
    public String printWelcome(ModelMap model) {
        System.out.println("hello");
        model.addAttribute("message", "Hello world!");
        return "helloYou";
    }
}
