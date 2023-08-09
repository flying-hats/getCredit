package com.example.mapper;

import com.example.pojo.invoice;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface getcreditMapper {

    @Insert("insert into invoice(UserID,InvoiceCode,InvoiceNo,InvoiceType,Date,PurchaseName,ServiceName,SellerName,UpperCase,LowerCase,Status,CheckCode,Remark)" +
            " values(#{UserID},#{InvoiceCode},#{InvoiceNo},#{InvoiceType},#{Date,},#{PurchaseName},#{ServiceName},#{SellerName},#{UpperCase},#{LowerCase},#{Status},#{CheckCode},#{Remark})")
    void insert(invoice invoice);

    //UserID,InvoiceCode,InvoiceNo,InvoiceType,Date,PurchaseName,ServiceName,SellerName,UpperCase,LowerCase,Status,CheckCode,Remark
    //invoice.getUserID(),invoice.getIdInvoiceCode(),invoice.getInvoiceNo(),invoice.getInvoiceType(),invoice.getDate(),invoice.getPurchaseName(),
    // invoice.getServiceName(),invoice.getSellerName(),invoice.getUpperCase(),invoice.getLowerCase(),invoice.getStatus(),invoice.getCheckCode(),invoice.getRemark()
}
