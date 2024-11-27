package com.gmail.leejaewon264.postdatatoweb.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name", nullable = false, length = 50)
    private String userName;

    @Column(name = "user_email", unique = true, length = 100)
    private String userEmail;

    @Column(name = "user_pw_hash", length = 255)
    private String userPwHash;

    // Getters and Setters
    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserPwHash() {
        return userPwHash;
    }

    public void setUserPwHash(String userPwHash) {
        this.userPwHash = userPwHash;
    }
}



