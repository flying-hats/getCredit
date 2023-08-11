package com.example.mapper;

import com.example.pojo.history;
import com.example.pojo.invoice;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface getcreditMapper {

    @Insert("insert into invoice(UserID,InvoiceCode,InvoiceNo,InvoiceType,Date,PurchaseName,ServiceName,SellerName,UpperCase,LowerCase,Status,CheckCode,Remark)" +
            " values(#{UserID},#{InvoiceCode},#{InvoiceNo},#{InvoiceType},#{Date},#{PurchaseName},#{ServiceName},#{SellerName},#{UpperCase},#{LowerCase},#{Status},#{CheckCode},#{Remark})")
    void insert(invoice invoice);
    @Insert("insert into history(UserID,InvoiceCode,InvoiceNo,Time) values (#{UserID},#{InvoiceCode},#{InvoiceNo},now())")
    void insert2(invoice history);

    @Select("select exists (SELECT * from invoice where UserID=#{UserId} and InvoiceCode=#{Code} and InvoiceNo=#{No});")
    public Integer selectId(String UserId, String Code, String No);

    //UserID,InvoiceCode,InvoiceNo,InvoiceType,Date,PurchaseName,ServiceName,SellerName,UpperCase,LowerCase,Status,CheckCode,Remark
    //invoice.getUserID(),invoice.getIdInvoiceCode(),invoice.getInvoiceNo(),invoice.getInvoiceType(),invoice.getDate(),invoice.getPurchaseName(),
    // invoice.getServiceName(),invoice.getSellerName(),invoice.getUpperCase(),invoice.getLowerCase(),invoice.getStatus(),invoice.getCheckCode(),invoice.getRemark()
}
