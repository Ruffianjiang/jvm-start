package com.dawn.jvmstart.week1.jvmloader.service;

import com.dawn.jvmstart.week1.jvmloader.model.BaseModel;
import org.springframework.stereotype.Service;

public interface JvmBaseService {


    BaseModel findById(String id);


}
