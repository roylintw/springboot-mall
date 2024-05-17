package org.roylin.springbootmall.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.Date;

@Data
public class User {

    private Integer userId;

    // 11-19
    @JsonProperty("e_mail")
    private String email;

    // 11-19
    @JsonIgnore // 轉換成 Json 格式時，忽略此欄位
    private String password;

    private Date createdDate;
    private Date lastModifiedDate;

}
