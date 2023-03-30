package com.example.service;

import com.example.common.entity.Student;
import com.example.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
public class StudentService {
    @Autowired
    StudentDao studentDao;

    public List<Student> findAllStudent(){
        Iterable<Student> all = studentDao.findAll();
        List<Student> list = new ArrayList<>();
        all.forEach(list::add);
        return list;
    }

    public void updateStudent(Student student){
        studentDao.save(student);
    }

    public List<Map<String,Object>> findStudentByPage(int pageSize, int pageNum){
        System.out.println((pageSize-1)*pageNum);
        System.out.println(pageSize);
        return studentDao.findStudentByPage((pageNum-1)*pageSize,pageSize);
    }

    public int getStudentNumber(){
        Iterable<Student> all = studentDao.findAll();
        List<Student> list = new ArrayList<>();
        all.forEach(list::add);
        return list.size();
    }

}
