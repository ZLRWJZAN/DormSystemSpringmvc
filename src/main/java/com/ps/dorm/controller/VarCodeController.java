package com.ps.dorm.controller;

import com.ps.dorm.domain.LoginDo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Random;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/13 8:26
 */
@Controller
public class VarCodeController {
    @RequestMapping("/verCode")
    @ResponseBody
    public void getCode(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Random random = new Random();
        String i =  random.nextInt()+"";
        String code=i.substring(1,5);
        req.getSession().setAttribute("code",code);
        resp.getWriter().write(code);

    }
    @RequestMapping("/verCodeLogin")
    @ResponseBody
    public String compareCode(@RequestBody String data, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println(data);
        String code =(String) req.getSession().getAttribute("code");
        if(code.equals(data)){
            String text="true";
            return text;
        }else{
            String text="false";
            return text;
        }
    }
}
