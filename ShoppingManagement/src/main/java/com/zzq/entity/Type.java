package com.zzq.entity;
/**
 * 商品分类实体类
 * @author	张自权
 *@date2019年10月25日上午9:42:44
 *@version v1.0
 */
public class Type {
	private int id;//商品分类编号
	private String name;//商品分类名称
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
