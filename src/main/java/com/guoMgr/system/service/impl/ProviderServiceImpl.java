package com.guoMgr.system.service.impl;

import com.guoMgr.system.dao.ProviderMapper;
import com.guoMgr.system.domain.ProviderDO;
import com.guoMgr.system.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service
public class ProviderServiceImpl implements ProviderService {
	@Autowired
	private ProviderMapper providerMapper;
	
	@Override
	public ProviderDO get(Integer id){
		return providerMapper.get(id);
	}
	
	@Override
	public List<ProviderDO> list(Map<String, Object> map){
		return providerMapper.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return providerMapper.count(map);
	}
	
	@Override
	public int save(ProviderDO provider){
		return providerMapper.save(provider);
	}
	
	@Override
	public int update(ProviderDO provider){
		return providerMapper.update(provider);
	}
	
	@Override
	public int remove(Integer id){
		return providerMapper.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return providerMapper.batchRemove(ids);
	}
	
}
