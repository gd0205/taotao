package com.taotao.manager.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.pojo.ItemCat;
import com.taotao.manager.service.ItemCatService;

/**
* @author 作者 E-mail:
* @version 创建时间：2017年9月6日 下午9:31:46
* 类说明
*/
@Controller
@RequestMapping("item/cat")
public class ItemCatController {

	@Autowired
	private ItemCatService itemCatService;
	
	@RequestMapping("{page}")
	@ResponseBody
	public List<ItemCat> queryItemCatByPage(@PathVariable() Integer page,@RequestParam(value="row",defaultValue="10")Integer rows){
		
		return this.itemCatService.queryByPage(page, rows);
		//this.itemCatService.queryItemCatByPage(page, rows)
	}
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<ItemCat> queryItemByParentId(@RequestParam(value="id",defaultValue="0") Long parentId){
		List<ItemCat> list = this.itemCatService.queryItemCatByParentId(parentId);
		return list;
	}
	
}
