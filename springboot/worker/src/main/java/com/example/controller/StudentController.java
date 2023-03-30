package com.example.controller;

import com.example.common.entity.Result;
import com.example.common.entity.ResultCode;
import com.example.common.entity.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/student")
@CrossOrigin
@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public Result getAllStudent(){
        List<Student> list = studentService.findAllStudent();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);
        return result;
    }

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Result saveStudent(@RequestBody Student student){
        studentService.updateStudent(student);
        return new Result(ResultCode.SUCCESS);
    }

    @RequestMapping(value = "/page",method = RequestMethod.GET)
    public Result getAllStudentPage(@RequestParam(value = "pageSize") int pageSize,@RequestParam(value = "pageNum") int pageNum){
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(studentService.findStudentByPage(pageSize,pageNum));
        return result;
    }

    @RequestMapping(value = "/number",method = RequestMethod.GET)
    public Result getStudentNumber(){
        int list = studentService.getStudentNumber();
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(list);
        return result;
    }

}
