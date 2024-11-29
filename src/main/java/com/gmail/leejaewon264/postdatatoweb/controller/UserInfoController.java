package com.gmail.leejaewon264.postdatatoweb.controller;

import com.gmail.leejaewon264.postdatatoweb.entity.UserInfo;
import com.gmail.leejaewon264.postdatatoweb.repository.UserInfoRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

// CORS 설정: 로컬 및 S3 정적 웹사이트 요청 허용
@CrossOrigin(origins = {
        "http://localhost:3000", // 로컬 React 앱
        "http://potatochipsmania-postdatatoweb.s3-website.ap-northeast-2.amazonaws.com",
        "https://potatochipsmania-postdatatoweb.s3-website.ap-northeast-2.amazonaws.com"// S3 정적 웹사이트
})
@Controller
public class UserInfoController {
    private final UserInfoRepository userInfoRepository;

    public UserInfoController(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @GetMapping("/")
    public String getAllUsers(Model model) {
        List<UserInfo> users = userInfoRepository.findAll();
        model.addAttribute("users", users);
        return "user-list";
    }
}
