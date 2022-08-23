package com.yunzhu.house.portal;

import com.yunzhu.house.mapper.SysUserMapper;
import com.yunzhu.house.model.SysUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Date;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/23 8:43
 */
@SpringBootTest
public class DemoTest {

    @Resource
    private SysUserMapper sysUserMapper;



    @Test
    public void demo(){
        SysUser sysUser=new SysUser();
        sysUser.setUserName("sihuawen");
        sysUser.setHeadimgUrl("http://image.jsp");
        sysUser.setPhone("18218089463");
        sysUser.setNickName("何时定");
        sysUser.setPassword("123456");
        sysUser.setEmail("13607044591@163.com");
        sysUser.setCreateTime(new Date());
        sysUser.setRealName("司华文");
        sysUser.setRole(1);
        System.out.println(sysUserMapper.insert(sysUser));
//        System.out.println(sysUserDao);
//        SysUser sysUser = sysUserDao.selectById(72L);
//        System.out.println(sysUser);

    }
}
