package com.example.service;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.mapper.getcreditMapper;
import com.example.pojo.invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;

@Service
public class CreditService {

    @Autowired
    //CreditDao creditDao;
    private getcreditMapper getcreditMapper;

    public void httpRequest() {
        /*String apiPath = "https://yapi.pro/mock/43977/1234/user/getCredit";
        BufferedReader in = null;
        StringBuffer result = null;
        try {
            URL url = new URL(apiPath);
            //打开和url之间的连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Charset", "utf-8");
            connection.connect();
            result = new StringBuffer();
            //读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
            String result2 =  result.toString(); //返回json字符串*/



            //获取数据
            com.alibaba.fastjson.JSONObject jsonObject = JSON.parseObject(result2);
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            //遍历json集合，取出数据
            for (int i = 0; i < jsonArray.size(); i++) {
                JSONObject jsonObject2 = jsonArray.getJSONObject(i);
                invoice invoice = new invoice();
                invoice.setInvoiceCode(jsonObject2.get("InvoiceCode").toString());
                invoice.setUserID(jsonObject2.get("UserID").toString());
                invoice.setInvoiceNo(jsonObject2.get("InvoiceNo").toString());
                invoice.setInvoiceType(jsonObject2.get("InvoiceType").toString());
                invoice.setDate(LocalDate.parse(jsonObject2.get("Date").toString()));
                invoice.setPurchaseName(jsonObject2.get("PurchaseName").toString());
                invoice.setServiceName(jsonObject2.get("ServiceName").toString());
                invoice.setSellerName(jsonObject2.get("SellerName").toString());
                invoice.setUpperCase(jsonObject2.get("UpperCase").toString());
                invoice.setLowerCase(jsonObject2.get("LowerCase").toString());
                invoice.setStatus(jsonObject2.get("Status").toString());
                invoice.setCheckCode(jsonObject2.get("CheckCode").toString());
                if(jsonObject2.get("Remark")!=null){
                    invoice.setRemark(jsonObject2.get("Remark").toString());
                }
                else{
                    invoice.setRemark("null");
                };
                System.out.println("res: "+ invoice);
                getcreditMapper.insert(invoice);
            }
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }





}
