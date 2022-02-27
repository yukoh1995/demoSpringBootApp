package com.kidayuga.demo.service;

import com.kidayuga.demo.dto.UserMasterDto;

import java.util.List;

public interface UserService {
    List<UserMasterDto> fetchAllUsers();
}
