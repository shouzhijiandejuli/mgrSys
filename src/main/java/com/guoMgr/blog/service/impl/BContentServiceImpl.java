package com.guoMgr.blog.service.impl;

import com.guoMgr.blog.dao.BContentMapper;
import com.guoMgr.blog.domain.BContentDO;
import com.guoMgr.blog.service.BContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;



@Service
public class BContentServiceImpl implements BContentService {
	@Autowired
	private BContentMapper bContentMapper;
	
	@Override
	public BContentDO get(Long cid){
		return bContentMapper.get(cid);
	}
	
	@Override
	public List<BContentDO> list(Map<String, Object> map){
		return bContentMapper.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return bContentMapper.count(map);
	}
	
	@Override
	public int save(BContentDO bContent){
		return bContentMapper.save(bContent);
	}
	
	@Override
	public int update(BContentDO bContent){
		return bContentMapper.update(bContent);
	}
	
	@Override
	public int remove(Long cid){
		return bContentMapper.remove(cid);
	}
	
	@Override
	public int batchRemove(Long[] cids){
		return bContentMapper.batchRemove(cids);
	}
	
}
