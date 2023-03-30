package com.example.controller;

import com.example.common.entity.*;
import com.example.service.LessonService;
import com.example.service.StudentService;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {
    @Autowired
    private TeacherService teacherService;

    @RequestMapping(value = "",method = RequestMethod.POST)
    public Result teacherLogin(@RequestBody Login login){
        Teacher teacher = teacherService.findById(login);
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(teacher);
        return result;
    }
}
