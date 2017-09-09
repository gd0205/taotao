package com.taotao.manager.service;

import java.util.List;

import com.taotao.manager.pojo.ItemCat;

/**
* @author 作者 E-mail:
* @version 创建时间：2017年9月6日 下午9:26:22
* 类说明
*/
public interface ItemCatService extends BaseService<ItemCat>{

	List<ItemCat> queryItemCatByParentId(Long parentId);

	//List<ItemCat> queryItemCatByPage(Integer page,Integer rows);
}
