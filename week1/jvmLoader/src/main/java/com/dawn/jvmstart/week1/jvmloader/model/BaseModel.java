package com.dawn.jvmstart.week1.jvmloader.model;

import java.io.Serializable;
import java.util.Date;

public class BaseModel implements Serializable {
    private static final long serialVersionUID = 7598558299307853386L;

    private String id;

    private String name;

    private Integer count;

    private Date createTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
