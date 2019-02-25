package com.yoon.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller // 컨트롤러 선언
@RequestMapping({"/", "homepage"})
public class HomeController {

    @RequestMapping(method=RequestMethod.GET) // /에 대한 GET 요청을 처리
    public String home(){
        return "home"; // 뷰 이름은 home
    }
}
