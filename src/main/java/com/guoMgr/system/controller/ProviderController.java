package com.guoMgr.system.controller;

import java.util.List;
import java.util.Map;

import com.guoMgr.common.utils.PageUtils;
import com.guoMgr.common.utils.Query;
import com.guoMgr.common.utils.R;
import com.guoMgr.system.domain.ProviderDO;
import com.guoMgr.system.service.ProviderService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;





/**
 * InnoDB free: 6144 kB
 * 
 * @author guocl
 * @email guoclhrl@163.com
 * @date 2017-10-17 11:22:52
 */
@Controller
@RequestMapping("/sys/provider")
public class ProviderController {
	@Autowired
	private ProviderService providerService;
	
	@GetMapping()
	@RequiresPermissions("sys:provider")
	String Provider(){
	    return "sys/provider/provider";
	}
	
	@ResponseBody
	@GetMapping("/list")
	@RequiresPermissions("sys:list")
	public PageUtils list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);
		List<ProviderDO> providerList = providerService.list(query);
		int total = providerService.count(query);
		PageUtils pageUtils = new PageUtils(providerList, total);
		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("blog:bComments")
	String add(){
	    return "sys/provider/add";
	}
	@GetMapping("/edit")
	//@RequiresPermissions("blog:bComments")
	String edit(Model model,@PathVariable("id") Integer id){
		ProviderDO provider = providerService.get(id);
		model.addAttribute("Provider", provider);
	    return "blog/provider/edit";
	}
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("provider:info")
	public R info(@PathVariable("id") Integer id){
		ProviderDO provider = providerService.get(id);
		return R.ok().put("provider", provider);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("provider:save")
	public R save( ProviderDO provider){
		if(providerService.save(provider)>0){
			return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("provider:update")
	public R update(@RequestBody ProviderDO provider){
		providerService.update(provider);
		
		return R.ok();
	}
	
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("provider:remove")
	public R remove( Integer id){
		if(providerService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("provider:remove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		providerService.batchRemove(ids);
		
		return R.ok();
	}
	
}
