package com.guoMgr.system.dao;


import java.util.List;
import java.util.Map;

import com.guoMgr.system.domain.ProviderDO;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
/**
 * InnoDB free: 6144 kB
 * 
 * @author guocl
 * @email guoclhrl@163.com
 * @date 2017-10-17 11:22:52
 */
@Mapper
public interface ProviderMapper {

	@Select("select id, uuid, acc_id, AES_DECRYPT(tel,'86e5863a59e503aa') as tel, password, gender, address_detail, real_address_detail, area, area_detail, online_pay, remark, identity, comment_level, create_time, modify_time, register_type, status, is_delete, wx_openid, avatar_path, main_category, in_white_list, AES_DECRYPT(name,'86e5863a59e503aa') as name, AES_DECRYPT(real_name,'86e5863a59e503aa') as real_name, AES_DECRYPT(weixin_name,'86e5863a59e503aa') as weixin_name, AES_DECRYPT(provider_name,'86e5863a59e503aa') as provider_name, AES_DECRYPT(real_provider_name,'86e5863a59e503aa') as real_provider_name from tb_provider where id = #{id}")
	ProviderDO get(Integer id);
	
	@Select("<script>" +
	"select * from tb_provider " + 
			"<where>" + 
		  		  "<if test=\"id != null and id != ''\">"+ "and id = #{id} " + "</if>" + 
		  		  "<if test=\"uuid != null and uuid != ''\">"+ "and uuid = #{uuid} " + "</if>" + 
		  		  "<if test=\"accId != null and accId != ''\">"+ "and acc_id = #{accId} " + "</if>" + 
		  		  "<if test=\"tel != null and tel != ''\">"+ "and tel = #{tel} " + "</if>" + 
		  		  "<if test=\"password != null and password != ''\">"+ "and password = #{password} " + "</if>" + 
		  		  "<if test=\"gender != null and gender != ''\">"+ "and gender = #{gender} " + "</if>" + 
		  		  "<if test=\"addressDetail != null and addressDetail != ''\">"+ "and address_detail = #{addressDetail} " + "</if>" + 
		  		  "<if test=\"realAddressDetail != null and realAddressDetail != ''\">"+ "and real_address_detail = #{realAddressDetail} " + "</if>" + 
		  		  "<if test=\"area != null and area != ''\">"+ "and area = #{area} " + "</if>" + 
		  		  "<if test=\"areaDetail != null and areaDetail != ''\">"+ "and area_detail = #{areaDetail} " + "</if>" + 
		  		  "<if test=\"onlinePay != null and onlinePay != ''\">"+ "and online_pay = #{onlinePay} " + "</if>" + 
		  		  "<if test=\"remark != null and remark != ''\">"+ "and remark = #{remark} " + "</if>" + 
		  		  "<if test=\"identity != null and identity != ''\">"+ "and identity = #{identity} " + "</if>" + 
		  		  "<if test=\"commentLevel != null and commentLevel != ''\">"+ "and comment_level = #{commentLevel} " + "</if>" + 
		  		  "<if test=\"createTime != null and createTime != ''\">"+ "and create_time = #{createTime} " + "</if>" + 
		  		  "<if test=\"modifyTime != null and modifyTime != ''\">"+ "and modify_time = #{modifyTime} " + "</if>" + 
		  		  "<if test=\"registerType != null and registerType != ''\">"+ "and register_type = #{registerType} " + "</if>" + 
		  		  "<if test=\"status != null and status != ''\">"+ "and status = #{status} " + "</if>" + 
		  		  "<if test=\"isDelete != null and isDelete != ''\">"+ "and is_delete = #{isDelete} " + "</if>" + 
		  		  "<if test=\"wxOpenid != null and wxOpenid != ''\">"+ "and wx_openid = #{wxOpenid} " + "</if>" + 
		  		  "<if test=\"avatarPath != null and avatarPath != ''\">"+ "and avatar_path = #{avatarPath} " + "</if>" + 
		  		  "<if test=\"mainCategory != null and mainCategory != ''\">"+ "and main_category = #{mainCategory} " + "</if>" + 
		  		  "<if test=\"inWhiteList != null and inWhiteList != ''\">"+ "and in_white_list = #{inWhiteList} " + "</if>" + 
		  		  "<if test=\"name != null and name != ''\">"+ "and name = #{name} " + "</if>" + 
		  		  "<if test=\"realName != null and realName != ''\">"+ "and real_name = #{realName} " + "</if>" + 
		  		  "<if test=\"weixinName != null and weixinName != ''\">"+ "and weixin_name = #{weixinName} " + "</if>" + 
		  		  "<if test=\"providerName != null and providerName != ''\">"+ "and provider_name = #{providerName} " + "</if>" + 
		  		  "<if test=\"realProviderName != null and realProviderName != ''\">"+ "and real_provider_name = #{realProviderName} " + "</if>" + 
		  			"</where>"+ 
			" <choose>" + 
	            "<when test=\"sort != null and sort.trim() != ''\">" + 
	                "order by ${sort} ${order}" + 
	            "</when>" + 
				"<otherwise>" + 
	                "order by id desc" + 
				"</otherwise>" + 
	        "</choose>"+
			"<if test=\"offset != null and limit != null\">"+
			"limit #{offset}, #{limit}" + 
			"</if>"+
			"</script>")
	List<ProviderDO> list(Map<String, Object> map);
	
