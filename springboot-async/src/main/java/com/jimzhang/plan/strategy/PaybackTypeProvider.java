package com.jimzhang.plan.strategy;

import com.queqiao.modules.test.plan.IPlanInitService;

import java.util.HashMap;
import java.util.Map;

/**
 * @className : PaybackTypeProvider
 * @description: 回款方式 策略提供者
 * @author: zhangjm
 * @create: 2020-03-16 17:39
 **/
public class PaybackTypeProvider {

    private Map<String, IPlanInitService> strategyMap = new HashMap();

    public IPlanInitService getStrategy(String payType) {
        return this.strategyMap.get(payType);
    }

    public Map<String, IPlanInitService> getStrategyMap() {
        return strategyMap;
    }
}
