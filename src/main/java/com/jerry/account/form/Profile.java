package com.jerry.account.form;

import com.jerry.domain.Account;
import lombok.Data;
import org.hibernate.validator.constraints.Length;

@Data
public class Profile {

    @Length(max = 35)
    private String bio;

    public Profile(Account account) {
        this.bio = account.getBio();
    }

}