package com.jimzhang.plan.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>Title: credit_plan -  : Value Object</p>
 * <p/>
 * <p>Copyright: Copyright (c) 2017</p>
 * <p/>
 * <p>Company: zhenrongbao.com</p>
 *
 * @author vincent
 * @version 1.0
 * @date 2017-08-20
 */
public class PaybackPlan implements Serializable {

    /**
     * 应该回款总金额
     */
    private BigDecimal amount = null;
    /**
     * 应该回款本金
     */
    private BigDecimal principal = null;
    /**
     * 应该回款利息
     */
    private BigDecimal interest = null;

    private BigDecimal realAmount;

    private BigDecimal realPrincipal;

    private BigDecimal realInterest;

    private BigDecimal originRealAmount;

    private BigDecimal originRealPrincipal;

    private BigDecimal originRealInterest;

    /**
     * 应该回款日期
     */
    private Date dueDate = null;
    /**
     * 债权总期数
     */
    private Integer totalTerms = null;
    /**
     * 当前期数
     */
    private Integer currentTerm = null;

    /**
     * 当前期开始时间
     */
    private Long curTermStartDate;
    /**
     * 当前期结束时间
     */
    private Long curTermEndDate;
    /**
     * 每天应计提利息
     */
    private BigDecimal dailyProfit;
    /**
     * 当前期天数
     */
    private Integer curTermLoanLife;

    private BigDecimal termStartRemianPrincipal;

    private BigDecimal termEndRemainPrincipal;

    private BigDecimal realTermStartRemainPrincipal;

    private BigDecimal realTermEndRemainPrincipal;

    private Integer penaltyDays;

    private BigDecimal penaltyRate;

    private BigDecimal penaltyAmount;

    private BigDecimal realPenaltyAmount;

    /**
     * 应该回款总金额
     */
    private BigDecimal preAmount = null;
    /**
     * 应该回款本金
     */
    private BigDecimal prePrincipal = null;
    /**
     * 应该回款利息
     */
    private BigDecimal preInterest = null;

    private BigDecimal partnerFee;

    private BigDecimal warrantyFee;

    private BigDecimal compensationFee;

    public BigDecimal getCompensationFee() {
        return compensationFee;
    }

