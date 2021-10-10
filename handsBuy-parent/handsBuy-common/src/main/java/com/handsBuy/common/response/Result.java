package com.handsBuy.common.response;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
public class Result implements Serializable {

    private boolean success;

    private String message;

    public Result(boolean success, String message) {
        super();
        this.success = success;
        this.message = message;
    }
}
