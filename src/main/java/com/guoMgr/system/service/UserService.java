package com.guoMgr.system.service;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.guoMgr.system.domain.SysUserDO;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
	SysUserDO get(Long id);
	List<SysUserDO> list(Map<String, Object> map);
	int count(Map<String, Object> map);
	int save(SysUserDO user);
	int update(SysUserDO user);
	int remove(Long userId);
	int batchremove(List<Long> userIds);
	boolean exit(Map<String, Object> params);
	Set<String> listRoles(Long userId);
	int resetPwd(SysUserDO user);
}
