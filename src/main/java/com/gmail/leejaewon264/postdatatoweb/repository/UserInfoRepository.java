package com.gmail.leejaewon264.postdatatoweb.repository;

import com.gmail.leejaewon264.postdatatoweb.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}