	@Select("<script>" +
	"select count(*) from tb_provider " + 
			"<where>" + 
		  		  "<if test=\"id != null and id != ''\">"+ "and id = #{id} " + "</if>" + 
		  		  "<if test=\"uuid != null and uuid != ''\">"+ "and uuid = #{uuid} " + "</if>" + 
		  		  "<if test=\"accId != null and accId != ''\">"+ "and acc_id = #{accId} " + "</if>" + 
		  		  "<if test=\"tel != null and tel != ''\">"+ "and tel = #{tel} " + "</if>" + 
		  		  "<if test=\"password != null and password != ''\">"+ "and password = #{password} " + "</if>" + 
		  		  "<if test=\"gender != null and gender != ''\">"+ "and gender = #{gender} " + "</if>" + 
		  		  "<if test=\"addressDetail != null and addressDetail != ''\">"+ "and address_detail = #{addressDetail} " + "</if>" + 
		  		  "<if test=\"realAddressDetail != null and realAddressDetail != ''\">"+ "and real_address_detail = #{realAddressDetail} " + "</if>" + 
		  		  "<if test=\"area != null and area != ''\">"+ "and area = #{area} " + "</if>" + 
		  		  "<if test=\"areaDetail != null and areaDetail != ''\">"+ "and area_detail = #{areaDetail} " + "</if>" + 
		  		  "<if test=\"onlinePay != null and onlinePay != ''\">"+ "and online_pay = #{onlinePay} " + "</if>" + 
		  		  "<if test=\"remark != null and remark != ''\">"+ "and remark = #{remark} " + "</if>" + 
		  		  "<if test=\"identity != null and identity != ''\">"+ "and identity = #{identity} " + "</if>" + 
		  		  "<if test=\"commentLevel != null and commentLevel != ''\">"+ "and comment_level = #{commentLevel} " + "</if>" + 
		  		  "<if test=\"createTime != null and createTime != ''\">"+ "and create_time = #{createTime} " + "</if>" + 
		  		  "<if test=\"modifyTime != null and modifyTime != ''\">"+ "and modify_time = #{modifyTime} " + "</if>" + 
		  		  "<if test=\"registerType != null and registerType != ''\">"+ "and register_type = #{registerType} " + "</if>" + 
		  		  "<if test=\"status != null and status != ''\">"+ "and status = #{status} " + "</if>" + 
		  		  "<if test=\"isDelete != null and isDelete != ''\">"+ "and is_delete = #{isDelete} " + "</if>" + 
		  		  "<if test=\"wxOpenid != null and wxOpenid != ''\">"+ "and wx_openid = #{wxOpenid} " + "</if>" + 
		  		  "<if test=\"avatarPath != null and avatarPath != ''\">"+ "and avatar_path = #{avatarPath} " + "</if>" + 
		  		  "<if test=\"mainCategory != null and mainCategory != ''\">"+ "and main_category = #{mainCategory} " + "</if>" + 
		  		  "<if test=\"inWhiteList != null and inWhiteList != ''\">"+ "and in_white_list = #{inWhiteList} " + "</if>" + 
		  		  "<if test=\"name != null and name != ''\">"+ "and name = #{name} " + "</if>" + 
		  		  "<if test=\"realName != null and realName != ''\">"+ "and real_name = #{realName} " + "</if>" + 
		  		  "<if test=\"weixinName != null and weixinName != ''\">"+ "and weixin_name = #{weixinName} " + "</if>" + 
		  		  "<if test=\"providerName != null and providerName != ''\">"+ "and provider_name = #{providerName} " + "</if>" + 
		  		  "<if test=\"realProviderName != null and realProviderName != ''\">"+ "and real_provider_name = #{realProviderName} " + "</if>" + 
		  			"</where>"+ 
			"</script>")
	int count(Map<String, Object> map);
	
