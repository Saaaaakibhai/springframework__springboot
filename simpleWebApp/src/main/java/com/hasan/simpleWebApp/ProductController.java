package com.hasan.simpleWebApp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @RequestMapping("/mugdho")
    public String mugdho(){
        return "Mugdho is a good boy";
    }
    @RequestMapping("/hasan")
        public String hasan(){
            return "Yaaahh It all goes well hasan Vi";
        }

}
