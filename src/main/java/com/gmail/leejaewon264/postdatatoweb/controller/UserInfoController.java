package com.gmail.leejaewon264.postdatatoweb.controller;

import com.gmail.leejaewon264.postdatatoweb.entity.UserInfo;
import com.gmail.leejaewon264.postdatatoweb.service.UserInfoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

// CORS 설정: 로컬 및 S3 정적 웹사이트 요청 허용
@CrossOrigin(origins = {
        "http://localhost:3000", // 로컬 React 앱
        "http://potatochipsmania-postdatatoweb.s3-website.ap-northeast-2.amazonaws.com",
        "https://potatochipsmania-postdatatoweb.s3-website.ap-northeast-2.amazonaws.com"// S3 정적 웹사이트
})

@RestController
public class UserInfoController {

    private final UserInfoService userInfoService;

    public UserInfoController(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }

    @GetMapping("/")
    public List<UserInfo> getAllUsers() {
        return userInfoService.getAllUsers();
    }
}
