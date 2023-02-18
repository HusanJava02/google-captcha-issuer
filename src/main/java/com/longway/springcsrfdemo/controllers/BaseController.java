package com.longway.springcsrfdemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.web.csrf.CsrfTokenRepository;
import org.springframework.security.web.csrf.HttpSessionCsrfTokenRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/")
public class BaseController {


    @GetMapping("main")
    public String mainPage(ModelAndView modelAndView, HttpSession httpSession) {

        modelAndView.addObject("csrf", httpSession.getAttribute("_csrf"));

        return "main";
    }

    @PostMapping("product/add")
    public String addProduct(@RequestParam String product, ModelAndView modelAndView) {
        modelAndView.addObject("product", product);
        System.out.println(product);
        return "main";
    }


}
