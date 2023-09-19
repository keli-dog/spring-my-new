package com.itheima.service.impl;

import com.itheima.dao.LoveDao;
import com.itheima.domain.Love;
import com.itheima.service.LoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Service
//@Scope("prototype")设置为非单例
public class LoveServiceImpl implements LoveService {

    @Autowired
    private LoveDao loveDao;

    public void save(Love love) {
        loveDao.save(love);
    }

    public void update(Love love) {
        loveDao.update(love);
    }

    public void delete(Integer id) {
        loveDao.delete(id);
    }

    public Love findById(Integer id) {
        return loveDao.findById(id);
    }

    public List<Love> findAll() {
        return loveDao.findAll();
    }

    /*@PostConstruct
    public void init() {
        System.out.println("LoveService dao init ...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("LoveService dao destroy ...");
    }*/
}
