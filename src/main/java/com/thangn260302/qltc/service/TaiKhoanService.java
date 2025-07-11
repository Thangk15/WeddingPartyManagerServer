package com.thangn260302.qltc.service;

import org.springframework.stereotype.Service;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.thangn260302.qltc.DTO.LoginResponse;
import com.thangn260302.qltc.entity.TaiKhoan;
import com.thangn260302.qltc.repository.TaiKhoanRepository;

@Service
public class TaiKhoanService {
	private final TaiKhoanRepository repo;
    private final BCryptPasswordEncoder passwordEncoder;

    public TaiKhoanService(TaiKhoanRepository repo) {
        this.repo = repo;
        this.passwordEncoder = new BCryptPasswordEncoder();
    }

    public TaiKhoan createTaiKhoan(TaiKhoan tk) {
    	if (repo.existsById(tk.getUserName())) {
    	    throw new RuntimeException("Tài khoản đã tồn tại!");
    	}
        String hashed = passwordEncoder.encode(tk.getPassWord());
        tk.setPassWord(hashed);
        return repo.save(tk);
    }
    
    public LoginResponse login(String userName, String rawPassword) {
        TaiKhoan user = repo.findByUserName(userName)
            .orElseThrow(() -> new RuntimeException("Tài khoản không tồn tại"));

        if (!passwordEncoder.matches(rawPassword, user.getPassWord())) {
            throw new RuntimeException("Mật khẩu không đúng");
        }

        return new LoginResponse(user.getUserName(), user.getRole());
    }
        
}
