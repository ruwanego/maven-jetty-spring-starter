package com.zuyezheng.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 
 * Redirect the root API path.
 * 
 * @author zuyezheng
 *
 */
@Controller
@RequestMapping("/")
public class RootController {
    
    @RequestMapping(method=RequestMethod.GET)
    public String get() {
        return "/";
    }
    
}
