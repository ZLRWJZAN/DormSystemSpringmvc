package com.ps.dorm.controller;

import com.ps.dorm.notecode.PhoneCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/14 11:39
 */
@Controller
public class NoteCodeController {
    private static PhoneCode phoneCode = new PhoneCode();
    @RequestMapping("/noteCode")
    public void compareCode(@RequestBody String data, HttpServletRequest req, HttpServletResponse resp) throws IOException {
        if(data.length()==11){
            phoneCode.getPhonemsg(data);
            String text="true";
            resp.getWriter().write(text);
        }else{
            String text="false";
            resp.getWriter().write(text);
            return;
        }
    }
}
