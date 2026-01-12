package com.workintech.s18d4.dto;

import com.workintech.s18d4.entity.Customer;

public record AccountResponse(
        long id,
        String accountName,
        double moneyAmount,
        Customer customer
) {
    public AccountResponse(long id, String accountName, double moneyAmount) {
        this(id, accountName, moneyAmount, null);
    }
}
