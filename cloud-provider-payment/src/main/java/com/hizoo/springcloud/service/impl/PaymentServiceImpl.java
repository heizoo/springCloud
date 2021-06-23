package com.hizoo.springcloud.service.impl;

import com.hizoo.springcloud.dao.PaymentDao;
import com.hizoo.springcloud.entities.Payment;
import com.hizoo.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 订单服务层实现
 *
 * @author hizoo
 * @create 2021-06-23-16:23
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;
    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(long id) {
        return paymentDao.getPaymentById(id);
    }
}
