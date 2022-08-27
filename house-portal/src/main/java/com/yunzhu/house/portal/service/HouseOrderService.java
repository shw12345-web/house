package com.yunzhu.house.portal.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.github.pagehelper.PageInfo;
import com.yunzhu.house.common.api.CommonResult;
import com.yunzhu.house.model.HouseOrder;
import com.yunzhu.house.portal.vo.HouseVo;

import java.util.Map;

/**
 * TODO
 *
 * @author DELL
 * @date 2022/8/25 11:39
 */
public interface HouseOrderService extends IService<HouseOrder> {


    CommonResult pay(Long orderNo, Integer userId, String path);
    CommonResult aliCallback(Map<String,String> params);
    CommonResult queryOrderPayStatus(Integer userId,Long orderNo);
    CommonResult createOrder(Integer userId,Integer shippingId);
    CommonResult<String> cancel(Integer userId,Long orderNo);
    CommonResult getOrderCartHouse(Integer userId);
    CommonResult<HouseVo> getOrderDetail(Integer userId, Long orderNo);
    CommonResult<PageInfo> getOrderList(Integer userId, int pageNum, int pageSize);

}
