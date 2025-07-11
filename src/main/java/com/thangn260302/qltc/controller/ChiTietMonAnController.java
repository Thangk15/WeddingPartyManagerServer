package com.thangn260302.qltc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thangn260302.qltc.DTO.ChiTietMonAnDTO;
import com.thangn260302.qltc.service.ChiTietMonAnService;

@RestController
@RequestMapping("/api/chitietmonan")
public class ChiTietMonAnController {

    @Autowired
    private ChiTietMonAnService service;

    @GetMapping("/tieccuoi/{maTiecCuoi}")
    public List<ChiTietMonAnDTO> getChiTietMonAnTheoTiecCuoi(@PathVariable Long maTiecCuoi) {
        return service.getMonAnTheoTiecCuoi(maTiecCuoi);
    }
}