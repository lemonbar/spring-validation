package com.lemon.test;

import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

/**
 * Created by lemon on 2014/10/21.
 */
public class UserForm {

    @NotBlank(message = "请输入手机号码")
    @Pattern(regexp = "^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$", message = "手机号码格式不对")
    private String phone;

    @NotBlank(message = "请输入验证码")
    @Pattern(regexp = "^\\d+$", message = "验证码只能包含数字")
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
