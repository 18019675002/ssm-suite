package com.shark.ssm.models.sys.entity;

import lombok.Data;

/** 
 * @Description: TODO
 * @author Wangjie
 * @date 创建时间：2017年5月18日 下午11:11:37
 * @version 1.0
 * @since  
 */
@Data
public class Area {
	private static final long serialVersionUID = 1L;
	private String id; 	// 
	private int sort; 	// 
//	private Area parent;	// 父级编号
//	private String parentIds; // 所有父级编号
	private String code; 	// 区域编码
//	private String name; 	// 区域名称
//	private Integer sort;		// 排序
	private String type; 	// 区域类型（1：国家；2：省份、直辖市；3：地市；4：区县）
	
	public Area(){
		super();
		this.sort = 30;
	}

	public Area(String id){
		//super(id);
		this.id = id;
	}
}
