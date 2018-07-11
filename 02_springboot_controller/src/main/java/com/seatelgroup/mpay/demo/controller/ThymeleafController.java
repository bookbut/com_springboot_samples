package com.seatelgroup.mpay.demo.controller;

import com.seatel.entity.Greeting;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
//结合Thymeleaf使用
public class ThymeleafController {

    //    @GetMapping("/greeting")
    @RequestMapping(value="greeting",method = RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

    @PostMapping("/submit")
    public String greetingSubmit(@ModelAttribute Greeting greeting) {
        return "result";
    }

    //Mode 和 ModeView 区别
    @RequestMapping(value="model")
    public String modelTest(Model model) {
        model.addAttribute("greet", new Greeting(1001,"greet content"));
        return "model";
    }

    @RequestMapping(value="modelview")
    public ModelAndView modelViewTest() {
        ModelAndView mav = new ModelAndView("model");
        mav.addObject("id","1005");
        mav.addObject("username","aliang");
        return mav;
    }
}
