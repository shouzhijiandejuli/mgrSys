package com.guoMgr.system.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.util.Date;



/**
 * InnoDB free: 6144 kB
 * 
 * @author guocl
 * @email guoclhrl@163.com
 * @date 2017-10-17 11:22:52
 */
public class ProviderDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String uuid;
	//账户表ID
	private Integer accId;
	//电话号码
	private String tel;
	//密码
	private String password;
	//性别，M->男，F->女
	private String gender;
	//'发货地址'
	private String addressDetail;
	//真实地址
	private String realAddressDetail;
	//地区
	private String area;
	//地区详情
	private String areaDetail;
	//是否支持在线支付 Y：支持
	private String onlinePay;
	//
	private String remark;
	//身份: 0->未填写 1->一批商 2->二批商 3->大黄牛 4->小黄牛 5->加工厂 6->捕捞船东
	private Integer identity;
	//评价等级 0：无评价 1：优 2：中 3：差
	private Integer commentLevel;
	//创建时间
	private Date createTime;
	//修改时间
	private Date modifyTime;
	//1->'用户注册' 2->'系统自动创建'
	private Integer registerType;
	//1=>正常  2=>禁用
	private Integer status;
	//N=>正常 Y=>删除
	private String isDelete;
	//微信openid
	private String wxOpenid;
	//头像
	private String avatarPath;
	//主营品种
	private String mainCategory;
	//白名单用户（1:是，0:否）
	private Integer inWhiteList;
	//
	private String names;

	private byte[] name;
	//
	private String realName;
	//
	private String weixinName;
	//
	private String providerName;
	//
	private String realProviderName;

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
	 * 设置：
	 */
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}
	/**
	 * 获取：
	 */
	public String getUuid() {
		return uuid;
	}
	/**
	 * 设置：账户表ID
	 */
	public void setAccId(Integer accId) {
		this.accId = accId;
	}
	/**
	 * 获取：账户表ID
	 */
	public Integer getAccId() {
		return accId;
	}
	/**
	 * 设置：电话号码
	 */
	public void setTel(String tel) {
		this.tel = tel;
	}

	/**
	 * 获取：电话号码
	 */
	public String getTel() {
		return tel;
	}

	/**
	 * 设置：密码
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * 获取：密码
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * 设置：性别，M->男，F->女
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * 获取：性别，M->男，F->女
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * 设置：'发货地址'
	 */
	public void setAddressDetail(String addressDetail) {
		this.addressDetail = addressDetail;
	}
	/**
	 * 获取：'发货地址'
	 */
	public String getAddressDetail() {
		return addressDetail;
	}
	/**
	 * 设置：真实地址
	 */
	public void setRealAddressDetail(String realAddressDetail) {
		this.realAddressDetail = realAddressDetail;
	}
	/**
	 * 获取：真实地址
	 */
	public String getRealAddressDetail() {
		return realAddressDetail;
	}
	/**
	 * 设置：地区
	 */
	public void setArea(String area) {
		this.area = area;
	}
	/**
	 * 获取：地区
	 */
	public String getArea() {
		return area;
	}
	/**
	 * 设置：地区详情
	 */
	public void setAreaDetail(String areaDetail) {
		this.areaDetail = areaDetail;
	}
	/**
	 * 获取：地区详情
	 */
	public String getAreaDetail() {
		return areaDetail;
	}
	/**
	 * 设置：是否支持在线支付 Y：支持
	 */
	public void setOnlinePay(String onlinePay) {
		this.onlinePay = onlinePay;
	}
	/**
	 * 获取：是否支持在线支付 Y：支持
	 */
	public String getOnlinePay() {
		return onlinePay;
	}
	/**
	 * 设置：
	 */
	public void setRemark(String remark) {
		this.remark = remark;
	}
	/**
	 * 获取：
	 */
	public String getRemark() {
		return remark;
	}
	/**
	 * 设置：身份: 0->未填写 1->一批商 2->二批商 3->大黄牛 4->小黄牛 5->加工厂 6->捕捞船东
	 */
	public void setIdentity(Integer identity) {
		this.identity = identity;
	}
	/**
	 * 获取：身份: 0->未填写 1->一批商 2->二批商 3->大黄牛 4->小黄牛 5->加工厂 6->捕捞船东
	 */
	public Integer getIdentity() {
		return identity;
	}
	/**
	 * 设置：评价等级 0：无评价 1：优 2：中 3：差
	 */
	public void setCommentLevel(Integer commentLevel) {
		this.commentLevel = commentLevel;
	}
	/**
	 * 获取：评价等级 0：无评价 1：优 2：中 3：差
	 */
	public Integer getCommentLevel() {
		return commentLevel;
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
	 * 设置：修改时间
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	/**
	 * 获取：修改时间
	 */
	public Date getModifyTime() {
		return modifyTime;
	}
	/**
	 * 设置：1->'用户注册' 2->'系统自动创建'
	 */
	public void setRegisterType(Integer registerType) {
		this.registerType = registerType;
	}
	/**
	 * 获取：1->'用户注册' 2->'系统自动创建'
	 */
	public Integer getRegisterType() {
		return registerType;
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
	/**
	 * 设置：微信openid
	 */
	public void setWxOpenid(String wxOpenid) {
		this.wxOpenid = wxOpenid;
	}

	/**
	 * 获取：微信openid
	 */
	public String getWxOpenid() {
		return wxOpenid;
	}

	/**
	 * 设置：头像
	 */
	public void setAvatarPath(String avatarPath) {
		this.avatarPath = avatarPath;
	}
	/**
	 * 获取：头像
	 */
	public String getAvatarPath() {
		return avatarPath;
	}
	/**
	 * 设置：主营品种
	 */
	public void setMainCategory(String mainCategory) {
		this.mainCategory = mainCategory;
	}
	/**
	 * 获取：主营品种
	 */
	public String getMainCategory() {
		return mainCategory;
	}
	/**
	 * 设置：白名单用户（1:是，0:否）
	 */
	public void setInWhiteList(Integer inWhiteList) {
		this.inWhiteList = inWhiteList;
	}
	/**
	 * 获取：白名单用户（1:是，0:否）
	 */
	public Integer getInWhiteList() {
		return inWhiteList;
	}
	/**
	 * 设置：
	 */
	public void setNames(String names) {
		this.names = names;
	}

	/**
	 * 获取：
	 */
	public String getNames() {
		return names;
	}

	public byte[] getName() {
		return name;
	}

	public void setName(byte[] name) {
		this.name = name;
	}

	/**
	 * 设置：
	 */
	public void setRealName(String realName) {
		this.realName = realName;
	}
	/**
	 * 获取：
	 */
	public String getRealName() {
		return realName;
	}
	/**
	 * 设置：
	 */
	public void setWeixinName(String weixinName) {
		this.weixinName = weixinName;
	}
	/**
	 * 获取：
	 */
	public String getWeixinName() {
		return weixinName;
	}
	/**
	 * 设置：
	 */
	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}
	/**
	 * 获取：
	 */
	public String getProviderName() {
		return providerName;
	}
	/**
	 * 设置：
	 */
	public void setRealProviderName(String realProviderName) {
		this.realProviderName = realProviderName;
	}
	/**
	 * 获取：
	 */
	public String getRealProviderName() {
		return realProviderName;
	}
	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
