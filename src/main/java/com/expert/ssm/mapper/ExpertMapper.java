package com.expert.ssm.mapper;


import com.expert.ssm.pojo.Rules;
import com.expert.ssm.pojo.TrueThing;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ExpertMapper {

    /*
    * 删除true表中的所有数据
    * */
    void deleteAllTrues();

    /*
    * 将选取的事实插入到数据库中
    * */
    void insertTrue(TrueThing trueThing);

    /*
    * 查询所有的规则
    * */
    List<Rules> getAllRules();

    /*
    * 查询事实
    * */
    TrueThing getTrues();


    /*
    * 将第21条事实改为哺乳动物
    * */
    void updateTrue21(@Param("result") String result);
    /*
     * 将第222条事实改为鸟
     * */
    void updateTrue22(@Param("result") String result);
    /*
     * 将第23条事实改为食肉动物
     * */
    void updateTrue23(@Param("result") String result);
    /*
     * 将第24条事实改为有蹄类动物
     * */
    void updateTrue24(@Param("result") String result);
}
