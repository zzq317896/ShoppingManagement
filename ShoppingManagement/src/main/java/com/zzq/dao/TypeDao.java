package com.zzq.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.zzq.entity.Type;

/**
 * 商品分类信息持久层接口
 * @author	张自权
 *@date2019年10月25日上午9:46:47
 *@version v1.0
 */
@Mapper
public interface TypeDao {
	/**
	 * 获取所有商品分类
	 * @return
	 */
	List<Type> getAll();
	/**
	 * 根据商品分类编号查询商品分类信息
	 * @param id 商品分类编号
	 * @return
	 */
	List<Type> getInfoById(int id);
}
