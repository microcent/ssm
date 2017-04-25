package cn.com.microcent.ssm.controller;

import cn.com.microcent.ssm.model.User;
import cn.com.microcent.ssm.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 2017/4/25.
 */
@RestController
@RequestMapping(value = "/home")
public class HomeController {

    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public List<User> index() {
        return repository.findAll();
    }
}
