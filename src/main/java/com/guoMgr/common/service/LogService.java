package com.guoMgr.common.service;

import java.util.List;

import com.guoMgr.common.domain.PageDO;
import com.guoMgr.common.domain.SysLogDO;
import com.guoMgr.common.utils.Query;
import org.springframework.stereotype.Service;

@Service
public interface LogService {
	PageDO<SysLogDO> queryList(Query query);
	int remove(Long id);
	int batchRemove(List<Long> ids);
}
