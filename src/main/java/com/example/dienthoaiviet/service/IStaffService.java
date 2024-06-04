package com.example.dienthoaiviet.service;

import com.example.dienthoaiviet.dto.StaffDto;
import com.example.dienthoaiviet.entity.Staff;

import java.util.List;
import java.util.Optional;

public interface IStaffService {
    List<StaffDto> findAll();

    <S extends Staff> List<S> saveAll(Iterable<S> iterable);

    StaffDto findByPhone(String phone);

    StaffDto findByEmail(String email);

    StaffDto saveAndFlush(StaffDto s);


    StaffDto findById(Integer id);

    StaffDto login(Integer id, String password);
}
