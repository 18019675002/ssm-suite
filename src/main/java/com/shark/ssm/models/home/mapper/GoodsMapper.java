package com.shark.ssm.models.home.mapper;

import java.util.List;

import com.shark.ssm.models.home.entity.GoodsDetail;




	
public interface GoodsMapper {
	/**
	 * 判断该商品是否存在
	 * @param productsn
	 * @param employeecode
	 * @return
	 */
	public List<GoodsDetail> judgeGoodsIsExist(String productsn);
	
	
	
}
