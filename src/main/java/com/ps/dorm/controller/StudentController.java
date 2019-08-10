package com.ps.dorm.controller;

import com.ps.dorm.domain.ResultDo;
import com.ps.dorm.domain.StudentDo;
import com.ps.dorm.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 作者：ZLRWJSAN
 * 创建于 2019/6/10 15:51
 */
@Controller
@RequestMapping("/stu")
public class StudentController {
    @Autowired
    private StudentService studentService;

    private String ecoding="UTF-8";

    /**
     * 增加
     * @param studentDo
     */
    @RequestMapping("/add")
    public void add(@RequestBody StudentDo studentDo){
        studentService.add(studentDo);

    }

    /**
     * 查询
     * @return
     */
    @RequestMapping("/query")
    @ResponseBody
    public ResultDo query(){
        ResultDo resultDo = new ResultDo();
        resultDo.setBody(studentService.query());
        return resultDo;
    }

    /**
     * 删除
     * @param studentDo
     */
    @RequestMapping("/delete")
    public void delete(@RequestBody StudentDo studentDo){
        studentService.delete(studentDo);
    }

    /**
     * 修改
     * @param studentDo
     */
    @RequestMapping("/update")
    public void update(@RequestBody StudentDo studentDo){
        studentService.update(studentDo);
    }

    /**
     * 查询明细
     * @return
     */
    @RequestMapping("/queryDetail")
    @ResponseBody
    public List<StudentDo> queryDetail(){
        return studentService.queryDetail();
    }

    /**
     * 查询各种爱好人数
     * @return
     */
    @RequestMapping("/queryLoveCount")
    @ResponseBody
    public List<StudentDo> queryLoveCount(){
        return studentService.queryLoveCount();
    }

    /**
     * 分页查询
     * @return
     */
    @RequestMapping("/queryLimit")
    @ResponseBody
    public List<StudentDo> queryLimit(){
        return studentService.queryLimit();
    }
}
