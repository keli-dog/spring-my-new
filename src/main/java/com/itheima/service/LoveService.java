package com.itheima.service;

import com.itheima.domain.Love;

import java.util.List;

public interface LoveService {

    void save(Love love);

    void update(Love love);

    void delete(Integer id);

    List<Love> findAll();

    Love findById(Integer id);

}
