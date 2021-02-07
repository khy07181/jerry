package com.jerry.account.form;

import lombok.Data;

@Data
public class Notifications {

    private boolean postCreatedByEmail;

    private boolean postCreatedByWeb;

    private boolean postCommentedByEmail;

    private boolean postCommentedByWeb;

    private boolean postLikedByEmail;

    private boolean postLikedByWeb;

}