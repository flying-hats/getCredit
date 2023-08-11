package com.example.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class invoice {

    private String UserID;
    private String InvoiceCode;
    private String InvoiceNo;
    private String InvoiceType;
    private LocalDate Date;
    private String PurchaseName;
    private String ServiceName;
    private String SellerName;
    private String UpperCase;
    private String LowerCase;
    private String Status;
    private String CheckCode;
    private String Remark;


}
