package com.guoMgr.common.utils;

import com.guoMgr.system.domain.SysUserDO;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;


public class ShiroUtils {
	public static Subject getSubjct() {
		return SecurityUtils.getSubject();
	}
	public static SysUserDO getUser() {
		return (SysUserDO)getSubjct().getPrincipal();
	}
	public static Long getUserId() {
		return getUser().getUserId();
	}
	public static void logout() {
		getSubjct().logout();
	}
}
