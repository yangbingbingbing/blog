package com.mff.blog.web;

import com.mff.blog.NotFoundException;
import org.hibernate.boot.jaxb.SourceType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    @GetMapping("/")
    public String index(){
       // int i=9/0;
        /*String blog = null;
        if(blog==null){
            throw new NotFoundException("blog不存在");
        }*/
        return"blog";
    }
}
