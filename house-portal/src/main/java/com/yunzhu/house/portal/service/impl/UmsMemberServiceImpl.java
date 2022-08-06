package com.yunzhu.house.portal.service.impl;

import com.yunzhu.house.model.UmsMember;
import com.yunzhu.house.portal.service.UmsMemberService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/6 11:29
 */
@Service
public class UmsMemberServiceImpl implements UmsMemberService {
    @Override
    public UmsMember getByUsername(String username) {
        return null;
    }

    @Override
    public UmsMember getById(Long id) {
        return null;
    }

    @Override
    public void register(String username, String password, String telephone, String authCode) {

    }

    @Override
    public String generateAuthCode(String telephone) {
        return null;
    }

    @Override
    public void updatePassword(String telephone, String password, String authCode) {

    }

    @Override
    public UmsMember getCurrentMember() {
        return null;
    }

    @Override
    public void updateIntegration(Long id, Integer integration) {

    }

    @Override
    public UserDetails loadUserByUsername(String username) {
        return null;
    }

    @Override
    public String login(String username, String password) {
        return null;
    }

    @Override
    public String refreshToken(String token) {
        return null;
    }
}
