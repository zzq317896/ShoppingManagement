package com.zzq.entity;
/**
 * 商品详细信息实体类
 * @author	张自权
 *@date2019年10月25日上午9:41:35
 *@version v1.0
 */
public class Detail {
	private int id;//商品编号
	private Type type;//分类编号
	private String name;//商品名称
	private String address;//生产地址
	private double price;//单价
	private String createDate;//生产日期
	private int remaining;//库存
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getCreateDate() {
		return createDate;
	}
	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}
	public int getRemaining() {
		return remaining;
	}
	public void setRemaining(int remaining) {
		this.remaining = remaining;
	}
}
