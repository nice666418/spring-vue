package com.example.controller;

import com.example.common.entity.Result;
import com.example.common.entity.ResultCode;
import com.example.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/lesson")
@CrossOrigin
@RestController
public class LessonsController {
    @Autowired
    private LessonService lessonService;

    @RequestMapping(value = "/student/{id}",method = RequestMethod.GET)
    public Result getAllStudent(@PathVariable(name = "id") int id){
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(lessonService.findStudentByClassId(id));
        return result;
    }

    @RequestMapping(value = "/teacher/{id}",method = RequestMethod.GET)
    public Result getAllClass(@PathVariable(name = "id") int id){
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(lessonService.findLessonsByTeacherId(id));
        return result;
    }

}
