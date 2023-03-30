package com.example.dao;

import com.example.common.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface TeacherDao extends CrudRepository<Teacher,Integer> {
}
