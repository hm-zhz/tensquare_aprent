package com.sz.tencent.service;

import com.sz.tencent.model.ChnCity;

import java.util.List;

public interface ICityService {

    //查询所有
    public List<ChnCity> getAllCity();
    //删除一个城市
    public int deleteCity();
    //查找一个城市
    public ChnCity getOne();

}
