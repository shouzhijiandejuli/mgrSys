package com.guoMgr.system.service.impl;

import com.guoMgr.system.dao.CommodityMapper;
import com.guoMgr.system.domain.CommodityDO;
import com.guoMgr.system.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	private CommodityMapper commodityMapper;
	
	@Override
	public CommodityDO get(Integer id){
		return commodityMapper.get(id);
	}
	
	@Override
	public List<CommodityDO> list(Map<String, Object> map){
		return commodityMapper.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return commodityMapper.count(map);
	}
	
	@Override
	public int save(CommodityDO commodity){
		return commodityMapper.save(commodity);
	}
	
	@Override
	public int update(CommodityDO commodity){
		return commodityMapper.update(commodity);
	}
	
	@Override
	public int remove(Integer id){
		return commodityMapper.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return commodityMapper.batchRemove(ids);
	}
	
}
