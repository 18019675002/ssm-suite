package com.shark.ssm.models.home.mapper;

import java.util.List;

import com.shark.ssm.models.home.entity.MqGoodsDetail;



public interface MqGoodsMapper {
	/**
	 * 判断该商品是否存在
	 * @param uniacid
	 * @return
	 */
	public List<MqGoodsDetail> findGoodsByUniacid(String uniacid);
}
