package com.example.dao;

import com.example.common.entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface StudentDao extends CrudRepository<Student,Integer> {
    @Query(name = "findStudentByPage",nativeQuery = true,
            value = "select * from student limit :pageNow ,:pageNum ")
    List<Map<String,Object>> findStudentByPage(@Param("pageNow") int pageNow,@Param("pageNum") int pageNum);
}
