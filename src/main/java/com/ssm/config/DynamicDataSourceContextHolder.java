package com.ssm.config;

import java.util.ArrayList;
import java.util.List;

public class DynamicDataSourceContextHolder {
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
	/*
     * 管理所有的数据源id;
     * 主要是为了判断数据源是否存在;
     */
    public static  List<String> dataSourceIds = new ArrayList<String>();
    
    
    public List<String> getDataSourceIds() {
		return dataSourceIds;
	}

	public void setDataSourceIds(List<String> dataSourceIds) {
		this.dataSourceIds = dataSourceIds;
	}

	public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    public static String getDataSourceType() {
        return contextHolder.get();
    }

    public static void clearDataSourceType() {
        contextHolder.remove();
    }

    /**
     * 判断指定DataSrouce当前是否存在
     *
     * @param dataSourceId
     * @return	
     * @author	
     * @create	2017年5月15日
     */
    public static boolean containsDataSource(String dataSourceId){
        return dataSourceIds.contains(dataSourceId);
    }
}
