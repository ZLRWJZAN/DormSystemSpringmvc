package com.ps.dorm.controller;


import com.ps.dorm.domain.BuidingDo;
import com.ps.dorm.domain.ResultDo;
import com.ps.dorm.service.BuidingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/10 15:51
 */
@Controller
@RequestMapping("/buiding")
public class BuidingController {
    @Autowired
    private BuidingService buidingService;

    /**
     * 增加
     * @param buidingDo
     */
    @PostMapping("/add")
    @ResponseBody
    public String add(@Valid @RequestBody BuidingDo buidingDo, BindingResult result){
        // 输出所有错误
        if (result.hasErrors()){
            List<ObjectError> errorList = result.getAllErrors();
            for(ObjectError error : errorList){
                System.out.println(error.getDefaultMessage());
            }
            return "{\"success\":false}";

            //throw new RuntimeException("参数不正确");
        }

        //buidingService.add(buidingDo);

        return "{\"success\":true}";

    }
    /*@ExceptionHandler(Exception.class)
    @ResponseBody
    public String hand(Exception ex){
        System.out.println("兄弟");
        return "{\"success\":false,error}";
    }*/

    /**
     * 查询
     * @return
     */
    @GetMapping("/query")
    @ResponseBody
    public ResultDo query(){
        ResultDo resultDo = new ResultDo();
        resultDo.setBody(buidingService.query());
        return resultDo;
    }

    /**
     * 删除
     * @param buidingDo
     */
    @PostMapping("/delete")
    public void delete(@RequestBody BuidingDo buidingDo){
        buidingService.delete(buidingDo);
    }

    /**
     * 修改
     * @param buidingDo
     */
    @PostMapping("/update")
    public void update(@RequestBody BuidingDo buidingDo){
        buidingService.update(buidingDo);
    }
}
