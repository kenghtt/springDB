package com.jeremy.springDB.controller;

import com.jeremy.springDB.Vo.Member;
import com.jeremy.springDB.model.UsersEntity;
import com.jeremy.springDB.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

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

    @Autowired
    Member member;

    @RequestMapping("/get")
    public List<UsersEntity> getAll() {
        return usersRepository.findAll();
    }

    @PostMapping(value = "/post")
    public List<UsersEntity> persist(@RequestBody final UsersEntity user) {
        usersRepository.save(user);
        return usersRepository.findAll();
    }

    @PostMapping(value = "/member")
    public void member(@RequestBody Member memberUser) {

        System.out.println("member: " + member);
        System.out.println("memberuser: " + memberUser);

        member = memberUser;


    }


    @RequestMapping("/quote")
    public void getQuote() {
        final String uri = "https://api.adviceslip.com/advice";
        RestTemplate restTemplate = new RestTemplate();

//        JSONObject result = restTemplate.getForObject(uri, JSONObject.class);


        String result = restTemplate.getForObject(uri, String.class);

        System.out.println(result);
    }

//    RestTemplate restTemplate = new RestTemplate();
//    Quote quote = restTemplate.getForObject("https://gturnquist-quoters.cfapps.io/api/random", Quote.class);
//        log.info(quote.toString());


}
