package com.jimzhang.plan.strategy;

import com.queqiao.modules.test.plan.IPlanInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

/**
 * @className : PaybackTypeConfig
 * @description: 回款方式策略配置
 * @author: zhangjm
 * @create: 2020-03-16 18:19
 **/
@Configuration
public class PaybackTypeConfig {

    @Autowired
    private List<IPlanInitService> planInitServiceList;

    @Bean
    public PaybackTypeProvider initStrategyFactory(){
        PaybackTypeProvider strategyFactory = new PaybackTypeProvider();
        for (IPlanInitService planInitService : planInitServiceList) {
            strategyFactory.getStrategyMap().put(planInitService.getPaybackType(), planInitService);
        }

        return strategyFactory;
    }
}
