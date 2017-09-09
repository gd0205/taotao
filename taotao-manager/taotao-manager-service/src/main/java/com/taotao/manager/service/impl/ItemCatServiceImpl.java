package com.taotao.manager.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.taotao.manager.mapper.ItemCatMapper;
import com.taotao.manager.pojo.ItemCat;
import com.taotao.manager.service.ItemCatService;

/**
* @author 作者 E-mail:
* @version 创建时间：2017年9月6日 下午9:28:25
* 类说明
*/
@Service
public class ItemCatServiceImpl extends BaseServiceImpl<ItemCat> implements ItemCatService {

	@Override
	public List<ItemCat> queryItemCatByParentId(Long parentId) {
		//设置查询条件
		
		ItemCat param = new ItemCat();
		param.setParentId(parentId);
		
		List<ItemCat> queryListByWhere = super.queryListByWhere(param);
		return queryListByWhere;
	}
	
	/*@Autowired
	private ItemCatMapper itemCatMapper;*/

	/*@Override
	public List<ItemCat> queryItemCatByPage(Integer page, Integer rows) {
		//设置分页条件
		PageHelper.startPage(page, rows);
		//查询 TODO 难道是这里不加this造成的空指针异常--事实证明没关系
		List<ItemCat> list = this.itemCatMapper.select(null);
		return list;
	}*/
	
	

}
