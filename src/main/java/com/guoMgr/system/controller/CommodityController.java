package com.guoMgr.system.controller;

import java.util.List;
import java.util.Map;

import com.guoMgr.common.annotation.Log;
import com.guoMgr.common.controller.BaseController;
import com.guoMgr.common.utils.PageUtils;
import com.guoMgr.common.utils.Query;
import com.guoMgr.common.utils.R;
import com.guoMgr.common.utils.RandomNumberUtil;
import com.guoMgr.system.domain.CommodityDO;
import com.guoMgr.system.domain.CommodityTypeDO;
import com.guoMgr.system.domain.ProviderDO;
import com.guoMgr.system.service.CommodityService;
import com.guoMgr.system.service.CommodityTypeService;
import com.guoMgr.system.service.ProviderService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
 * InnoDB free: 8192 kB
 * 
 * @author guocl
 * @email guoclhrl@163.com
 * @date 2017-09-21 14:38:10
 */
@Controller
@RequestMapping("/sys/commodity")
public class CommodityController extends BaseController{

	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CommodityService commodityService;

	@Autowired
	private ProviderService providerService;

	@Autowired
	private CommodityTypeService commodityTypeService;

	@Autowired
	private RandomNumberUtil randomNumberUtil;
	
	@GetMapping("")
	@RequiresPermissions("sys:commodity:commodity")
	String commodity(Model model){
	    return "sys/commodity/commodity";
	}

	@ResponseBody
	@GetMapping("/list")
	/*@RequiresPermissions("commodity:commodity")*/
	public PageUtils list(@RequestParam Map<String, Object> params){
		long logId = randomNumberUtil.nextLong();
		logger.info("[{}][商品列表] params:",logId,params);
		//查询列表数据
        Query query = new Query(params);
		List<CommodityDO> commodityList = commodityService.list(query);
		logger.info("[{}][商品列表数据] commodityList:{}",logId,commodityList);
		for (CommodityDO c:commodityList
			 ) {
			ProviderDO providerDO = providerService.get(c.getProviderId());
			logger.info("[{}][商品列表 供应商信息] providerDO:",logId,providerDO);
			if(providerDO != null){
				c.setProviderName(new String(providerDO.getName()));
			}
			CommodityTypeDO oneName = commodityTypeService.get(c.getCommodityTypeOne());
			if(oneName != null){
				c.setCommodityTypeOneName(oneName.getName());
			}
			CommodityTypeDO twoName = commodityTypeService.get(c.getCommodityTypeTwo());
			if(twoName != null){
				c.setCommodityTypeTwoName(twoName.getName());
			}
			if(c.getCheckStatus() == 1){
				c.setCheckStatusName("待审核");
			}else if(c.getCheckStatus() == 2){
				c.setCheckStatusName("审核成功");
			}else{
				c.setCheckStatusName("审核失败");
			}
		}
		int total = commodityService.count(query);
		PageUtils pageUtils = new PageUtils(commodityList, total);

		return pageUtils;
	}
	
	@GetMapping("/add")
	//@RequiresPermissions("blog:bComments")
	String add(){
	    return "sys/commodity/add";
	}
	@GetMapping("/edit/{id}")
	//@RequiresPermissions("blog:bComments")
	String edit(Model model,@PathVariable("id") Integer id){
		CommodityDO commodity = commodityService.get(id);
		model.addAttribute("Commodity", commodity);
	    return "sys/commodity/edit";
	}
	/**
	 * 信息
	 */
	@RequestMapping("/info/{id}")
	@RequiresPermissions("commodity:info")
	public R info(@PathVariable("id") Integer id){
		CommodityDO commodity = commodityService.get(id);
		return R.ok().put("commodity", commodity);
	}
	
	/**
	 * 保存
	 */
	@ResponseBody
	@PostMapping("/save")
	@RequiresPermissions("commodity:save")
	public R save( CommodityDO commodity){
		if(commodityService.save(commodity)>0){
			return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 修改
	 */
	@RequestMapping("/update")
	@RequiresPermissions("commodity:update")
	public R update(@RequestBody CommodityDO commodity){
		commodityService.update(commodity);
		
		return R.ok();
	}
	
	
	/**
	 * 删除
	 */
	@PostMapping( "/remove")
	@ResponseBody
	@RequiresPermissions("commodity:remove")
	public R remove( Integer id){
		if(commodityService.remove(id)>0){
		return R.ok();
		}
		return R.error();
	}
	
	/**
	 * 删除
	 */
	@PostMapping( "/batchRemove")
	@ResponseBody
	@RequiresPermissions("commodity:remove")
	public R remove(@RequestParam("ids[]") Integer[] ids){
		commodityService.batchRemove(ids);
		
		return R.ok();
	}
	
}
