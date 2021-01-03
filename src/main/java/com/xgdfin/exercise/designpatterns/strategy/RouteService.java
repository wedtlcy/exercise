package com.xgdfin.exercise.designpatterns.strategy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author chuanyin.li
 * @create 2020-11-21 23:27
 **/
@Service
public class RouteService {
    @Autowired
    Set<PayService> payServiceSet;

    Map<String, PayService> payServiceMap;

    public PayResult epay(PayRequest payRequest) {
        PayService payService = payServiceMap.get(payRequest.getChannelNo());
        return  payService.epay(payRequest);
    }

    @PostConstruct
    public void init() {
        for (PayService payService : payServiceSet) {
            payServiceMap = new HashMap<>();
            payServiceMap.put(payService.channel(), payService);
        }
    }
}
