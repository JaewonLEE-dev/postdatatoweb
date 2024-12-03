package com.gmail.leejaewon264.postdatatoweb.service;


import com.gmail.leejaewon264.postdatatoweb.entity.UserInfo;
import com.gmail.leejaewon264.postdatatoweb.repository.UserInfoRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserInfoService {

    private final UserInfoRepository userInfoRepository;

    public UserInfoService(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    public List<UserInfo> getAllUsers() {
        return userInfoRepository.findAll();
    }
}

