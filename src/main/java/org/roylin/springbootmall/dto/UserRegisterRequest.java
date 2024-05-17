package org.roylin.springbootmall.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class UserRegisterRequest {

    @NotBlank
    // 11-19
    @Email
    private String email;

    @NotBlank
    private String password;

}
