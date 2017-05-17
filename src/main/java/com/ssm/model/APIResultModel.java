package com.ssm.model;

import lombok.Data;

/**
 * API返回数据类型
 * @author 袁友林
 * @date  2017年5月11日下午4:07:29
 *
 */
@Data
public class APIResultModel {
	
	private String status;
	private String message;
	private Object detail;
}
