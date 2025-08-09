package com.adacorp.task_managementV2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping(value = "/sbadminindex")
    public String getSbAdminIndex(){
        return "startbootstrap-sb-admin-gh-pages/index" ;
    }
}
