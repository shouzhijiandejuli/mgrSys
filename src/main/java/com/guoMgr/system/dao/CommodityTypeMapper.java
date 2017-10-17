package com.guoMgr.system.dao;


import java.util.List;
import java.util.Map;

import com.guoMgr.system.domain.CommodityTypeDO;
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
 * @date 2017-10-17 11:39:54
 */
@Mapper
public interface CommodityTypeMapper {

	@Select("select `id`, `name`, `en_name`, `create_time`, `parent_id`, `type_sort`, `status`, `is_delete` from tb_commodity_type where id = #{id}")
	CommodityTypeDO get(Integer id);
	
	@Select("<script>" +
	"select * from tb_commodity_type " + 
			"<where>" + 
		  		  "<if test=\"id != null and id != ''\">"+ "and id = #{id} " + "</if>" + 
		  		  "<if test=\"name != null and name != ''\">"+ "and name = #{name} " + "</if>" + 
		  		  "<if test=\"enName != null and enName != ''\">"+ "and en_name = #{enName} " + "</if>" + 
		  		  "<if test=\"createTime != null and createTime != ''\">"+ "and create_time = #{createTime} " + "</if>" + 
		  		  "<if test=\"parentId != null and parentId != ''\">"+ "and parent_id = #{parentId} " + "</if>" + 
		  		  "<if test=\"typeSort != null and typeSort != ''\">"+ "and type_sort = #{typeSort} " + "</if>" + 
		  		  "<if test=\"status != null and status != ''\">"+ "and status = #{status} " + "</if>" + 
		  		  "<if test=\"isDelete != null and isDelete != ''\">"+ "and is_delete = #{isDelete} " + "</if>" + 
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
	List<CommodityTypeDO> list(Map<String, Object> map);
	
	@Select("<script>" +
	"select count(*) from tb_commodity_type " + 
			"<where>" + 
		  		  "<if test=\"id != null and id != ''\">"+ "and id = #{id} " + "</if>" + 
		  		  "<if test=\"name != null and name != ''\">"+ "and name = #{name} " + "</if>" + 
		  		  "<if test=\"enName != null and enName != ''\">"+ "and en_name = #{enName} " + "</if>" + 
		  		  "<if test=\"createTime != null and createTime != ''\">"+ "and create_time = #{createTime} " + "</if>" + 
		  		  "<if test=\"parentId != null and parentId != ''\">"+ "and parent_id = #{parentId} " + "</if>" + 
		  		  "<if test=\"typeSort != null and typeSort != ''\">"+ "and type_sort = #{typeSort} " + "</if>" + 
		  		  "<if test=\"status != null and status != ''\">"+ "and status = #{status} " + "</if>" + 
		  		  "<if test=\"isDelete != null and isDelete != ''\">"+ "and is_delete = #{isDelete} " + "</if>" + 
		  			"</where>"+ 
			"</script>")
	int count(Map<String, Object> map);
	
	@Insert("insert into tb_commodity_type (`name`, `en_name`, `create_time`, `parent_id`, `type_sort`, `status`, `is_delete`)"
	+ "values (#{name}, #{enName}, #{createTime}, #{parentId}, #{typeSort}, #{status}, #{isDelete})")
	int save(CommodityTypeDO commodityType);
	
	@Update("<script>"+ 
			"update tb_commodity_type " + 
					"<set>" + 
		            "<if test=\"id != null\">`id` = #{id}, </if>" + 
                    "<if test=\"name != null\">`name` = #{name}, </if>" + 
                    "<if test=\"enName != null\">`en_name` = #{enName}, </if>" + 
                    "<if test=\"createTime != null\">`create_time` = #{createTime}, </if>" + 
                    "<if test=\"parentId != null\">`parent_id` = #{parentId}, </if>" + 
                    "<if test=\"typeSort != null\">`type_sort` = #{typeSort}, </if>" + 
                    "<if test=\"status != null\">`status` = #{status}, </if>" + 
                    "<if test=\"isDelete != null\">`is_delete` = #{isDelete}, </if>" + 
          					"</set>" + 
					"where id = #{id}"+
			"</script>")
	int update(CommodityTypeDO commodityType);
	
	@Delete("delete from tb_commodity_type where id =#{id}")
	int remove(Integer id);
	
	@Delete("<script>"+ 
			"delete from tb_commodity_type where id in " + 
					"<foreach item=\"id\" collection=\"array\" open=\"(\" separator=\",\" close=\")\">" + 
						"#{id}" + 
					"</foreach>"+
			"</script>")
	int batchRemove(Integer[] ids);
}
