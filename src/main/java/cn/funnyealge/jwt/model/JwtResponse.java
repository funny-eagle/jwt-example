package cn.funnyealge.jwt.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author yangjl
 * @description
 * @date 2023-11-15 13:52
 **/
@Data
public class JwtResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String token;

    public JwtResponse(String token) {
        this.token = token;
    }
}
