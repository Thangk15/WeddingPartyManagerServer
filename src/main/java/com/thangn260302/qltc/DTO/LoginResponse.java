package com.thangn260302.qltc.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginResponse {
	@JsonProperty("userName")
    private String userName;
	
	@JsonProperty("role")
    private String role;

    public LoginResponse(String userName, String role) {
        this.userName = userName;
        this.role = role;
    }

    public String getUserName() { return userName; }
    public String getRole() { return role; }
}