    public void setCompensationFee(BigDecimal compensationFee) {
        this.compensationFee = compensationFee;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public BigDecimal getPrincipal() {
        return principal;
    }

    public void setPrincipal(BigDecimal principal) {
        this.principal = principal;
    }

    public BigDecimal getInterest() {
        return interest;
    }

    public void setInterest(BigDecimal interest) {
        this.interest = interest;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Integer getTotalTerms() {
        return totalTerms;
    }

    public void setTotalTerms(Integer totalTerms) {
        this.totalTerms = totalTerms;
    }

    public Integer getCurrentTerm() {
        return currentTerm;
    }

    public void setCurrentTerm(Integer currentTerm) {
        this.currentTerm = currentTerm;
    }

    public Long getCurTermStartDate() {
        return curTermStartDate;
    }

    public void setCurTermStartDate(Long curTermStartDate) {
        this.curTermStartDate = curTermStartDate;
    }

    public Long getCurTermEndDate() {
        return curTermEndDate;
    }

    public void setCurTermEndDate(Long curTermEndDate) {
        this.curTermEndDate = curTermEndDate;
    }

    public BigDecimal getDailyProfit() {
        return dailyProfit;
    }

    public void setDailyProfit(BigDecimal dailyProfit) {
        this.dailyProfit = dailyProfit;
    }

    public Integer getCurTermLoanLife() {
        return curTermLoanLife;
    }

    public Integer getPenaltyDays() {
        return penaltyDays;
    }

    public void setPenaltyDays(Integer penaltyDays) {
        this.penaltyDays = penaltyDays;
    }

    public BigDecimal getPenaltyRate() {
        return penaltyRate;
    }

    public void setPenaltyRate(BigDecimal penaltyRate) {
        this.penaltyRate = penaltyRate;
    }

    public BigDecimal getPenaltyAmount() {
        return penaltyAmount;
    }

    public void setPenaltyAmount(BigDecimal penaltyAmount) {
        this.penaltyAmount = penaltyAmount;
    }

    public void setCurTermLoanLife(Integer curTermLoanLife) {
        this.curTermLoanLife = curTermLoanLife;
    }

    public BigDecimal getTermStartRemianPrincipal() {
        return termStartRemianPrincipal;
    }

    public void setTermStartRemianPrincipal(BigDecimal termStartRemianPrincipal) {
        this.termStartRemianPrincipal = termStartRemianPrincipal;
    }

    public BigDecimal getTermEndRemainPrincipal() {
        return termEndRemainPrincipal;
    }

    public void setTermEndRemainPrincipal(BigDecimal termEndRemainPrincipal) {
        this.termEndRemainPrincipal = termEndRemainPrincipal;
    }

    public BigDecimal getPreAmount() {
        return preAmount;
    }

    public void setPreAmount(BigDecimal preAmount) {
        this.preAmount = preAmount;
    }

    public BigDecimal getPrePrincipal() {
        return prePrincipal;
    }

    public void setPrePrincipal(BigDecimal prePrincipal) {
        this.prePrincipal = prePrincipal;
    }

    public BigDecimal getPreInterest() {
        return preInterest;
    }

    public void setPreInterest(BigDecimal preInterest) {
        this.preInterest = preInterest;
    }

    public BigDecimal getRealTermStartRemainPrincipal() {
        return realTermStartRemainPrincipal;
    }

    public void setRealTermStartRemainPrincipal(BigDecimal realTermStartRemainPrincipal) {
        this.realTermStartRemainPrincipal = realTermStartRemainPrincipal;
    }

    public BigDecimal getRealTermEndRemainPrincipal() {
        return realTermEndRemainPrincipal;
    }

    public void setRealTermEndRemainPrincipal(BigDecimal realTermEndRemainPrincipal) {
        this.realTermEndRemainPrincipal = realTermEndRemainPrincipal;
    }

    public BigDecimal getRealPenaltyAmount() {
        return realPenaltyAmount;
    }

    public void setRealPenaltyAmount(BigDecimal realPenaltyAmount) {
        this.realPenaltyAmount = realPenaltyAmount;
    }

    public BigDecimal getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    public BigDecimal getRealPrincipal() {
        return realPrincipal;
    }

    public void setRealPrincipal(BigDecimal realPrincipal) {
        this.realPrincipal = realPrincipal;
    }

    public BigDecimal getRealInterest() {
        return realInterest;
    }

    public void setRealInterest(BigDecimal realInterest) {
        this.realInterest = realInterest;
    }

    public BigDecimal getOriginRealAmount() {
        return originRealAmount;
    }

    public void setOriginRealAmount(BigDecimal originRealAmount) {
        this.originRealAmount = originRealAmount;
    }

    public BigDecimal getOriginRealPrincipal() {
        return originRealPrincipal;
    }

    public void setOriginRealPrincipal(BigDecimal originRealPrincipal) {
        this.originRealPrincipal = originRealPrincipal;
    }

    public BigDecimal getOriginRealInterest() {
        return originRealInterest;
    }

    public void setOriginRealInterest(BigDecimal originRealInterest) {
        this.originRealInterest = originRealInterest;
    }

    public BigDecimal getPartnerFee() {
        return partnerFee;
    }

    public void setPartnerFee(BigDecimal partnerFee) {
        this.partnerFee = partnerFee;
    }

    public BigDecimal getWarrantyFee() {
        return warrantyFee;
    }

    public void setWarrantyFee(BigDecimal warrantyFee) {
        this.warrantyFee = warrantyFee;
    }
}
