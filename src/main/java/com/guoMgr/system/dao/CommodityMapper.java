package com.guoMgr.system.dao;


import java.util.List;
import java.util.Map;

import com.guoMgr.system.domain.CommodityDO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
/**
 * InnoDB free: 8192 kB
 * 
 * @author guocl
 * @email guoclhrl@163.com
 * @date 2017-09-21 14:38:10
 */
@Mapper
public interface CommodityMapper {
	//case when sp.IsOffStatus=1 then '上架' else '下架' END isOffStatus
	@Select("select id, uuid, name, provider_id, img_url, specification, summary, price, is_remain, remain, stockNum, production_date, oil_rate, white_rate, appearance_degree, before_thawing, after_thawing, thawed_num, inspection_date, examiner, case when is_online='Y' then '上架' else '下架' END is_online, create_time, modify_time, publish_time, case when publish_status='Y' then '已发布' else '未发布' END publish_status, commodity_type_one, commodity_type_two, produce_area, status, case when is_delete='N' then '正常'  else '删除' END is_delete, op_one, op_one_tel, op_one_id, op_two, op_two_tel, op_two_id, code, check_status,manufacturer_id, fishing_style, case when check_status='Y' then '线上'  else '线下' END is_allow_online_pay, weight, sold_out_cause from tb_commodity where id = #{id}")
	CommodityDO get(Integer id);
	
