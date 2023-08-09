package com.example.controller;

import com.example.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditController {
        @Autowired
        CreditService creditService;

        @RequestMapping("/")
        @ResponseBody
        public String io()  {
            creditService.httpRequest();
            return "saved";
        }

}
