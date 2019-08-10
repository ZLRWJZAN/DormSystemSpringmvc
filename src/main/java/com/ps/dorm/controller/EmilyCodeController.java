package com.ps.dorm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ps.dorm.Utils.AESUtil;
import com.ps.dorm.domain.LoginDo;
import com.ps.dorm.emilecode.SendForgetPassword;
import com.ps.dorm.emilecode.SendMail;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/14 12:28
 */
@Controller
public class EmilyCodeController {

    private static SendForgetPassword sendForgetPassword = new SendForgetPassword();
    private static SendMail sendMail = new SendMail();

    @RequestMapping("/emilyCode")
    @ResponseBody
    public String compareCode(@RequestBody String data, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if(data.endsWith("1753161465@qq.com")){
            sendMail.send(data,req,resp);
            String text="true";
            return text;
        }else{
            String text="false";
            return text;
        }
    }
    @RequestMapping("/forgetPassword")
    @ResponseBody
    public String forgetPassword(@RequestBody LoginDo loginDo, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println(loginDo.getMailCode());
        if(loginDo.getMailCode().endsWith("1753161465@qq.com")){
            SendForgetPassword.send(loginDo.getMailCode(),loginDo.getNumber(),req,resp);
            String text="true";
            return text;
        }else{
            String text="false";
            return text;
        }
    }

    @RequestMapping("/inputEmilyCode")
    @ResponseBody
    public String inputEmilyCode(@RequestBody String data, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        Object emilyCode = req.getSession().getAttribute("emilyCode");
        if(data.equals(emilyCode)){
            String text="true";
            return text;
        }else{
            String text="false";
            return text;
        }

    }
    @RequestMapping("/decodePassword")
    @ResponseBody
    public String decodePassword(@RequestBody LoginDo loginDo, HttpServletRequest req, HttpServletResponse resp) throws Exception {
        String substring = loginDo.getInput().substring(1, loginDo.getInput().length() - 1);
        System.out.println(substring);
        String key = (String) req.getServletContext().getAttribute("key");
        System.out.println(key);
        String decode = AESUtil.decode(key, substring);
        String[] split = decode.split("=");
        return split[0];
    }
}
