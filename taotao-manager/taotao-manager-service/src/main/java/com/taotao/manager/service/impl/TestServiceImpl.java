package com.taotao.manager.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.manager.mapper.TestMapper;
import com.taotao.manager.service.TestService;

/**
* @author 作者 E-mail:
* @version 创建时间：2017年9月5日 上午9:47:47
* 类说明
*/
@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestMapper testMapper;
	
	@Override
	public String queryDate() {
		return this.testMapper.queryDate();
	}

}