	@Insert("insert into tb_provider (`uuid`, `acc_id`, `tel`, `password`, `gender`, `address_detail`, `real_address_detail`, `area`, `area_detail`, `online_pay`, `remark`, `identity`, `comment_level`, `create_time`, `modify_time`, `register_type`, `status`, `is_delete`, `wx_openid`, `avatar_path`, `main_category`, `in_white_list`, `name`, `real_name`, `weixin_name`, `provider_name`, `real_provider_name`)"
	+ "values (#{uuid}, #{accId}, #{tel}, #{password}, #{gender}, #{addressDetail}, #{realAddressDetail}, #{area}, #{areaDetail}, #{onlinePay}, #{remark}, #{identity}, #{commentLevel}, #{createTime}, #{modifyTime}, #{registerType}, #{status}, #{isDelete}, #{wxOpenid}, #{avatarPath}, #{mainCategory}, #{inWhiteList}, #{name}, #{realName}, #{weixinName}, #{providerName}, #{realProviderName})")
	int save(ProviderDO provider);
	
	@Update("<script>"+ 
			"update tb_provider " + 
					"<set>" + 
		            "<if test=\"id != null\">`id` = #{id}, </if>" + 
                    "<if test=\"uuid != null\">`uuid` = #{uuid}, </if>" + 
                    "<if test=\"accId != null\">`acc_id` = #{accId}, </if>" + 
                    "<if test=\"tel != null\">`tel` = #{tel}, </if>" + 
                    "<if test=\"password != null\">`password` = #{password}, </if>" + 
                    "<if test=\"gender != null\">`gender` = #{gender}, </if>" + 
                    "<if test=\"addressDetail != null\">`address_detail` = #{addressDetail}, </if>" + 
                    "<if test=\"realAddressDetail != null\">`real_address_detail` = #{realAddressDetail}, </if>" + 
                    "<if test=\"area != null\">`area` = #{area}, </if>" + 
                    "<if test=\"areaDetail != null\">`area_detail` = #{areaDetail}, </if>" + 
                    "<if test=\"onlinePay != null\">`online_pay` = #{onlinePay}, </if>" + 
                    "<if test=\"remark != null\">`remark` = #{remark}, </if>" + 
                    "<if test=\"identity != null\">`identity` = #{identity}, </if>" + 
                    "<if test=\"commentLevel != null\">`comment_level` = #{commentLevel}, </if>" + 
                    "<if test=\"createTime != null\">`create_time` = #{createTime}, </if>" + 
                    "<if test=\"modifyTime != null\">`modify_time` = #{modifyTime}, </if>" + 
                    "<if test=\"registerType != null\">`register_type` = #{registerType}, </if>" + 
                    "<if test=\"status != null\">`status` = #{status}, </if>" + 
                    "<if test=\"isDelete != null\">`is_delete` = #{isDelete}, </if>" + 
                    "<if test=\"wxOpenid != null\">`wx_openid` = #{wxOpenid}, </if>" + 
                    "<if test=\"avatarPath != null\">`avatar_path` = #{avatarPath}, </if>" + 
                    "<if test=\"mainCategory != null\">`main_category` = #{mainCategory}, </if>" + 
                    "<if test=\"inWhiteList != null\">`in_white_list` = #{inWhiteList}, </if>" + 
                    "<if test=\"name != null\">`name` = #{name}, </if>" + 
                    "<if test=\"realName != null\">`real_name` = #{realName}, </if>" + 
                    "<if test=\"weixinName != null\">`weixin_name` = #{weixinName}, </if>" + 
                    "<if test=\"providerName != null\">`provider_name` = #{providerName}, </if>" + 
                    "<if test=\"realProviderName != null\">`real_provider_name` = #{realProviderName}, </if>" + 
          					"</set>" + 
					"where id = #{id}"+
			"</script>")
	int update(ProviderDO provider);
	
	@Delete("delete from tb_provider where id =#{id}")
	int remove(Integer id);
	
	@Delete("<script>"+ 
			"delete from tb_provider where id in " + 
					"<foreach item=\"id\" collection=\"array\" open=\"(\" separator=\",\" close=\")\">" + 
						"#{id}" + 
					"</foreach>"+
			"</script>")
	int batchRemove(Integer[] ids);
}
