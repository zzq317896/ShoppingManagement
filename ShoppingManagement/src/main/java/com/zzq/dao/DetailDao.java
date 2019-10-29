package com.zzq.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.zzq.entity.Detail;

/**
 * 商品详细信息持久层接口
 * @author	张自权
 *@date2019年10月25日上午9:45:10
 *@version v1.0
 */
@Mapper
public interface DetailDao {
	/**
	 * 分页展示商品信息
	 * @param map
	 * @return
	 */
	List<Detail> getInfoByPage(Map map);
	/**
	 * 根据商品编号查询商品详细信息
	 * @param id 商品编号
	 * @return
	 */
	Detail getInfoById(int id);
	/**
	 * 获取总数量
	 * @return
	 */
	int getCount(Map map);
	/**
	 * 更新商品信息
	 * @param map
	 * @return
	 */
	int update(Map map);
}
