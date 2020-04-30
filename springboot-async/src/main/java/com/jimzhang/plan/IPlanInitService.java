package com.jimzhang.plan;

import com.queqiao.modules.test.plan.model.CreditBaseParam;
import com.queqiao.modules.test.plan.model.PaybackPlan;

import java.util.List;


public interface IPlanInitService {

    String getPaybackType() ;

    /**
     * 获得回款计划
     * @param creditBaseParam
     * @return
     * @throws Exception
     */
    List<PaybackPlan> getPlans(CreditBaseParam creditBaseParam) throws Exception;

}
