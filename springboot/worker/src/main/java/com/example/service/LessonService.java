package com.example.service;

import com.example.dao.LessonsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class LessonService {
    @Autowired
    private LessonsDao lessonsDao;

    public List<Map<String,Object>> findStudentByClassId(int id){
        return lessonsDao.findStudentByClassId(id);
    }

    public List<Map<String,Object>> findLessonsByTeacherId(int id){
        return lessonsDao.findLessonsByTeacherId(id);
    }

}
