package com.dawn.jvmstart.week1.jvmloader.service.impl;

import com.dawn.jvmstart.week1.jvmloader.model.BaseModel;
import com.dawn.jvmstart.week1.jvmloader.service.JvmBaseService;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * service注解测试
 *
 * @author jiangyj
 * @version 1.0
 * @create 2021-01-20 15:29
 **/
@Service
public class JvmServiceImpl implements JvmBaseService {


    /**
     *
     * @param id
     * @return
     */
    public BaseModel findById(String id) {

        BaseModel baseModel = new BaseModel();
        baseModel.setId(id);
        baseModel.setCount(100);
        baseModel.setName("jvm-loader");
        baseModel.setCreateTime(new Date());
        return baseModel;
    }



}
