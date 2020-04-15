package club.banyuan.cqmall.service;

import club.banyuan.cqmall.common.CommonPage;
import club.banyuan.cqmall.dao.entity.UmsAdmin;
import club.banyuan.cqmall.vo.AdminInfo;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface RoleService {

    CommonPage selectRoleList(Integer pageNum, Integer pageSize, String keyword);

    List<CommonPage> selectAllRoles();

    List<Long> selectRoleIdsByResourceIds(List<Long> resourceIds);
}
