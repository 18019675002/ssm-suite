package com.ssm.mapper;

import java.util.List;

import com.ssm.model.MqGoodsDetail;


public interface MqGoodsMapper {
	/**
	 * 判断该商品是否存在
	 * @param uniacid
	 * @return
	 */
	public List<MqGoodsDetail> findGoodsByUniacid(String uniacid);
}
