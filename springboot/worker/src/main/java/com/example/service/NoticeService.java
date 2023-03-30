package com.example.service;

import com.example.common.entity.Notice;
import com.example.dao.NoticeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@Service
public class NoticeService {
    @Autowired
    private NoticeDao noticeDao;

    public List<Notice> getAllNotice(){
        List<Notice> res = new LinkedList<>();
        noticeDao.findAll().forEach(e -> res.add(e));
        return res;
    }

}
