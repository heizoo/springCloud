package com.hizoo.springcloud.controller;

import com.hizoo.springcloud.entities.CommonResult;
import com.hizoo.springcloud.entities.Payment;
import com.hizoo.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 订单controller
 *
 * @author hizoo
 * @create 2021-06-23-16:43
 */
@Slf4j
@RestController
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        CommonResult commonResult = new CommonResult();
        int result = paymentService.create(payment);
        log.info("插入结果："+result);
        if(result>0){
            commonResult.setCode(200);
            commonResult.setMessage("插入数据成功");
            commonResult.setData(result);
        }else{
            commonResult.setCode(500);
            commonResult.setMessage("插入数据失败");
            commonResult.setData(null);
        }
        return commonResult;
    }
    @GetMapping(value = "/payment/getPayment/{id}")
    public CommonResult getPaymentById(@PathVariable("id") long id){
        CommonResult commonResult = new CommonResult();
        Payment result = paymentService.getPaymentById(id);
        log.info("查询结果："+result);
        if(result != null){
            commonResult.setCode(200);
            commonResult.setMessage("查询数据成功");
            commonResult.setData(result);
        }else{
            commonResult.setCode(500);
            commonResult.setMessage("查询数据失败");
            commonResult.setData(null);
        }
        return commonResult;
    }
}
