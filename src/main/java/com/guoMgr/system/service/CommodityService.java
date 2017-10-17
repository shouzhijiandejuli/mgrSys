package com.guoMgr.system.service;


import com.guoMgr.system.domain.CommodityDO;

import java.util.List;
import java.util.Map;

/**
 * InnoDB free: 8192 kB
 * 
 * @author guocl
 * @email guoclhrl@163.com
 * @date 2017-09-21 14:38:10
 */
public interface CommodityService {
	
	CommodityDO get(Integer id);
	
	List<CommodityDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(CommodityDO commodity);
	
	int update(CommodityDO commodity);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
