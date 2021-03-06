package com.jimzhang.plan.strategy.debx;

import com.queqiao.modules.test.plan.IPlanInitService;
import com.queqiao.modules.test.plan.PlanInitService;
import com.queqiao.modules.test.plan.enums.PayTypeEnum;
import com.queqiao.modules.test.plan.model.CreditBaseParam;
import com.queqiao.modules.test.plan.model.PaybackPlan;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @className : DefaultDengBenDengXiPlanInitServiceImpl
 * @description: 默认还款方式：等额本息
 * @author: zhangjm
 * @create: 2020-03-16 18:00
 **/
@Service
public class DefaultDengBenDengXiPlanInitServiceImpl implements IPlanInitService {

    @Override
    public String getPaybackType() {
        return PayTypeEnum.DENG_E_BEN_XI.name();
    }

    @Override
    public List<PaybackPlan> getPlans(CreditBaseParam creditBaseParam) throws Exception {
        return null;
    }
}
