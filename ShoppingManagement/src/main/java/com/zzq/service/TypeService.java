package com.zzq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zzq.dao.TypeDao;
import com.zzq.entity.Type;


/**
 * 商品分类信息业务层
 * @author	张自权
 *@date2019年10月25日上午9:53:38
 *@version v1.0
 */
@Service
public class TypeService {
	@Autowired
	TypeDao dao;
	
	public List<Type> getAll(){
		return dao.getAll();
	}
	
	public List<Type> getInfoById(int id){
		return dao.getInfoById(id);
	}
}
