package com.kidayuga.demo.service;

import com.kidayuga.demo.dao.UserMasterDao;
import com.kidayuga.demo.dto.UserMasterDto;
import com.kidayuga.demo.entity.UserMasterEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMasterDao userMasterDao;
    
    @Override
    public List<UserMasterDto> fetchAllUsers() {
        List<UserMasterEntity> entities = userMasterDao.selectAll();
        List<UserMasterDto> dtos = new ArrayList<>();
        entities.stream().forEach(entity -> {
            UserMasterDto dto = new UserMasterDto();
            dto.setUserId(entity.getUserId());
            dto.setUserName(entity.getUserName());
            dto.setEmail(entity.getEmail());
            dtos.add(dto);
        });
        return dtos;
    }
}
