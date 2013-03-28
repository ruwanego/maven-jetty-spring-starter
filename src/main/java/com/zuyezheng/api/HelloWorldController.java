package com.zuyezheng.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 
 * Just say hi.
 * 
 * @author zuyezheng
 *
 */
@Controller
@RequestMapping(value="/helloworld", produces="application/json")
public class HelloWorldController {

    @RequestMapping(method=RequestMethod.GET)
    public @ResponseBody String get() {
        return "Hello World!";
    }
    
}
