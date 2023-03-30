package com.example.service;

import com.example.common.entity.Lessons;
import com.example.common.entity.Login;
import com.example.common.entity.Teacher;
import com.example.dao.LessonsDao;
import com.example.dao.TeacherDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    @Autowired
    private TeacherDao teacherDao;

    public Teacher findById(Login login){
        System.out.println(login.getId());
        return  teacherDao.findById(login.getId()).get();
    }

}
