package com.example.dao;

import com.example.common.entity.Notice;
import org.springframework.data.repository.CrudRepository;

public interface NoticeDao extends CrudRepository<Notice,Integer> {

}
