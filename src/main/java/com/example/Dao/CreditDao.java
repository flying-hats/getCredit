/*
package com.example.Dao;

import com.example.pojo.invoice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CreditDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void save(invoice invoice) {

        jdbcTemplate.update("insert into invoice values(?,?,?,?,?,?,?,?,?,?,?,?,?)",
                invoice.getUserID(),invoice.getIdInvoiceCode(),invoice.getInvoiceNo(),invoice.getInvoiceType(),invoice.getDate(),invoice.getPurchaseName(),invoice.getServiceName(),invoice.getSellerName(),invoice.getUpperCase(),invoice.getLowerCase(),invoice.getStatus(),invoice.getCheckCode(),invoice.getRemark());
    }

}
*/
