package cn.com.microcent.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Administrator on 2017/4/25.
 */
@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(){
        return new ModelAndView("/index");
    }
}
