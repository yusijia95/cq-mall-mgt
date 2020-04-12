package club.banyuan.cqmall.service;

import club.banyuan.cqmall.dao.entity.UmsAdmin;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface AdminService {

    String login(String username, String password);

    UmsAdmin selectByUsername(String username);


    UserDetails loadUserByUsername(String username) throws UsernameNotFoundException;
}
