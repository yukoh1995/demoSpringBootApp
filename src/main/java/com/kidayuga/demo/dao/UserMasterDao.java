package com.kidayuga.demo.dao;

import com.kidayuga.demo.entity.UserMasterEntity;

import java.util.List;

public interface UserMasterDao {
    List<UserMasterEntity> selectAll();
}