	@Select("<script>" +
	"select id, uuid, name, provider_id, img_url, specification, summary, price, is_remain, remain, stockNum, production_date, oil_rate, white_rate, appearance_degree, before_thawing, after_thawing, thawed_num, inspection_date, examiner, case when is_online='Y' then '上架' else '下架' END is_online, create_time, modify_time, publish_time, case when publish_status='Y' then '已发布' else '未发布' END publish_status, commodity_type_one, commodity_type_two, produce_area, status, is_delete, op_one, op_one_tel, op_one_id, op_two, op_two_tel, op_two_id, code, check_status, manufacturer_id, fishing_style, case when is_allow_online_pay='Y' then '线上'  else '线下' END is_allow_online_pay, weight, sold_out_cause from tb_commodity " +
			"<where>" + 
		  		  "<if test=\"id != null and id != ''\">"+ "and id = #{id} " + "</if>" + 
		  		  "<if test=\"uuid != null and uuid != ''\">"+ "and uuid = #{uuid} " + "</if>" + 
		  		  "<if test=\"name != null and name != ''\">"+ "and name = #{name} " + "</if>" + 
		  		  "<if test=\"providerId != null and providerId != ''\">"+ "and provider_id = #{providerId} " + "</if>" + 
		  		  "<if test=\"imgUrl != null and imgUrl != ''\">"+ "and img_url = #{imgUrl} " + "</if>" + 
		  		  "<if test=\"specification != null and specification != ''\">"+ "and specification = #{specification} " + "</if>" + 
		  		  "<if test=\"summary != null and summary != ''\">"+ "and summary = #{summary} " + "</if>" + 
		  		  "<if test=\"price != null and price != ''\">"+ "and price = #{price} " + "</if>" + 
		  		  "<if test=\"isRemain != null and isRemain != ''\">"+ "and is_remain = #{isRemain} " + "</if>" + 
		  		  "<if test=\"remain != null and remain != ''\">"+ "and remain = #{remain} " + "</if>" + 
		  		  "<if test=\"stocknum != null and stocknum != ''\">"+ "and stockNum = #{stocknum} " + "</if>" + 
		  		  "<if test=\"productionDate != null and productionDate != ''\">"+ "and production_date = #{productionDate} " + "</if>" + 
		  		  "<if test=\"oilRate != null and oilRate != ''\">"+ "and oil_rate = #{oilRate} " + "</if>" + 
		  		  "<if test=\"whiteRate != null and whiteRate != ''\">"+ "and white_rate = #{whiteRate} " + "</if>" + 
		  		  "<if test=\"appearanceDegree != null and appearanceDegree != ''\">"+ "and appearance_degree = #{appearanceDegree} " + "</if>" + 
		  		  "<if test=\"beforeThawing != null and beforeThawing != ''\">"+ "and before_thawing = #{beforeThawing} " + "</if>" + 
		  		  "<if test=\"afterThawing != null and afterThawing != ''\">"+ "and after_thawing = #{afterThawing} " + "</if>" + 
		  		  "<if test=\"thawedNum != null and thawedNum != ''\">"+ "and thawed_num = #{thawedNum} " + "</if>" + 
		  		  "<if test=\"inspectionDate != null and inspectionDate != ''\">"+ "and inspection_date = #{inspectionDate} " + "</if>" + 
		  		  "<if test=\"examiner != null and examiner != ''\">"+ "and examiner = #{examiner} " + "</if>" + 
		  		  "<if test=\"isOnline != null and isOnline != ''\">"+ "and is_online = #{isOnline} " + "</if>" + 
		  		  "<if test=\"createTime != null and createTime != ''\">"+ "and create_time = #{createTime} " + "</if>" + 
		  		  "<if test=\"modifyTime != null and modifyTime != ''\">"+ "and modify_time = #{modifyTime} " + "</if>" + 
		  		  "<if test=\"publishTime != null and publishTime != ''\">"+ "and publish_time = #{publishTime} " + "</if>" + 
		  		  "<if test=\"publishStatus != null and publishStatus != ''\">"+ "and publish_status = #{publishStatus} " + "</if>" + 
		  		  "<if test=\"commodityTypeOne != null and commodityTypeOne != ''\">"+ "and commodity_type_one = #{commodityTypeOne} " + "</if>" + 
		  		  "<if test=\"commodityTypeTwo != null and commodityTypeTwo != ''\">"+ "and commodity_type_two = #{commodityTypeTwo} " + "</if>" + 
		  		  "<if test=\"produceArea != null and produceArea != ''\">"+ "and produce_area = #{produceArea} " + "</if>" + 
		  		  "<if test=\"status != null and status != ''\">"+ "and status = #{status} " + "</if>" + 
		  		  "<if test=\"isDelete != null and isDelete != ''\">"+ "and is_delete = #{isDelete} " + "</if>" + 
		  		  "<if test=\"opOne != null and opOne != ''\">"+ "and op_one = #{opOne} " + "</if>" + 
		  		  "<if test=\"opOneTel != null and opOneTel != ''\">"+ "and op_one_tel = #{opOneTel} " + "</if>" + 
		  		  "<if test=\"opOneId != null and opOneId != ''\">"+ "and op_one_id = #{opOneId} " + "</if>" + 
		  		  "<if test=\"opTwo != null and opTwo != ''\">"+ "and op_two = #{opTwo} " + "</if>" + 
		  		  "<if test=\"opTwoTel != null and opTwoTel != ''\">"+ "and op_two_tel = #{opTwoTel} " + "</if>" + 
		  		  "<if test=\"opTwoId != null and opTwoId != ''\">"+ "and op_two_id = #{opTwoId} " + "</if>" + 
		  		  "<if test=\"code != null and code != ''\">"+ "and code = #{code} " + "</if>" + 
		  		  "<if test=\"checkStatus != null and checkStatus != ''\">"+ "and check_status = #{checkStatus} " + "</if>" + 
		  		  "<if test=\"manufacturerId != null and manufacturerId != ''\">"+ "and manufacturer_id = #{manufacturerId} " + "</if>" + 
		  		  "<if test=\"fishingStyle != null and fishingStyle != ''\">"+ "and fishing_style = #{fishingStyle} " + "</if>" + 
		  		  "<if test=\"isAllowOnlinePay != null and isAllowOnlinePay != ''\">"+ "and is_allow_online_pay = #{isAllowOnlinePay} " + "</if>" + 
		  		  "<if test=\"weight != null and weight != ''\">"+ "and weight = #{weight} " + "</if>" + 
		  		  "<if test=\"soldOutCause != null and soldOutCause != ''\">"+ "and sold_out_cause = #{soldOutCause} " + "</if>" + 
		  			"</where>"+ 
			" <choose>" + 
	            "<when test=\"sort != null and sort.trim() != ''\">" + 
	                "order by ${sort} ${order}" + 
	            "</when>" + 
				"<otherwise>" + 
	                "order by modify_time desc" +
				"</otherwise>" + 
	        "</choose>"+
			"<if test=\"offset != null and limit != null\">"+
			"limit #{offset}, #{limit}" + 
			"</if>"+
			"</script>")
	List<CommodityDO> list(Map<String, Object> map);
	
