package com.shark.ssm.models.home.entity;

import java.io.Serializable;

import lombok.Data;

/**
 * 商品详情实体
* <p>Title: Detail</p>
* <p>Description: </p>
* <p>Company: </p> 
* @author wqd 
* @date 上午10:10:03
 */
@Data
public class GoodsDetail implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -11866423726379307L;
	
	private int id;
	
	private int uniacid;
	
	//商品状态
	private int status;
	
	//商品名称
	private String title;
	
	//商品图
	private String thumb;
	
	//商品单位
	private String unit;
	
	//商品详情
	private String content;
	
	//商品编号
	private String goodssn;
	
	//商品条码
	private String productsn;
	
	//商品原价
	private Double productprice;
	
	//商品现价
	private Double marketprice;
	
	//商品成本
	private Double costprice;
	
	//商品库存
	private int total;
	
	//商品分类
	private int distinguish;
}
