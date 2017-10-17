package com.guoMgr.common.service.impl;

import java.util.List;

import com.guoMgr.common.dao.LogMapper;
import com.guoMgr.common.domain.PageDO;
import com.guoMgr.common.domain.SysLogDO;
import com.guoMgr.common.service.LogService;
import com.guoMgr.common.utils.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LogServiceImpl implements LogService {
	@Autowired
	LogMapper logMapper;

	@Override
	public PageDO<SysLogDO> queryList(Query query) {
		List<SysLogDO> logs = logMapper.list(query);
		int total = logMapper.count();
		PageDO<SysLogDO> page = new PageDO<>();
		page.setTotal(total);
		page.setRows(logs);
		return page;
	}

	@Override
	public int remove(Long id) {
		int count = logMapper.remove(id);
		return count;
	}

	@Override
	public int batchRemove(List<Long> ids) {
		int count = logMapper.batchRemove(ids);
		return count;
	}
}
