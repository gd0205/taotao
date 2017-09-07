package com.taotao.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.manager.service.TestService;

/**
* @author 作者 E-mail:
* @version 创建时间：2017年9月5日 上午11:37:17
* 类说明
*/
@Controller
@RequestMapping("test")
public class TestController {
	
	@Autowired
	private TestService testService;
	
	/**
	 * 查询当前时间
	 */
	@RequestMapping("date")
	@ResponseBody
	public String queryDate(){
		return this.testService.queryDate();
	}
}
