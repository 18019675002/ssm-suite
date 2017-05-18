package com.ssm.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.config.dataSource.TargetDataSource;
import com.ssm.controllers.BaseApiController;
import com.ssm.mapper.GoodsMapper;
import com.ssm.mapper.MqGoodsMapper;
import com.ssm.model.APIResultModel;
import com.ssm.model.GoodsDetail;
import com.ssm.model.MqGoodsDetail;



@Service
public class MqGoodsService extends BaseApiController{
	@Autowired
	private GoodsMapper goodsMapper;
	@Autowired
	private MqGoodsMapper mqGoodsMapper;
	
	
	
	/**
	 * 根据商品条码和员工编号查询商品信息
	 * 查询主数据源 woms
	 */
	public APIResultModel selectGoodsInfoBycode(String productsn){
		//DynamicDataSourceContextHolder.setDataSourceType("ds1");
		APIResultModel result = new APIResultModel();
		List<GoodsDetail> goodsInfoList = new ArrayList<>();
		try {
			//判断条码是否为空
			if(productsn == null || productsn.isEmpty()){
				String msg = "为空";//this.messageSource.getMessage("ConstMessage.ITEMCODE_NULL", null, locale);
				result.setMessage(msg);
			}else{
				//判断条码是否存在
				goodsInfoList = goodsMapper.judgeGoodsIsExist(productsn);
				if(goodsInfoList==null || goodsInfoList.isEmpty() ){
					String msg = "有错";//this.messageSource.getMessage("ConstMessage.CODE_NOTEXIST", null, locale);
					result.setMessage(msg);
					result.setStatus("ConstMessage.CODE_NOTEXIST");
				}else{
					String msg = "无错";//this.messageSource.getMessage("ConstMessage.OP_SUCCESS", null, locale);
					result.setMessage(msg);
					result.setStatus("ConstMessage.OP_SUCCESS");
				}
				result.setDetail(goodsInfoList);
			}
		} catch (Exception e) {
			String msg = "异常";//this.messageSource.getMessage("ConstMessage.SYS_ERROR", null,locale);
			result.setMessage(msg);
			result.setMessage("ConstMessage.SYS_ERROR");
		}
		
		return result;
	}
	/**
	 * 根据商品条码和员工编号查询商品信息
	 * 查询另一数从属数据源 mq
	 */
	@TargetDataSource(name="dataSourceSlave")
	public APIResultModel findGoodsByUniacid(String uniacid){
		//DynamicDataSourceContextHolder.setDataSourceType(DatabaseType.ds1.toString());
		APIResultModel result = new APIResultModel();
		List<MqGoodsDetail> goodsInfoList = new ArrayList<>();
		try {
			goodsInfoList = mqGoodsMapper.findGoodsByUniacid(uniacid);
			if(goodsInfoList==null || goodsInfoList.isEmpty() ){
				String msg = "为空";//this.messageSource.getMessage("ConstMessage.CODE_NOTEXIST", null, locale);
				result.setMessage(msg);
				result.setStatus("ConstMessage.CODE_NOTEXIST");
			}else{
				String msg = "无错";//tthis.messageSource.getMessage("ConstMessage.OP_SUCCESS", null, locale);
				result.setMessage(msg);
				result.setStatus("ConstMessage.OP_SUCCESS");
			}
			result.setDetail(goodsInfoList);
			
		} catch (Exception e) {
			String msg = "异常";//tthis.messageSource.getMessage("ConstMessage.SYS_ERROR", null,locale);
			result.setMessage(msg);
			result.setMessage("ConstMessage.SYS_ERROR");
		}
		
		return result;
	}
}
