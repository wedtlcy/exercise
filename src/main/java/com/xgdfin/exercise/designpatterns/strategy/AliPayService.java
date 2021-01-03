package com.xgdfin.exercise.designpatterns.strategy;

import org.springframework.stereotype.Service;

/**
 * @author chuanyin.li
 * @create 2020-11-21 23:29
 **/
@Service("aliPayService")
public class AliPayService implements PayService {
    @Override
    public PayResult epay(PayRequest request) {
        // 业务逻辑
        return new PayResult();
    }
    @Override
    public String channel() {
        return "alibaba";
    }
}
