package com.zouweihao.zouweihao.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
@ResponseBody
public class UrlController {


    @GetMapping("/login_zouweihao")
    public ModelAndView login(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login");
        return mv;
    }
    @GetMapping("/back_login")
    public ModelAndView backlogin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/login");
        return mv;
    }
    @GetMapping("/register_zouweihao")
    public ModelAndView register(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/register");
        return mv;
    }
    @GetMapping("/back_register")
    public ModelAndView backregister(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/register");
        return mv;
    }

    @GetMapping("/indexstu_zouweihao")
    public ModelAndView indexstu(HttpServletRequest request){
        ModelAndView mv = new ModelAndView();
        String user_name= (String) request.getSession().getAttribute("user_name");
        String user_role= (String) request.getSession().getAttribute("user_role");
        mv.setViewName("../static/student/indexstu");
        mv.addObject("user_name",user_name);
        mv.addObject("user_role",user_role);
        return mv;
    }

    @GetMapping("/room1")
    public ModelAndView rooma(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("../static/student/room1");
        return mv;
    }

    @GetMapping("/room2")
    public ModelAndView roomb(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("../static/student/room2");
        return mv;
    }
    @GetMapping("/room3")
    public ModelAndView roomAdmin(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("../static/student/room3");
        return mv;
    }
    @GetMapping("/persona3")
    public ModelAndView persona3(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("../static/student/persona3");
        return mv;
    }
    @GetMapping("/persona1")
    public ModelAndView persona1(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("../static/student/persona1");
        return mv;
    }
    @GetMapping("/persona2")
    public ModelAndView persona2(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("../static/student/persona2");
        return mv;
    }


    @GetMapping("/systemLog_huangyu")
    public ModelAndView systemLog(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("../logInfo/app.log");
        return mv;
    }

    @GetMapping("/index_message.html")
    public ModelAndView indexSuccess(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("../static/student/index_message");
        return mv;
    }

    @GetMapping("/loginsuccess")
    public ModelAndView loginsuccess(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/loginsuccess");
        return mv;
    }

    @GetMapping("/loginfailure")
    public ModelAndView loginfailure(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/loginfailure");
        return mv;
    }

    @GetMapping("/test")
    public ModelAndView loginVue(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/test");
        return mv;
    }


}
