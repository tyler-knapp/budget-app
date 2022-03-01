package com.philodelight.budgetingapp.model;

import java.time.LocalDateTime;

public class Subscriptions {
    
    String subscriptionName;
    LocalDateTime dueDate;
    Double subscriptionCost;
    
    public String getSubscriptionName() {
        return subscriptionName;
    }
    
    public void setSubscriptionName(String subscriptionName) {
        this.subscriptionName = subscriptionName;
    }
    
    public LocalDateTime getDueDate() {
        return dueDate;
    }
    
    public void setDueDate(LocalDateTime dueDate) {
        this.dueDate = dueDate;
    }
    
    public Double getSubscriptionCost() {
        return subscriptionCost;
    }
    
    public void setSubscriptionCost(Double subscriptionCost) {
        this.subscriptionCost = subscriptionCost;
    }
}
