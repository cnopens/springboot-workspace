package com.jimzhang.plan.model;

import com.queqiao.common.tool.DateUtil;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by vincent on 17/8/24.
 * 用于计算的公用参数
 */
public class CreditBaseParam {

    private Integer totalTerm;

    private BigDecimal amount;

    private BigDecimal rate;

    private BigDecimal realRate;//资产真实利率

    private Date investDate;

    private Date dueDate;

    /**
     * 1：算头不算尾 2：算尾不算头 3：算头又算尾（以上三种只适用一次还本付息的还款方式）
     * 4：对日还款 5.对日+1工作日还款 6.对日-1工作日还款（4-6：适用多期还款的还款方式）
     */
    private Integer profitCalculateType;

    private Integer curTerm;

    private Date endDate;

    private Integer daysOfYear = 365;

    private Integer fixedSettleDay;

    private String partner = null;

    private String creditId;

    private Integer precision = 16;

    /**
     * 标识是否为只生成回款计划不涉及库的写操作   0 涉及   1 不涉及
     */
    private Integer tag = 0;

    private boolean realRateFlag =false;

    private boolean isLoop  = false;

    /**
     * 是否最后一期（无参数意义，后写入用于后续判断）  是true 否false
     */
    private boolean isLastTerm = false;

    public Integer getTotalTerm() {
        return totalTerm;
    }

    public void setTotalTerm(Integer totalTerm) {
        this.totalTerm = totalTerm;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Date getInvestDate() {
        return investDate;
    }

    public void setInvestDate(Date investDate) {
        this.investDate = DateUtil.formatToDate(DateUtil.format(investDate, "yyyyMMdd"), "yyyyMMdd");
    }

    public Integer getProfitCalculateType() {
        return profitCalculateType;
    }

    public void setProfitCalculateType(Integer profitCalculateType) {
        this.profitCalculateType = profitCalculateType;
    }

    public Integer getCurTerm() {
        return curTerm;
    }

    public void setCurTerm(Integer curTerm) {
        this.curTerm = curTerm;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = DateUtil.formatToDate(DateUtil.format(dueDate, "yyyyMMdd"), "yyyyMMdd");
        ;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getDaysOfYear() {
        return daysOfYear;
    }

    public void setDaysOfYear(Integer daysOfYear) {
        this.daysOfYear = daysOfYear;
    }

    public Integer getFixedSettleDay() {
        return fixedSettleDay;
    }

    public void setFixedSettleDay(Integer fixedSettleDay) {
        this.fixedSettleDay = fixedSettleDay;
    }

    public String getPartner() {
        return partner;
    }

    public void setPartner(String partner) {
        this.partner = partner;
    }

    public String getCreditId() {
        return creditId;
    }

    public void setCreditId(String creditId) {
        this.creditId = creditId;
    }

    public Integer getPrecision() {
        return precision;
    }

    public void setPrecision(Integer precision) {
        this.precision = precision;
    }

    public Integer getTag() {
        return tag;
    }

    public void setTag(Integer tag) {
        this.tag = tag;
    }

    public BigDecimal getRealRate() {
        return realRate;
    }

    public void setRealRate(BigDecimal realRate) {
        this.realRate = realRate;
    }

    public boolean isRealRateFlag() {
        return realRateFlag;
    }

    public void setRealRateFlag(boolean realRateFlag) {
        this.realRateFlag = realRateFlag;
    }

    public boolean isLastTerm() {
        return isLastTerm;
    }

    public void setLastTerm(boolean lastTerm) {
        isLastTerm = lastTerm;
    }

    public boolean isLoop() {
        return isLoop;
    }

    public void setLoop(boolean loop) {
        isLoop = loop;
    }
}
