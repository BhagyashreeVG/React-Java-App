package com.umsa.umsapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umsa.umsapp.entity.User;

public interface UmsAppRepo extends JpaRepository<User,Integer>{

}
