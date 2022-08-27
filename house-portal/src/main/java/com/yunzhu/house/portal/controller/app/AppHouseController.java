package com.yunzhu.house.portal.controller.app;

import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.portal.controller.BaseController;
import com.yunzhu.house.portal.vo.LoginVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 房源信息
 *
 * @author DELL
 * @date 2022/8/6 15:27
 */

@Slf4j
@Controller
@Api(tags = "AppHouseController", description = "房源信息管理")
@RequestMapping("/house")
public class AppHouseController extends BaseController {



    @ApiOperation("创建房源")
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    @ResponseBody
    public CommonResult create(@RequestBody LoginVo productParam) {
        System.out.println(productParam);
//        int count = productService.create(productParam);
//        if (count > 0) {
//            return CommonResult.success(count);
//        } else {
//            return CommonResult.failed();
//        }
        return null;
    }



}
