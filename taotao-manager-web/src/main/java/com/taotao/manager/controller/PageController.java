package com.taotao.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @author 作者 E-mail:
* @version 创建时间：2017年9月7日 上午10:53:12
* 类说明
*/
@Controller
@RequestMapping("page")
public class PageController {
	
	
	/**
	 * 通用页面跳转方法
	 * @param pageName
	 * @return
	 */
	@RequestMapping("{pageName}")
	public String toPage(@PathVariable("pageName")String pageName){
		return pageName;
	}
	
}
