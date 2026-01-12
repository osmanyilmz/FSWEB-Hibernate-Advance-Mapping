package com.workintech.s18d4.dto;

import com.workintech.s18d4.entity.Address;
import com.workintech.s18d4.entity.Account;

import java.util.List;

public record CustomerResponse(
        long id,
        String firstName,
        String lastName,
        String email,
        double salary,
        Address address,
        List<Account> accounts
) {
    public CustomerResponse(long id, String firstName, double salary) {
        this(id, firstName, "", "", salary, null, List.of());
    }
}
