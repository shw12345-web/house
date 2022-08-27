package com.yunzhu.house.portal;

import com.yunzhu.house.mapper.SysUserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

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
    public void demo() {
//        SysUser sysUser = new SysUser();
//        sysUser.setUserName("sihuawen");
//        sysUser.setHeadimgUrl("http://image.jsp");
//        sysUser.setPhone("18218089466");
//        sysUser.setNickName("何时定");
//        sysUser.setPassword("123456");
//        sysUser.setEmail("13607044591@163.com");
//        sysUser.setCreateTime(new Date());
//        sysUser.setRealName("司华文");
//        sysUser.setRole(1);
//        sysUserMapper.insert(sysUser);
        List<String> list = Arrays.asList("1561953405000278018", "1561953405000278020");
        sysUserMapper.deleteBatchIds(list);

    }
}
