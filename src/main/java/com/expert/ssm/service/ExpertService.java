package com.expert.ssm.service;

import com.expert.ssm.pojo.TrueThing;

import java.util.List;

public interface ExpertService {
    /*
    * 进行判断，正向推理
    * */
    List<String> expertSystem(TrueThing trueThing);

    /*
    * 查询所有的事实
    * */
    TrueThing getAllTrueThing();
}
