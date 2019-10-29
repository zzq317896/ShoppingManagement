package com.zzq.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.DetailDao;
import com.zzq.entity.Detail;
import com.zzq.util.PageUtil;

/**
 * 商品详细信息业务层
 * @author	张自权
 *@date2019年10月25日上午9:52:51
 *@version v1.0
 */
@Service
public class DetailService {
	@Autowired
	DetailDao dao;
	/**
	 * 分页查询商品记录
	 * @param currentPageNo 当前页
	 * @param pageSize 页面大小
	 * @param sortId 分类id
	 * @return
	 */
	public PageUtil<Detail> getInfoByPage(int currentPageNo, int pageSize,int sortId){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("currentPageNo", (currentPageNo-1)*pageSize);
		map.put("pageSize", pageSize);
		if (sortId!=0) {
			map.put("sortId", sortId);
		}
		List<Detail> list=dao.getInfoByPage(map);//当前页数据
		int rowCount=dao.getCount(map);//总记录数
		PageUtil<Detail> page=new PageUtil<Detail>();
		page.setCurrentInfo(list);
		page.setTotalCount(rowCount);
		page.setTotalPageCount((int)Math.ceil((double)rowCount/pageSize));
		return page;
	}
	
	public Detail getInfoById(int id){
		return dao.getInfoById(id);
	}
	
	public int update(int id,int num) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("id", id);
		map.put("num", num);
		return dao.update(map);
	}
}
