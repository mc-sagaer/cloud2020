package com.huifeng.springcloud.dao;


import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import com.huifeng.springcloud.entities.Payment;

/**
 * @auther zzyy
 * @create 2020-02-18 10:27
 */
@Mapper
public interface PaymentDao
{
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") Long id);
}
