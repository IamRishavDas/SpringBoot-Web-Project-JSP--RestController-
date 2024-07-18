package com.iamrishavdas.spring_boot_web_project;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HomeController {
    

    @RequestMapping(value = "/", method=RequestMethod.GET)
    public String home(){
        return "index.jsp";
    }

    // RequestMapping("add")
    // public String add(HttpServletRequest request, HttpSession session){
    //     int a = Integer.parseInt(request.getParameter("num1"));
    //     int b = Integer.parseInt(request.getParameter("num2"));
    //     session.setAttribute("result", (a+b));
    //     return "result.jsp";
    // }

    // RequestMapping("add")
    // public String add(int num1, int num2, HttpSession session){
    //     session.setAttribute("result", (num1+num2));
    //     return "result.jsp";
    // }

    // RequestMapping("add")
    // public String add(@RequestParam("num1") int a, @RequestParam("num2") int b ,HttpSession session){
    //     session.setAttribute("result", (a+b));
    //     return "result.jsp";
    // }


    @RequestMapping("add")
    public String add(@RequestParam("num1") int a, @RequestParam("num2") int b, Model model){
        model.addAttribute("result", (a+b));
        return "result.jsp";
    }

    // RequestMapping("addStudent")
    // public ModelAndView addStudent(@RequestParam("id") int id, @RequestParam("name") String name, ModelAndView modelAndView){
    //     Student student = new Student(id, name);
    //     modelAndView.addObject("s", student);
    //     modelAndView.setViewName("student");
    //     return modelAndView;
    // }

    @RequestMapping("addStudent")
    public String addStudent(/*@ModelAttribute("student")*/ Student student){
        return "result.jsp";
    }

    @ModelAttribute("course")
    public String courseName(){
        return "Java";
    }
}
