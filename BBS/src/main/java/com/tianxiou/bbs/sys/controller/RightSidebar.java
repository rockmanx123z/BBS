package com.tianxiou.bbs.sys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tianxiou.bbs.common.valueObject.JsonResult;
import com.tianxiou.bbs.common.valueObject.SidebarElement;
import com.tianxiou.bbs.sys.service.RightSidebarService;

@Controller
@RequestMapping("/right/")
public class RightSidebar 
{
	@Autowired
	RightSidebarService rightSidebarService;
	
	@RequestMapping("sidebar")
	@ResponseBody
	public JsonResult doSidebar()
	{
		List<SidebarElement> findSidebarList = rightSidebarService.findSidebarList();
		System.out.println(findSidebarList);
		return JsonResult.succeed(findSidebarList);
	}
}
