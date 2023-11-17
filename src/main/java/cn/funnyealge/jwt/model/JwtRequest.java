package cn.funnyealge.jwt.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yangjl
 * @description
 * @date 2023-11-15 13:50
 **/
@Data
public class JwtRequest implements Serializable {
    private static final long serialVersionUID = 1L;

    private String username;
    private String password;
}
