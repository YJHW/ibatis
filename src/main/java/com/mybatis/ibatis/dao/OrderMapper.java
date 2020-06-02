package com.mybatis.ibatis.dao;

import com.mybatis.ibatis.entity.Order;
import com.mybatis.ibatis.entity.OrderUser;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
     OrderUser queryOrderUserByOrderNumber(@Param("number") String number);


     /**
      * 根据订单号查询订单用户的信息
      * @param number
      * @return
      */
     Order queryOrderWithUserByOrderNumber(@Param("number") String number);



     /**
      * 根据订单号查询订单用户的信息及订单详情
      * @param number
      * @return
      */
     Order queryOrderWithUserAndDetailByOrderNumber(@Param("number") String number);


}
