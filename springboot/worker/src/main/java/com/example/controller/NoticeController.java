package com.example.controller;

import com.example.common.entity.Result;
import com.example.common.entity.ResultCode;
import com.example.service.NoticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/notice")
@CrossOrigin
@RestController
public class NoticeController {

    @Autowired
    NoticeService noticeService;

    @RequestMapping(value = "",method = RequestMethod.GET)
    public Result findAll(){
        Result result = new Result(ResultCode.SUCCESS);
        result.setData(noticeService.getAllNotice());
        return result;
    }

}
