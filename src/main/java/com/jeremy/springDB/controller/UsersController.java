package com.jeremy.springDB.controller;

import com.jeremy.springDB.model.UsersEntity;
import com.jeremy.springDB.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Project: springDB
 * Package: com.jeremy.springDB.controller
 * <p>
 * User: jeremytouch
 * Date: 6/26/19
 * Time: 1:35 PM
 * <p>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@RestController
//@RequestMapping
public class UsersController {

    @Autowired
    UsersRepository usersRepository;

    @RequestMapping("/get")
    public List<UsersEntity> getAll(){
        return usersRepository.findAll();
    }

    @PostMapping(value = "/post")
    public List<UsersEntity> persist(@RequestBody final UsersEntity user){
        usersRepository.save(user);
        return usersRepository.findAll();
    }
}