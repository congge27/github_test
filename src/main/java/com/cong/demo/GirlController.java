package com.cong.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GirlController {

    @Autowired
    public GirlReposiory girlReposiory;

    /**
     * 所有人
     * @return
     */
    @GetMapping(value = "/girls")
    public List<Girl> girlList(){
        return girlReposiory.findAll();
    }

    @PostMapping(value = "/girls")
    public String AddGirl(@RequestParam("cupSize") String cup,
                          @RequestParam("age") Integer age,
                          @RequestParam("name") String name){
        Girl girl = new Girl();
        girl.setAge(age);
        girl.setCupsize(cup);
        girl.setName(name);
        girlReposiory.save(girl);
        return girl.getName();

    }

    @GetMapping(value = "/findgirl/{id}")
    public Girl FindGirl(@PathVariable("id") Integer id){
        return girlReposiory.getOne(id);

    }
}
