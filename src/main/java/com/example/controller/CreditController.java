package com.example.controller;

import com.example.pojo.RequestData;
import com.example.service.APIClient;
import com.example.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;


@RestController
public class CreditController {
        @Autowired
        CreditService creditService;
        APIClient apiClient;

/*
        private String id;
        private String no;
        private String url="http://localhost:8080/getpost";
*/

        @RequestMapping("/jsonParam")
        @ResponseBody
        public String getcrdit() throws IOException {
            creditService.httpRequest();
            return "a";
        }

//        @RequestMapping ("/getpost")
//        @ResponseBody
//        public String Getpost(String id, Integer no)  {
//            System.out.println(id+":"+no);
//            this.id=id;
//            this.no=no;
//            return "OK";
//            }

  /*  @RequestMapping("/control")
    public void Control(){
        a=apiClient.postInfo(id, String.valueOf(no), url);

    }*/
}
