package com.ssm_project.service.impl;


import com.ssm_project.dao.LogMapper;
import com.ssm_project.entity.Log;
import com.ssm_project.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogSerciceImpl implements LogService {
    @Autowired
    private LogMapper  logMapper;

    @Override
    public int insert(Log record) {
        return logMapper.insert(record);
    }
}
