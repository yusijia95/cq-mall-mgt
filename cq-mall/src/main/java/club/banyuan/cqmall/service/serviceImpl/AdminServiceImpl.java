package club.banyuan.cqmall.service.serviceImpl;

import club.banyuan.cqmall.common.ReqFailException;
import club.banyuan.cqmall.dao.UmsAdminDao;
import club.banyuan.cqmall.dao.UmsResourceDao;
import club.banyuan.cqmall.dao.entity.UmsAdmin;
import club.banyuan.cqmall.dao.entity.UmsResource;
import club.banyuan.cqmall.security.ResourceConfigAttribute;
import club.banyuan.cqmall.security.UmsAdminDetails;
import club.banyuan.cqmall.service.AdminService;
import club.banyuan.cqmall.service.TokenService;
import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AdminServiceImpl implements AdminService, UserDetailsService {
    @Autowired
    UmsAdminDao umsAdminDao;

    @Autowired
    UmsResourceDao umsResourceDao;

    @Autowired
    PasswordEncoder passwordEncoder;

    @Autowired
    TokenService tokenService;

    @Override
    public String login(String username, String password) {
        UmsAdmin umsAdmin = umsAdminDao.selectByUsername(username);
        if (passwordEncoder.matches(password,umsAdmin.getPassword())) {
            return tokenService.generateToken(username);
        }
        throw new ReqFailException("登录异常");
    }

    public UmsAdmin selectByUsername(String username) {
        return umsAdminDao.selectByUsername(username);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UmsAdmin umsAdmin = umsAdminDao.selectByUsername(username);
        List<UmsResource> umsResources = umsResourceDao.selectResourceByUsername(username);
        if (umsAdmin == null) {
            throw new UsernameNotFoundException("该用户不存在");
        }
        List<ResourceConfigAttribute> attributes = umsResources.stream()
                .map(ResourceConfigAttribute::new)
                .collect(Collectors.toList());
        return new UmsAdminDetails(umsAdmin, attributes);
    }
}
