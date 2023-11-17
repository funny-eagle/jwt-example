package cn.funnyealge.jwt.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * @author yangjl
 * @description
 * @date 2023-11-15 13:34
 **/
@Service
public class JtwUserDetailService implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        if("funnyeagle".equals(username)){
            // username:funnyeagle password:funnyeagle bcrypt
            return new User("funnyeagle", "$2a$10$JQEWsaUWgp6zYk1cvLvHMuM6kcLbmAdWPrp9QCSNYswu.kFum9PIq", new ArrayList<>());
        }

        throw new UsernameNotFoundException("User not found with username:" + username);
    }
}
