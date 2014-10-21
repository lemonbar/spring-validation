package com.lemon.test;

import javax.validation.constraints.Size;

/**
 * Created by lemon on 2014/10/21.
 */
public class UserForm {
    @Size(max = 5, message = "最大长度为{max}")
    private String phone;

    @Size(min = 4, message = "最小长度为{min}")
    private String code;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
