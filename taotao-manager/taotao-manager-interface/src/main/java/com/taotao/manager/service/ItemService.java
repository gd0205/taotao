package com.taotao.manager.service;

import com.taotao.manager.pojo.Item;

/**
* @author 作者 E-mail:
* @version 创建时间：2017年9月8日 下午8:29:57
* 类说明
*/
public interface ItemService extends BaseService<Item> {

	void saveItem(Item item, String desc);

}
