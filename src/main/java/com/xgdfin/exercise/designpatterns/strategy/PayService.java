package com.xgdfin.exercise.designpatterns.strategy;

public interface PayService {
    PayResult epay(PayRequest request);

    String channel();
}
