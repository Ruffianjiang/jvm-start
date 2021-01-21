package com.dawn.jvmstart.week1.jvmloader.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class JvmAop {

    @Pointcut()
    public void pointCut(){}




}
