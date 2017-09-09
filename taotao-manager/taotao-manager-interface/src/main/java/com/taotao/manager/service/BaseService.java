package com.taotao.manager.service;

import java.util.List;

/**
* @author 作者 E-mail:
* @version 创建时间：2017年9月7日 下午2:36:39
* 类说明
*/
public interface BaseService<T> {
	
	
	/**
	 * 根据ID查询
	 * @param id
	 * @return
	 */
	T queryById(Long id);
	
	/**
	 * 查询所有
	 * @return
	 */
	List<T> queryAll();
	
	/**
	 * 根据条件查询数据条数
	 * @param t
	 * @return
	 */
	Integer queryCountByWhere(T t);
	
	/**
	 * 根据条件查询数据
	 * @param t
	 * @return
	 */
	List<T> queryListByWhere(T t);
	
	
	/**
	 * 分页查询
	 * @param page
	 * @param rows
	 * @return
	 */
	List<T> queryByPage(Integer page,Integer rows);
	
	
	/**
	 * 根据条件查询一条数据
	 * @param t
	 * @return
	 */
	T queryOne(T t);
	
	/**
	 * 新增
	 * @param t
	 */
	void save(T t);
	
	/**
	 * 通过主键更新
	 * @param t
	 */
	void updateById(T t);
	
	/**
	 * 根据主键id删除
	 * @param id
	 */
	void deleteById(Long id);
	
	/**
	 * 根据ids进行批量删除
	 * @param ids
	 */
	void deleteByIds(List<Object> ids); //数组和集合如何选择？Integer[]
	
	/**
	 * 新增，忽略空参数
	 * @param t
	 */
	void saveSelective(T t);
	
	/**
	 * 保存，忽略空参数
	 * @param t
	 */
	void updateByIdSelective(T t);
	
	
	
	
	
}
