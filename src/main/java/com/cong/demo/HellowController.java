package com.cong.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HellowController {

    @RequestMapping(value = "/hello/{id}", method = RequestMethod.GET)
    public String say(@PathVariable("id") Integer id){
        return "id = " + id;
    }

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String hi(@RequestParam(value = "id", defaultValue = "0", required = false) Integer id){
        return "id = " + id;
    }
}
