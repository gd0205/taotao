package com.taotao.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.pojo.Item;
import com.taotao.manager.service.ItemService;

/**
* @author 作者 E-mail:
* @version 创建时间：2017年9月8日 下午9:11:08
* 类说明
*/
@Controller
@RequestMapping("item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(method = RequestMethod.POST)
	@ResponseBody
	public void saveItem(Item item,String desc){
		this.itemService.saveItem(item,desc);
	}
	
}
