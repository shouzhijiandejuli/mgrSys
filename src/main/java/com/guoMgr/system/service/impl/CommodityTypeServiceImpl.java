package com.guoMgr.system.service.impl;

import com.guoMgr.system.dao.CommodityTypeMapper;
import com.guoMgr.system.domain.CommodityTypeDO;
import com.guoMgr.system.service.CommodityTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;




@Service
public class CommodityTypeServiceImpl implements CommodityTypeService {
	@Autowired
	private CommodityTypeMapper commodityTypeMapper;
	
	@Override
	public CommodityTypeDO get(Integer id){
		return commodityTypeMapper.get(id);
	}
	
	@Override
	public List<CommodityTypeDO> list(Map<String, Object> map){
		return commodityTypeMapper.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return commodityTypeMapper.count(map);
	}
	
	@Override
	public int save(CommodityTypeDO commodityType){
		return commodityTypeMapper.save(commodityType);
	}
	
	@Override
	public int update(CommodityTypeDO commodityType){
		return commodityTypeMapper.update(commodityType);
	}
	
	@Override
	public int remove(Integer id){
		return commodityTypeMapper.remove(id);
	}
	
	@Override
	public int batchRemove(Integer[] ids){
		return commodityTypeMapper.batchRemove(ids);
	}
	
}
