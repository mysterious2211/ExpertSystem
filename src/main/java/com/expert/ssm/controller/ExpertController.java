package com.expert.ssm.controller;

import com.expert.ssm.pojo.TrueThing;
import com.expert.ssm.service.ExpertService;
import com.expert.ssm.service.impl.ExpertServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ExpertController {

    @Autowired
    private ExpertService expertService;

    @RequestMapping("expert/true")
    public String expertSystem(TrueThing trueThing, Model model){
        System.out.println(trueThing);
        List<String> information = expertService.expertSystem(trueThing);
        TrueThing trueThing1 = expertService.getAllTrueThing();
        model.addAttribute("trueThing",trueThing);
        model.addAttribute("trueThing1",trueThing1);
        model.addAttribute("information",information);
        int success = 1;
        model.addAttribute("successs",success);
//        information.clear();

        return "index";
    }
}
