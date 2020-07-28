package com.ly.springboot.web;

import com.ly.springboot.entity.ABC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author liuying
 */
@Controller
public class IndexController {
    @Value("${school.name}")
    private String schoolName;
    @Value("${websit}")
    private String websit;
    /**
     * 自定义配置文件映射到实体类
     */
    @Autowired
    private ABC abc;

    @RequestMapping(value = "say")
    public @ResponseBody String say(){
        return "Hello" + schoolName+", websit is " +websit;
    }

    @RequestMapping(value = "abc")
    public @ResponseBody
    String abc(){
        return "abc.name:"+abc.getName();
    }
}
