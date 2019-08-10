package com.ps.dorm.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ps.dorm.domain.DormDo;
import com.ps.dorm.domain.ResultDo;
import com.ps.dorm.service.BuidingService;
import com.ps.dorm.service.DormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/10 15:51
 */
@Controller
@RequestMapping("/dorm")
public class DormController {
    private String ecoding="UTF-8";
    @Autowired
    private DormService dormService;

    @Autowired
    private BuidingService buidingService;

    /**
     * 增加
     * @param dormDo
     * @return
     */
    @PostMapping("/add")
    public String add(@RequestBody DormDo dormDo){
        List<DormDo> dormDos = buidingService.queryId(dormDo);

        String s=JSONObject.toJSONString(dormDos);
        if(s.length()<3){
            return "增加失败,该宿舍楼不存在";
        }else{
            dormService.add(dormDo);
            return "增加成功";
        }

    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("/query")
    @ResponseBody
    public ResultDo query(){
        ResultDo resultDo =new ResultDo();
        resultDo.setBody(dormService.query());
        return resultDo;
    }

    /**
     * 删除
     * @param dormDo
     */
    @RequestMapping("/delete")
    public void delete(@RequestBody DormDo dormDo){
        dormService.delete(dormDo);
    }

    /**
     * 修改
     * @param dormDo
     */
    @RequestMapping("/update")
    public void update(@RequestBody DormDo dormDo){
        dormService.update(dormDo);
    }

    /**
     * 查询宿舍人数
     * @return
     */
    @RequestMapping("/dormSelectPeople")
    @ResponseBody
    public List<DormDo> dormSelectPeople(){
        return dormService.dormSelectPeople();
    }
}
