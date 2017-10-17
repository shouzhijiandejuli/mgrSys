package com.guoMgr.system.service;


import com.guoMgr.system.domain.CommodityTypeDO;

import java.util.List;
import java.util.Map;

/**
 * InnoDB free: 6144 kB
 * 
 * @author guocl
 * @email guoclhrl@163.com
 * @date 2017-10-17 11:39:54
 */
public interface CommodityTypeService {
	
	CommodityTypeDO get(Integer id);
	
	List<CommodityTypeDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CommodityTypeDO commodityType);
	
	int update(CommodityTypeDO commodityType);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
