package com.ps.dorm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ps.dorm.domain.LoginDo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/13 11:09
 */
@Controller
public class LoginController {
    private String text="false";

    @RequestMapping("/login")
    @ResponseBody
    public String Login(@RequestBody LoginDo loginDo, HttpServletRequest req, HttpServletResponse resp) throws IOException {

        if("1".equals(loginDo.getNumber()) && "1".equals(loginDo.getPassword())){
            req.getSession().setAttribute("login",loginDo);
            return text="true";
        }
        return text="false";
    }
}
