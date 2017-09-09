package com.taotao.manager.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.manager.pojo.Item;
import com.taotao.manager.pojo.ItemDesc;
import com.taotao.manager.service.ItemDescService;
import com.taotao.manager.service.ItemService;

/**
* @author 作者 E-mail:
* @version 创建时间：2017年9月8日 下午8:33:04
* 类说明
*/
@Service
public class ItemServiceImpl extends BaseServiceImpl<Item> implements ItemService {

	@Autowired
	private ItemDescService itemDescService;
	
	@Override
	public void saveItem(Item item, String desc) {
		//保存上商品，上架状态status需要自己手动设置
		item.setStatus(1);
		super.save(item);
		
		//保存商品描述
		ItemDesc itemDesc = new ItemDesc();
		//设置商品描述表的主键ID为对应商品的ID值
		itemDesc.setItemId(item.getId());
		itemDesc.setItemDesc(desc);
		
		this.itemDescService.save(itemDesc);
	}


}
