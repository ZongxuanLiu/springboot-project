package com.ly.springboot.web;

import com.ly.springboot.module.ModelTree;
import com.ly.springboot.service.SysModelTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author ly
 * @date: 2020/8/4 14:43
 * @title:
 * @company:zjhcsoft
 * @description:
 */
@Controller
public class IndexController {
@Autowired
    private SysModelTreeService modelTreeService;

    @RequestMapping(value = "modelById")
    public @ResponseBody ModelTree queryModelById(){


        return new ModelTree();
    }


}
