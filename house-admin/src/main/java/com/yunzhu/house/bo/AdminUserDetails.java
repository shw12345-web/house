package com.yunzhu.house.bo;

import com.yunzhu.house.model.Authority;
import com.yunzhu.house.model.SysUser;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * SpringSecurity需要的用户详情
 *
 * @author DELL
 * @date 2022/8/4 15:18
 */
public class AdminUserDetails implements UserDetails {

    //后台用户
    private SysUser umsAdmin;
    //拥有资源列表
    private List<Authority> resourceList;
    public AdminUserDetails(SysUser umsAdmin,List<Authority> resourceList) {
        this.umsAdmin = umsAdmin;
        this.resourceList = resourceList;
    }
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        //返回当前用户的角色
        return resourceList.stream()
                .map(role ->new SimpleGrantedAuthority(role.getId()+":"+role.getMenuName()))
                .collect(Collectors.toList());
    }

    @Override
    public String getPassword() {
        return umsAdmin.getPassword();
    }

    @Override
    public String getUsername() {
        return umsAdmin.getUserName();
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return umsAdmin.getStatus().equals(1);
    }
}