	@Select("<script>" +
	"select count(*) from tb_commodity " + 
			"<where>" + 
		  		  "<if test=\"id != null and id != ''\">"+ "and id = #{id} " + "</if>" + 
		  		  "<if test=\"uuid != null and uuid != ''\">"+ "and uuid = #{uuid} " + "</if>" + 
		  		  "<if test=\"name != null and name != ''\">"+ "and name = #{name} " + "</if>" + 
		  		  "<if test=\"providerId != null and providerId != ''\">"+ "and provider_id = #{providerId} " + "</if>" + 
		  		  "<if test=\"imgUrl != null and imgUrl != ''\">"+ "and img_url = #{imgUrl} " + "</if>" + 
		  		  "<if test=\"specification != null and specification != ''\">"+ "and specification = #{specification} " + "</if>" + 
		  		  "<if test=\"summary != null and summary != ''\">"+ "and summary = #{summary} " + "</if>" + 
		  		  "<if test=\"price != null and price != ''\">"+ "and price = #{price} " + "</if>" + 
		  		  "<if test=\"isRemain != null and isRemain != ''\">"+ "and is_remain = #{isRemain} " + "</if>" + 
		  		  "<if test=\"remain != null and remain != ''\">"+ "and remain = #{remain} " + "</if>" + 
		  		  "<if test=\"stocknum != null and stocknum != ''\">"+ "and stockNum = #{stocknum} " + "</if>" + 
		  		  "<if test=\"productionDate != null and productionDate != ''\">"+ "and production_date = #{productionDate} " + "</if>" + 
		  		  "<if test=\"oilRate != null and oilRate != ''\">"+ "and oil_rate = #{oilRate} " + "</if>" + 
		  		  "<if test=\"whiteRate != null and whiteRate != ''\">"+ "and white_rate = #{whiteRate} " + "</if>" + 
		  		  "<if test=\"appearanceDegree != null and appearanceDegree != ''\">"+ "and appearance_degree = #{appearanceDegree} " + "</if>" + 
		  		  "<if test=\"beforeThawing != null and beforeThawing != ''\">"+ "and before_thawing = #{beforeThawing} " + "</if>" + 
		  		  "<if test=\"afterThawing != null and afterThawing != ''\">"+ "and after_thawing = #{afterThawing} " + "</if>" + 
		  		  "<if test=\"thawedNum != null and thawedNum != ''\">"+ "and thawed_num = #{thawedNum} " + "</if>" + 
		  		  "<if test=\"inspectionDate != null and inspectionDate != ''\">"+ "and inspection_date = #{inspectionDate} " + "</if>" + 
		  		  "<if test=\"examiner != null and examiner != ''\">"+ "and examiner = #{examiner} " + "</if>" + 
		  		  "<if test=\"isOnline != null and isOnline != ''\">"+ "and is_online = #{isOnline} " + "</if>" + 
		  		  "<if test=\"createTime != null and createTime != ''\">"+ "and create_time = #{createTime} " + "</if>" + 
		  		  "<if test=\"modifyTime != null and modifyTime != ''\">"+ "and modify_time = #{modifyTime} " + "</if>" + 
		  		  "<if test=\"publishTime != null and publishTime != ''\">"+ "and publish_time = #{publishTime} " + "</if>" + 
		  		  "<if test=\"publishStatus != null and publishStatus != ''\">"+ "and publish_status = #{publishStatus} " + "</if>" + 
		  		  "<if test=\"commodityTypeOne != null and commodityTypeOne != ''\">"+ "and commodity_type_one = #{commodityTypeOne} " + "</if>" + 
		  		  "<if test=\"commodityTypeTwo != null and commodityTypeTwo != ''\">"+ "and commodity_type_two = #{commodityTypeTwo} " + "</if>" + 
		  		  "<if test=\"produceArea != null and produceArea != ''\">"+ "and produce_area = #{produceArea} " + "</if>" + 
		  		  "<if test=\"status != null and status != ''\">"+ "and status = #{status} " + "</if>" + 
		  		  "<if test=\"isDelete != null and isDelete != ''\">"+ "and is_delete = #{isDelete} " + "</if>" + 
		  		  "<if test=\"opOne != null and opOne != ''\">"+ "and op_one = #{opOne} " + "</if>" + 
		  		  "<if test=\"opOneTel != null and opOneTel != ''\">"+ "and op_one_tel = #{opOneTel} " + "</if>" + 
		  		  "<if test=\"opOneId != null and opOneId != ''\">"+ "and op_one_id = #{opOneId} " + "</if>" + 
		  		  "<if test=\"opTwo != null and opTwo != ''\">"+ "and op_two = #{opTwo} " + "</if>" + 
		  		  "<if test=\"opTwoTel != null and opTwoTel != ''\">"+ "and op_two_tel = #{opTwoTel} " + "</if>" + 
		  		  "<if test=\"opTwoId != null and opTwoId != ''\">"+ "and op_two_id = #{opTwoId} " + "</if>" + 
		  		  "<if test=\"code != null and code != ''\">"+ "and code = #{code} " + "</if>" + 
		  		  "<if test=\"checkStatus != null and checkStatus != ''\">"+ "and check_status = #{checkStatus} " + "</if>" + 
		  		  "<if test=\"manufacturerId != null and manufacturerId != ''\">"+ "and manufacturer_id = #{manufacturerId} " + "</if>" + 
		  		  "<if test=\"fishingStyle != null and fishingStyle != ''\">"+ "and fishing_style = #{fishingStyle} " + "</if>" + 
		  		  "<if test=\"isAllowOnlinePay != null and isAllowOnlinePay != ''\">"+ "and is_allow_online_pay = #{isAllowOnlinePay} " + "</if>" + 
		  		  "<if test=\"weight != null and weight != ''\">"+ "and weight = #{weight} " + "</if>" + 
		  		  "<if test=\"soldOutCause != null and soldOutCause != ''\">"+ "and sold_out_cause = #{soldOutCause} " + "</if>" + 
		  			"</where>"+ 
			"</script>")
	int count(Map<String, Object> map);
	
