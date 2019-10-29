package com.zzq.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/**
 * 商品信息控制类
 * @author	张自权
 *@date2019年10月25日上午10:11:35
 *@version v1.0
 */
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.zzq.entity.Detail;
import com.zzq.entity.Type;
import com.zzq.service.DetailService;
import com.zzq.service.TypeService;
import com.zzq.util.PageUtil;
@Controller
public class GoodsController {
	@Autowired
	DetailService service;
	
	@Autowired
	TypeService tService;
	
	@RequestMapping("/GoodsList")
	public String queryAll(@RequestParam(defaultValue="1") int pageIndex, Model model,@RequestParam(defaultValue="0") int sortId) {
		PageUtil<Detail> list=service.getInfoByPage(pageIndex, 6,sortId);
		List<Type> types=tService.getAll();
		model.addAttribute("pager", list);
		model.addAttribute("info", types);
		model.addAttribute("sortId", sortId);
		return "goodsList";
	}
	@RequestMapping("add")
	public String add(int id,Model model) {
		Detail list=service.getInfoById(id);
		model.addAttribute("info",list);
		return "goodsAdd";
	}
	
	@RequestMapping("update") 
	public String update(@RequestParam int num,int id) {
		service.update(id, num);
		 return "redirect:GoodsList";
	}
}
