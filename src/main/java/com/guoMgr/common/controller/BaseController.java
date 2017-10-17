package com.guoMgr.common.controller;

import com.guoMgr.common.utils.ShiroUtils;
import com.guoMgr.system.domain.SysUserDO;
import org.springframework.stereotype.Controller;


@Controller
public class BaseController {
	public SysUserDO getUser() {
		return ShiroUtils.getUser();
	}

	public Long getUserId() {
		return getUser().getUserId();
	}

	public String getUsername() {
		return getUser().getUsername();
	}
}