	@Insert("insert into tb_commodity (`uuid`, `name`, `provider_id`, `img_url`, `specification`, `summary`, `price`, `is_remain`, `remain`, `stockNum`, `production_date`, `oil_rate`, `white_rate`, `appearance_degree`, `before_thawing`, `after_thawing`, `thawed_num`, `inspection_date`, `examiner`, `is_online`, `create_time`, `modify_time`, `publish_time`, `publish_status`, `commodity_type_one`, `commodity_type_two`, `produce_area`, `status`, `is_delete`, `op_one`, `op_one_tel`, `op_one_id`, `op_two`, `op_two_tel`, `op_two_id`, `code`, `check_status`, `manufacturer_id`, `fishing_style`, `is_allow_online_pay`, `weight`, `sold_out_cause`)"
	+ "values (#{uuid}, #{name}, #{providerId}, #{imgUrl}, #{specification}, #{summary}, #{price}, #{isRemain}, #{remain}, #{stocknum}, #{productionDate}, #{oilRate}, #{whiteRate}, #{appearanceDegree}, #{beforeThawing}, #{afterThawing}, #{thawedNum}, #{inspectionDate}, #{examiner}, #{isOnline}, #{createTime}, #{modifyTime}, #{publishTime}, #{publishStatus}, #{commodityTypeOne}, #{commodityTypeTwo}, #{produceArea}, #{status}, #{isDelete}, #{opOne}, #{opOneTel}, #{opOneId}, #{opTwo}, #{opTwoTel}, #{opTwoId}, #{code}, #{checkStatus}, #{manufacturerId}, #{fishingStyle}, #{isAllowOnlinePay}, #{weight}, #{soldOutCause})")
	int save(CommodityDO commodity);
	
