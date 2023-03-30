package com.example.dao;

import com.example.common.entity.Lessons;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Map;

public interface LessonsDao extends CrudRepository<Lessons,Integer> {

    @Query(name = "findStudentByClassId",nativeQuery = true,
    value = "select student.s_id, name, m_id from take,student where take.l_id = :id")
    List<Map<String,Object>> findStudentByClassId(@Param("id") int id);

    @Query(name = "findLessonsByTeacherId", nativeQuery = true,
            value = "SELECT lessons.name from take,lessons where t_id = :id")
    List<Map<String,Object>> findLessonsByTeacherId(@Param("id") int id);

}
