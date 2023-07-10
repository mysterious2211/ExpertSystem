package com.expert.ssm.service.impl;

import com.expert.ssm.mapper.ExpertMapper;
import com.expert.ssm.pojo.Rules;
import com.expert.ssm.pojo.TrueThing;
import com.expert.ssm.service.ExpertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

@Service
public class ExpertServiceImpl implements ExpertService {
    @Autowired
    private ExpertMapper expertMapper;

    List<String> information = new ArrayList<>();

    @Override
    public List<String> expertSystem(TrueThing trueThing) {
        //情况list集合
        information.clear();
        // 删除true表中的所有数据
        expertMapper.deleteAllTrues();
        //将事实数据插入到数据库中
        expertMapper.insertTrue(trueThing);
        // 查询所有的规则
        List<Rules> rulesList = expertMapper.getAllRules();
        // 遍历list集合
        for(Rules rules:rulesList){
            //查询事实数据
            TrueThing trues = expertMapper.getTrues();
            // 输出事实数据
            System.out.println(trues);
            if((rules.getTrue1()==null || rules.getTrue1().equals("") || rules.getTrue1().equals(trues.getTrue1())) && (rules.getTrue2()==null || rules.getTrue2().equals("") || rules.getTrue2().equals(trues.getTrue2()))  && (rules.getTrue3()==null || rules.getTrue3().equals("") || rules.getTrue3().equals(trues.getTrue3())) && (rules.getTrue4()==null || rules.getTrue4().equals("") || rules.getTrue4().equals(trues.getTrue4()))  && (rules.getTrue5()==null || rules.getTrue5().equals("") || rules.getTrue5().equals(trues.getTrue5()))  && (rules.getTrue6()==null || rules.getTrue6().equals("") || rules.getTrue6().equals(trues.getTrue6()))  && (rules.getTrue7()==null || rules.getTrue7().equals("") || rules.getTrue7().equals(trues.getTrue7()))  && (rules.getTrue8()==null || rules.getTrue8().equals("") || rules.getTrue8().equals(trues.getTrue8()))  && (rules.getTrue9()==null || rules.getTrue9().equals("") || rules.getTrue9().equals(trues.getTrue9())) && (rules.getTrue10()==null || rules.getTrue10().equals("") || rules.getTrue10().equals(trues.getTrue10()))  && (rules.getTrue11()==null || rules.getTrue11().equals("") || rules.getTrue11().equals(trues.getTrue11())) && (rules.getTrue12()==null || rules.getTrue12().equals("") || rules.getTrue12().equals(trues.getTrue12())) && (rules.getTrue13()==null || rules.getTrue13().equals("") || rules.getTrue13().equals(trues.getTrue13())) && (rules.getTrue14()==null || rules.getTrue14().equals("") || rules.getTrue14().equals(trues.getTrue14()))  && (rules.getTrue15()==null || rules.getTrue15().equals("") || rules.getTrue15().equals(trues.getTrue15()))  && (rules.getTrue16()==null || rules.getTrue16().equals("") || rules.getTrue16().equals(trues.getTrue16()))  && (rules.getTrue17()==null || rules.getTrue17().equals("") || rules.getTrue17().equals(trues.getTrue17()))  && (rules.getTrue18()==null || rules.getTrue18().equals("") || rules.getTrue18().equals(trues.getTrue18()))  && (rules.getTrue19()==null || rules.getTrue19().equals("") || rules.getTrue19().equals(trues.getTrue19()))  && (rules.getTrue20()==null || rules.getTrue20().equals("") || rules.getTrue20().equals(trues.getTrue20()))  && (rules.getTrue21()==null || rules.getTrue21().equals("") || rules.getTrue21().equals(trues.getTrue21()))  && (rules.getTrue22()==null || rules.getTrue22().equals("") || rules.getTrue22().equals(trues.getTrue22())) && (rules.getTrue23()==null || rules.getTrue23().equals("") || rules.getTrue23().equals(trues.getTrue23())) && (rules.getTrue24()==null || rules.getTrue24().equals("") || rules.getTrue24().equals(trues.getTrue24()))){
                if(rules.getResult().equals("哺乳动物")){
                    //将此事实加入数据库
                    expertMapper.updateTrue21(rules.getResult());
                    if(rules.getIndex()==1){
                        System.out.println("运用第1规则：有毛发 ==> 哺乳动物");
                        information.add("运用第1规则：有毛发 ==> 哺乳动物");
                    } else if (rules.getIndex()==2) {
                        System.out.println("运用的2条规则：有奶 ==> 哺乳动物");
                        information.add("运用的2条规则：有奶 ==> 哺乳动物");
                    }
                }
                else if(rules.getResult().equals("鸟")){
                    expertMapper.updateTrue22(rules.getResult());
                    if (rules.getIndex()==3) {
                        System.out.println("运用第3条规则：有羽毛 ==> 鸟");
                        information.add("运用第3条规则：有羽毛 ==> 鸟");
                    } else if (rules.getIndex()==4) {
                        System.out.println("运用第4条规则：会飞、会下蛋 ==> 鸟");
                        information.add("运用第4条规则：会飞、会下蛋 ==> 鸟");
                    }
                }
                else if(rules.getResult().equals("食肉动物")){
                    expertMapper.updateTrue23(rules.getResult());
                    if (rules.getIndex()==5) {
                        System.out.println("运用第5条规则：吃肉 ==> 食肉动物");
                        information.add("运用第5条规则：吃肉 ==> 食肉动物");
                    } else if (rules.getIndex()==6) {
                        System.out.println("运用第6条规则：有犬齿、有爪、眼盯着前方 ==> 食肉动物");
                        information.add("运用第6条规则：有犬齿、有爪、眼盯着前方 ==> 食肉动物");
                    }
                }
                else if(rules.getResult().equals("有蹄类动物")){
                    expertMapper.updateTrue24(rules.getResult());
                     if (rules.getIndex()==7) {
                        System.out.println("运用第7条规则：哺乳动物、有蹄 ==> 有蹄类动物");
                        information.add("运用第7条规则：哺乳动物、有蹄 ==> 有蹄类动物");
                    } else if (rules.getIndex()==8) {
                        System.out.println("运用第8条规则：哺乳动物、嚼反刍 ==> 有蹄类动物");
                        information.add("运用第8条规则：哺乳动物、嚼反刍 ==> 有蹄类动物");
                    }
                }
                else if(rules.getResult().equals("金钱豹") || rules.getResult().equals("虎") || rules.getResult().equals("长颈鹿") || rules.getResult().equals("斑马") || rules.getResult().equals("鸵鸟") || rules.getResult().equals("企鹅") || rules.getResult().equals("信天翁")){
                    if(rules.getIndex()==9){
                        System.out.println("运用第9条规则：哺乳动物、食肉动物、黄褐色的、有暗斑点 ==> 金钱豹");
                        System.out.println("推理结束");
                        information.add("运用第9条规则：哺乳动物、食肉动物、黄褐色的、有暗斑点 ==> 金钱豹");
                        information.add("推理结束");
                    } else if (rules.getIndex()==10) {
                        System.out.println("运用第10条规则：黄褐色的、哺乳动物、食肉动物、有黑色条纹 ==> 虎");
                        System.out.println("推理结束");
                        information.add("运用第10条规则：黄褐色的、哺乳动物、食肉动物、有黑色条纹 ==> 虎");
                        information.add("推理结束");
                    } else if (rules.getIndex()==11) {
                        System.out.println("运用第11条规则：有暗斑点、有长腿、有长脖子、有蹄类动物 ==> 长颈鹿");
                        System.out.println("推理结束");
                        information.add("运用第11条规则：有暗斑点、有长腿、有长脖子、有蹄类动物 ==> 长颈鹿");
                        information.add("推理结束");
                    } else if (rules.getIndex()==12) {
                        System.out.println("运用第12条规则：有蹄类动物、有黑色条纹 ==> 斑马");
                        System.out.println("推理结束");
                        information.add("运用第12条规则：有蹄类动物、有黑色条纹 ==> 斑马");
                        information.add("推理结束");
                    } else if (rules.getIndex()==13) {
                        System.out.println("运用第13条规则：鸟、有长脖子、不会飞 ==> 鸵鸟");
                        System.out.println("推理结束");
                        information.add("运用第13条规则：鸟、有长脖子、不会飞 ==> 鸵鸟");
                        information.add("推理结束");
                    } else if (rules.getIndex()==14) {
                        System.out.println("运用第14条规则：鸟、会游泳、不会飞、黑白两色 ==> 企鹅");
                        System.out.println("推理结束");
                        information.add("运用第14条规则：鸟、会游泳、不会飞、黑白两色 ==> 企鹅");
                        information.add("推理结束");
                    } else if (rules.getIndex()==15) {
                        System.out.println("运用第15条规则：鸟、善飞 ==> 信天翁");
                        System.out.println("推理结束");
                        information.add("运用第15条规则：鸟、善飞 ==> 信天翁");
                        information.add("推理结束");
                    }
                    return information;
                }
            }
        }
        System.out.println("经过规则对比，没有找到对应的动物！");
        System.out.println("推理结束");
        information.add("经过规则对比，没有找到对应的动物！");
        information.add("推理结束");
        return information;
        /*rulesList.forEach(rule->{

        });*/
    }

    @Override
    public TrueThing getAllTrueThing() {
        return expertMapper.getTrues();
    }
}
