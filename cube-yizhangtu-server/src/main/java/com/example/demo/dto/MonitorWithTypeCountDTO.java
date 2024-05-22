package com.example.demo.dto;

import java.util.Map;

public class MonitorWithTypeCountDTO {
    private int id;
    private String the_geom;
    private String name;
    private String code;
    private String fzr;
    private String tel;
    private String type;
    private String createTime;
    private String updateTime;
    private int isDelete;
    private Map<String, Integer> typeCount;

    // Getters 和 Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getThe_geom() {
        return the_geom;
    }

    public void setThe_geom(String the_geom) {
        this.the_geom = the_geom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public Map<String, Integer> getTypeCount() {
        return typeCount;
    }

    public void setTypeCount(Map<String, Integer> typeCount) {
        this.typeCount = typeCount;
    }


    // 添加构造函数，toString，equals 和 hashCode 方法
}
