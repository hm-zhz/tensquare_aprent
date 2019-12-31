package com.sz.tencent.service;

import com.sz.tencent.mapper.ChnCityMapper;
import com.sz.tencent.model.ChnCity;
import com.sz.tencent.model.ChnCityExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Service
public class CityserviceImpl implements  ICityService {

   @Autowired
   private ChnCityMapper chnCityMapper;

    @Override
    public List<ChnCity> getAllCity() {
       return chnCityMapper.selectByExample(null);
//         在做获取所有城市的同时完成模糊查询功能
//        ChnCityExample example = new ChnCityExample();
//        ChnCityExample.Criteria criteria = example.createCriteria();
//        //对查询条件进行判断
//        if (chnCity != null && chnCity.getCname()!= null){
//            //调价模糊查询的条件
//           criteria.andCnameLike("%"+chnCity.getCname()+"%");
//        }
//        List<ChnCity> list = chnCityMapper.selectByExample(example);
//        //传递给controller层数据
//        return  list;
    }

    @Override
    public int deleteCity() {
        return 0;
    }

    @Override
    public ChnCity getOne() {
        return null;
    }
}
