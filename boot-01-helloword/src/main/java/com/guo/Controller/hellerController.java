package com.guo.Controller;

import com.guo.bean.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Controller
public class hellerController {
    @Autowired
    Pet pet;

    @RequestMapping("/hello")
    public String hello(HttpServletRequest request) {
        request.setAttribute("key", "00002");
        request.getSession().setAttribute("sess","session域");
        return "index";
    }

    @ResponseBody
    @RequestMapping("/word")
    public String word(String key) {
        return pet.getName();
    }
}
