package com.jerry.account.form;

import com.jerry.domain.Account;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Notifications {

    private boolean postCreatedByEmail;

    private boolean postCreatedByWeb;

    private boolean postCommentedByEmail;

    private boolean postCommentedByWeb;

    private boolean postLikedByEmail;

    private boolean postLikedByWeb;

    public Notifications(Account account) {
        this.postCreatedByEmail = account.isPostCreatedByEmail();
        this.postCreatedByWeb = account.isPostCreatedByWeb();
        this.postCommentedByEmail = account.isPostCommentedByEmail();
        this.postCommentedByWeb = account.isPostCommentedByWeb();
        this.postLikedByEmail = account.isPostLikedByEmail();
        this.postLikedByWeb = account.isPostLikedByWeb();
    }
}