	@Update("<script>"+ 
			"update tb_commodity " + 
					"<set>" + 
		            "<if test=\"id != null\">`id` = #{id}, </if>" + 
                    "<if test=\"uuid != null\">`uuid` = #{uuid}, </if>" + 
                    "<if test=\"name != null\">`name` = #{name}, </if>" + 
                    "<if test=\"providerId != null\">`provider_id` = #{providerId}, </if>" + 
                    "<if test=\"imgUrl != null\">`img_url` = #{imgUrl}, </if>" + 
                    "<if test=\"specification != null\">`specification` = #{specification}, </if>" + 
                    "<if test=\"summary != null\">`summary` = #{summary}, </if>" + 
                    "<if test=\"price != null\">`price` = #{price}, </if>" + 
                    "<if test=\"isRemain != null\">`is_remain` = #{isRemain}, </if>" + 
                    "<if test=\"remain != null\">`remain` = #{remain}, </if>" + 
                    "<if test=\"stocknum != null\">`stockNum` = #{stocknum}, </if>" + 
                    "<if test=\"productionDate != null\">`production_date` = #{productionDate}, </if>" + 
                    "<if test=\"oilRate != null\">`oil_rate` = #{oilRate}, </if>" + 
                    "<if test=\"whiteRate != null\">`white_rate` = #{whiteRate}, </if>" + 
                    "<if test=\"appearanceDegree != null\">`appearance_degree` = #{appearanceDegree}, </if>" + 
                    "<if test=\"beforeThawing != null\">`before_thawing` = #{beforeThawing}, </if>" + 
                    "<if test=\"afterThawing != null\">`after_thawing` = #{afterThawing}, </if>" + 
                    "<if test=\"thawedNum != null\">`thawed_num` = #{thawedNum}, </if>" + 
                    "<if test=\"inspectionDate != null\">`inspection_date` = #{inspectionDate}, </if>" + 
                    "<if test=\"examiner != null\">`examiner` = #{examiner}, </if>" + 
                    "<if test=\"isOnline != null\">`is_online` = #{isOnline}, </if>" + 
                    "<if test=\"createTime != null\">`create_time` = #{createTime}, </if>" + 
                    "<if test=\"modifyTime != null\">`modify_time` = #{modifyTime}, </if>" + 
                    "<if test=\"publishTime != null\">`publish_time` = #{publishTime}, </if>" + 
                    "<if test=\"publishStatus != null\">`publish_status` = #{publishStatus}, </if>" + 
                    "<if test=\"commodityTypeOne != null\">`commodity_type_one` = #{commodityTypeOne}, </if>" + 
                    "<if test=\"commodityTypeTwo != null\">`commodity_type_two` = #{commodityTypeTwo}, </if>" + 
                    "<if test=\"produceArea != null\">`produce_area` = #{produceArea}, </if>" + 
                    "<if test=\"status != null\">`status` = #{status}, </if>" + 
                    "<if test=\"isDelete != null\">`is_delete` = #{isDelete}, </if>" + 
                    "<if test=\"opOne != null\">`op_one` = #{opOne}, </if>" + 
                    "<if test=\"opOneTel != null\">`op_one_tel` = #{opOneTel}, </if>" + 
                    "<if test=\"opOneId != null\">`op_one_id` = #{opOneId}, </if>" + 
                    "<if test=\"opTwo != null\">`op_two` = #{opTwo}, </if>" + 
                    "<if test=\"opTwoTel != null\">`op_two_tel` = #{opTwoTel}, </if>" + 
                    "<if test=\"opTwoId != null\">`op_two_id` = #{opTwoId}, </if>" + 
                    "<if test=\"code != null\">`code` = #{code}, </if>" + 
                    "<if test=\"checkStatus != null\">`check_status` = #{checkStatus}, </if>" + 
                    "<if test=\"manufacturerId != null\">`manufacturer_id` = #{manufacturerId}, </if>" + 
                    "<if test=\"fishingStyle != null\">`fishing_style` = #{fishingStyle}, </if>" + 
                    "<if test=\"isAllowOnlinePay != null\">`is_allow_online_pay` = #{isAllowOnlinePay}, </if>" + 
                    "<if test=\"weight != null\">`weight` = #{weight}, </if>" + 
                    "<if test=\"soldOutCause != null\">`sold_out_cause` = #{soldOutCause}, </if>" + 
          					"</set>" + 
					"where id = #{id}"+
			"</script>")
	int update(CommodityDO commodity);
	
	@Delete("delete from tb_commodity where id =#{id}")
	int remove(Integer id);
	
	@Delete("<script>"+ 
			"delete from tb_commodity where id in " + 
					"<foreach item=\"id\" collection=\"array\" open=\"(\" separator=\",\" close=\")\">" + 
						"#{id}" + 
					"</foreach>"+
			"</script>")
	int batchRemove(Integer[] ids);
}
