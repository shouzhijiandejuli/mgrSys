package com.guoMgr.system.service;


import com.guoMgr.system.domain.ProviderDO;

import java.util.List;
import java.util.Map;

/**
 * InnoDB free: 6144 kB
 * 
 * @author guocl
 * @email guoclhrl@163.com
 * @date 2017-10-17 11:22:52
 */
public interface ProviderService {
	
	ProviderDO get(Integer id);
	
	List<ProviderDO> list(Map<String, Object> map);
	
	int count(Map<String, Object> map);
	
	int save(ProviderDO provider);
	
	int update(ProviderDO provider);
	
	int remove(Integer id);
	
	int batchRemove(Integer[] ids);
}
