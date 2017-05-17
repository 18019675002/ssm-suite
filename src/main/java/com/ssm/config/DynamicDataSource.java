package com.ssm.config;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

//import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 动态数据源（需要继承AbstractRoutingDataSource）
 * @author	
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		// TODO Auto-generated method stub
		/**
         * DynamicDataSourceContextHolder代码中使用setDataSourceType
         * 设置当前的数据源，在路由类中使用getDataSourceType进行获取，
         * 交给AbstractRoutingDataSource进行注入使用。
         */
		return DynamicDataSourceContextHolder.getDataSourceType();
	}

}
