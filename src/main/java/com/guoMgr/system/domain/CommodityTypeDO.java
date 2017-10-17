package com.guoMgr.system.domain;

import java.io.Serializable;
import java.util.Date;



/**
 * InnoDB free: 6144 kB
 * 
 * @author guocl
 * @email guoclhrl@163.com
 * @date 2017-10-17 11:39:54
 */
public class CommodityTypeDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//类别名称
	private String name;
	//商品英文类型名
	private String enName;
	//创建时间
	private Date createTime;
	//上级ID
	private Integer parentId;
	//排序
	private Integer typeSort;
	//1=>正常  2=>禁用
	private Integer status;
	//N=>正常 Y=>删除
	private String isDelete;

	/**
	 * 设置：
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * 获取：
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * 设置：类别名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：类别名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：商品英文类型名
	 */
	public void setEnName(String enName) {
		this.enName = enName;
	}
	/**
	 * 获取：商品英文类型名
	 */
	public String getEnName() {
		return enName;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：上级ID
	 */
	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}
	/**
	 * 获取：上级ID
	 */
	public Integer getParentId() {
		return parentId;
	}
	/**
	 * 设置：排序
	 */
	public void setTypeSort(Integer typeSort) {
		this.typeSort = typeSort;
	}
	/**
	 * 获取：排序
	 */
	public Integer getTypeSort() {
		return typeSort;
	}
	/**
	 * 设置：1=>正常  2=>禁用
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}
	/**
	 * 获取：1=>正常  2=>禁用
	 */
	public Integer getStatus() {
		return status;
	}
	/**
	 * 设置：N=>正常 Y=>删除
	 */
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	/**
	 * 获取：N=>正常 Y=>删除
	 */
	public String getIsDelete() {
		return isDelete;
	}
}
