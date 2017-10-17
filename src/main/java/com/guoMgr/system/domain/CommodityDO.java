package com.guoMgr.system.domain;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;



/**
 * InnoDB free: 8192 kB
 * 
 * @author guocl
 * @email guoclhrl@163.com
 * @date 2017-09-21 14:38:10
 */
public class CommodityDO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//
	private Integer id;
	//
	private String uuid;
	//商品名称
	private String name;
	//供应商ID
	private Integer providerId;
	//图片地址
	private String imgUrl;
	//规格
	private String specification;
	//文字说明
	private String summary;
	//当前商品报价
	private Float price;
	//
	private String isRemain;
	//剩余数量
	private BigDecimal remain;
	//发布过的库存
	private BigDecimal stocknum;
	//生产日期
	private Date productionDate;
	//出油率 1：极少 2：较少 3：较多
	private Integer oilRate;
	//白皮率 1：极少 2：较少 3：较多
	private Integer whiteRate;
	//外观程度 1：极好 2：较好 3：一般
	private Integer appearanceDegree;
	//解冻前件重(kg)
	private BigDecimal beforeThawing;
	//解冻后件重(kg)
	private BigDecimal afterThawing;
	//解冻后条数/件
	private Integer thawedNum;
	//验货日期
	private Date inspectionDate;
	//验货人
	private String examiner;
	//上架：Y 下架：N
	private String isOnline;
	//创建时间
	private Date createTime;
	//修改时间
	private Date modifyTime;
	//发布时间
	private Date publishTime;
	//是否发布
	private String publishStatus;
	//一级分类id
	private Integer commodityTypeOne;
	//二级分类id
	private Integer commodityTypeTwo;
	//货源
	private String produceArea;
	//1=>正常  2=>禁用
	private Integer status;
	//N=>正常 Y=>删除
	private String isDelete;
	//运营人员1
	private String opOne;
	//运营人员1电话
	private String opOneTel;
	//业务员1的ID，与业务员表ID关联
	private Integer opOneId;
	//运营人员2
	private String opTwo;
	//运营人员2电话
	private String opTwoTel;
	//业务员2的ID，与业务员表ID关联
	private Integer opTwoId;
	//商品编号
	private String code;
	//审核状态（1:待审核，2:审核通过，3:审核未通过）
	private Integer checkStatus;
	//厂商
	private Integer manufacturerId;
	//捕捞方式字段
	private String fishingStyle;
	//是否支持在线支付
	private String isAllowOnlinePay;
	//件重（kg/件）
	private String weight;
	//下架原因
	private String soldOutCause;

	private String checkStatusName;

	private String providerName;

	private String commodityTypeOneName;

	private String commodityTypeTwoName;



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
	 * 设置：商品名称
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：商品名称
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：供应商ID
	 */
	public void setProviderId(Integer providerId) {
		this.providerId = providerId;
	}
	/**
	 * 获取：供应商ID
	 */
	public Integer getProviderId() {
		return providerId;
	}
	/**
	 * 设置：图片地址
	 */
	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}
	/**
	 * 获取：图片地址
	 */
	public String getImgUrl() {
		return imgUrl;
	}
	/**
	 * 设置：规格
	 */
	public void setSpecification(String specification) {
		this.specification = specification;
	}
	/**
	 * 获取：规格
	 */
	public String getSpecification() {
		return specification;
	}
	/**
	 * 设置：文字说明
	 */
	public void setSummary(String summary) {
		this.summary = summary;
	}
	/**
	 * 获取：文字说明
	 */
	public String getSummary() {
		return summary;
	}
	/**
	 * 设置：当前商品报价
	 */
	public void setPrice(Float price) {
		this.price = price;
	}
	/**
	 * 获取：当前商品报价
	 */
	public Float getPrice() {
		return price;
	}
	/**
	 * 设置：
	 */
	public void setIsRemain(String isRemain) {
		this.isRemain = isRemain;
	}
	/**
	 * 获取：
	 */
	public String getIsRemain() {
		return isRemain;
	}
	/**
	 * 设置：剩余数量
	 */
	public void setRemain(BigDecimal remain) {
		this.remain = remain;
	}
	/**
	 * 获取：剩余数量
	 */
	public BigDecimal getRemain() {
		return remain;
	}
	/**
	 * 设置：发布过的库存
	 */
	public void setStocknum(BigDecimal stocknum) {
		this.stocknum = stocknum;
	}
	/**
	 * 获取：发布过的库存
	 */
	public BigDecimal getStocknum() {
		return stocknum;
	}
	/**
	 * 设置：生产日期
	 */
	public void setProductionDate(Date productionDate) {
		this.productionDate = productionDate;
	}
	/**
	 * 获取：生产日期
	 */
	public Date getProductionDate() {
		return productionDate;
	}
	/**
	 * 设置：出油率 1：极少 2：较少 3：较多
	 */
	public void setOilRate(Integer oilRate) {
		this.oilRate = oilRate;
	}
	/**
	 * 获取：出油率 1：极少 2：较少 3：较多
	 */
	public Integer getOilRate() {
		return oilRate;
	}
	/**
	 * 设置：白皮率 1：极少 2：较少 3：较多
	 */
	public void setWhiteRate(Integer whiteRate) {
		this.whiteRate = whiteRate;
	}
	/**
	 * 获取：白皮率 1：极少 2：较少 3：较多
	 */
	public Integer getWhiteRate() {
		return whiteRate;
	}
	/**
	 * 设置：外观程度 1：极好 2：较好 3：一般
	 */
	public void setAppearanceDegree(Integer appearanceDegree) {
		this.appearanceDegree = appearanceDegree;
	}
	/**
	 * 获取：外观程度 1：极好 2：较好 3：一般
	 */
	public Integer getAppearanceDegree() {
		return appearanceDegree;
	}
	/**
	 * 设置：解冻前件重(kg)
	 */
	public void setBeforeThawing(BigDecimal beforeThawing) {
		this.beforeThawing = beforeThawing;
	}
	/**
	 * 获取：解冻前件重(kg)
	 */
	public BigDecimal getBeforeThawing() {
		return beforeThawing;
	}
	/**
	 * 设置：解冻后件重(kg)
	 */
	public void setAfterThawing(BigDecimal afterThawing) {
		this.afterThawing = afterThawing;
	}
	/**
	 * 获取：解冻后件重(kg)
	 */
	public BigDecimal getAfterThawing() {
		return afterThawing;
	}
	/**
	 * 设置：解冻后条数/件
	 */
	public void setThawedNum(Integer thawedNum) {
		this.thawedNum = thawedNum;
	}
	/**
	 * 获取：解冻后条数/件
	 */
	public Integer getThawedNum() {
		return thawedNum;
	}
	/**
	 * 设置：验货日期
	 */
	public void setInspectionDate(Date inspectionDate) {
		this.inspectionDate = inspectionDate;
	}
	/**
	 * 获取：验货日期
	 */
	public Date getInspectionDate() {
		return inspectionDate;
	}
	/**
	 * 设置：验货人
	 */
	public void setExaminer(String examiner) {
		this.examiner = examiner;
	}
	/**
	 * 获取：验货人
	 */
	public String getExaminer() {
		return examiner;
	}
	/**
	 * 设置：上架：Y 下架：N
	 */
	public void setIsOnline(String isOnline) {
		this.isOnline = isOnline;
	}
	/**
	 * 获取：上架：Y 下架：N
	 */
	public String getIsOnline() {
		return isOnline;
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
	 * 设置：发布时间
	 */
	public void setPublishTime(Date publishTime) {
		this.publishTime = publishTime;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getPublishTime() {
		return publishTime;
	}
	/**
	 * 设置：是否发布
	 */
	public void setPublishStatus(String publishStatus) {
		this.publishStatus = publishStatus;
	}
	/**
	 * 获取：是否发布
	 */
	public String getPublishStatus() {
		return publishStatus;
	}
	/**
	 * 设置：一级分类id
	 */
	public void setCommodityTypeOne(Integer commodityTypeOne) {
		this.commodityTypeOne = commodityTypeOne;
	}
	/**
	 * 获取：一级分类id
	 */
	public Integer getCommodityTypeOne() {
		return commodityTypeOne;
	}
	/**
	 * 设置：二级分类id
	 */
	public void setCommodityTypeTwo(Integer commodityTypeTwo) {
		this.commodityTypeTwo = commodityTypeTwo;
	}
	/**
	 * 获取：二级分类id
	 */
	public Integer getCommodityTypeTwo() {
		return commodityTypeTwo;
	}
	/**
	 * 设置：货源
	 */
	public void setProduceArea(String produceArea) {
		this.produceArea = produceArea;
	}
	/**
	 * 获取：货源
	 */
	public String getProduceArea() {
		return produceArea;
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
	 * 设置：运营人员1
	 */
	public void setOpOne(String opOne) {
		this.opOne = opOne;
	}
	/**
	 * 获取：运营人员1
	 */
	public String getOpOne() {
		return opOne;
	}
	/**
	 * 设置：运营人员1电话
	 */
	public void setOpOneTel(String opOneTel) {
		this.opOneTel = opOneTel;
	}
	/**
	 * 获取：运营人员1电话
	 */
	public String getOpOneTel() {
		return opOneTel;
	}
	/**
	 * 设置：业务员1的ID，与业务员表ID关联
	 */
	public void setOpOneId(Integer opOneId) {
		this.opOneId = opOneId;
	}
	/**
	 * 获取：业务员1的ID，与业务员表ID关联
	 */
	public Integer getOpOneId() {
		return opOneId;
	}
	/**
	 * 设置：运营人员2
	 */
	public void setOpTwo(String opTwo) {
		this.opTwo = opTwo;
	}
	/**
	 * 获取：运营人员2
	 */
	public String getOpTwo() {
		return opTwo;
	}
	/**
	 * 设置：运营人员2电话
	 */
	public void setOpTwoTel(String opTwoTel) {
		this.opTwoTel = opTwoTel;
	}
	/**
	 * 获取：运营人员2电话
	 */
	public String getOpTwoTel() {
		return opTwoTel;
	}
	/**
	 * 设置：业务员2的ID，与业务员表ID关联
	 */
	public void setOpTwoId(Integer opTwoId) {
		this.opTwoId = opTwoId;
	}
	/**
	 * 获取：业务员2的ID，与业务员表ID关联
	 */
	public Integer getOpTwoId() {
		return opTwoId;
	}
	/**
	 * 设置：商品编号
	 */
	public void setCode(String code) {
		this.code = code;
	}
	/**
	 * 获取：商品编号
	 */
	public String getCode() {
		return code;
	}
	/**
	 * 设置：审核状态（1:待审核，2:审核通过，3:审核未通过）
	 */
	public void setCheckStatus(Integer checkStatus) {
		this.checkStatus = checkStatus;
	}
	/**
	 * 获取：审核状态（1:待审核，2:审核通过，3:审核未通过）
	 */
	public Integer getCheckStatus() {
		return checkStatus;
	}
	/**
	 * 设置：厂商
	 */
	public void setManufacturerId(Integer manufacturerId) {
		this.manufacturerId = manufacturerId;
	}
	/**
	 * 获取：厂商
	 */
	public Integer getManufacturerId() {
		return manufacturerId;
	}
	/**
	 * 设置：捕捞方式字段
	 */
	public void setFishingStyle(String fishingStyle) {
		this.fishingStyle = fishingStyle;
	}
	/**
	 * 获取：捕捞方式字段
	 */
	public String getFishingStyle() {
		return fishingStyle;
	}
	/**
	 * 设置：是否支持在线支付
	 */
	public void setIsAllowOnlinePay(String isAllowOnlinePay) {
		this.isAllowOnlinePay = isAllowOnlinePay;
	}
	/**
	 * 获取：是否支持在线支付
	 */
	public String getIsAllowOnlinePay() {
		return isAllowOnlinePay;
	}
	/**
	 * 设置：件重（kg/件）
	 */
	public void setWeight(String weight) {
		this.weight = weight;
	}
	/**
	 * 获取：件重（kg/件）
	 */
	public String getWeight() {
		return weight;
	}
	/**
	 * 设置：下架原因
	 */
	public void setSoldOutCause(String soldOutCause) {
		this.soldOutCause = soldOutCause;
	}
	/**
	 * 获取：下架原因
	 */
	public String getSoldOutCause() {
		return soldOutCause;
	}

	public String getProviderName() {
		return providerName;
	}

	public void setProviderName(String providerName) {
		this.providerName = providerName;
	}

	public String getCommodityTypeOneName() {
		return commodityTypeOneName;
	}

	public void setCommodityTypeOneName(String commodityTypeOneName) {
		this.commodityTypeOneName = commodityTypeOneName;
	}

	public String getCommodityTypeTwoName() {
		return commodityTypeTwoName;
	}

	public void setCommodityTypeTwoName(String commodityTypeTwoName) {
		this.commodityTypeTwoName = commodityTypeTwoName;
	}

	public String getCheckStatusName() {
		return checkStatusName;
	}

	public void setCheckStatusName(String checkStatusName) {
		this.checkStatusName = checkStatusName;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
}
