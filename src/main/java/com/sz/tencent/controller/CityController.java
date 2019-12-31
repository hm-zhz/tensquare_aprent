package com.sz.tencent.controller;

import com.sz.tencent.model.ChnCity;
import com.sz.tencent.service.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private ICityService iCityService;

    //controller层用户处理前后端之间的数据交互
    //spring的面向切面AOP，应用动态代理，所以在controller层代理！  方法直接在接口层进行获取
    @RequestMapping("/list")
//    RequestBody会自动把参数转换为json  ,这样前后的数据库交换都是采用json的数据格式交互！
    public List<ChnCity> getAllCity(){       //从前台得到的数据传输到后台(以json的数据格式)
        List<ChnCity> list = iCityService.getAllCity();
        return list;            //传递给前台数据（以json的数据格式）
    }



}
