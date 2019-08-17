package com.tianxiou.bbs.sys.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tianxiou.bbs.common.valueObject.JsonResult;

@Controller
@RequestMapping("/")
public class PageController
{
	
	@RequestMapping("{page}")
	public String showPage(@PathVariable String page)
	{
		System.out.println(page);
		return page;
	}
	

	
	@RequestMapping("{model}/{system}/{page}")
	public String showPage2(@PathVariable String model,@PathVariable String system,@PathVariable String page)
	{
		System.out.println(model+"/"+system+"/"+page);
		return model+"/"+system+"/"+page;
	}
	
	@RequestMapping("login")
	public String login()
	{
		return "system/userPage/login";
	}
	
	@RequestMapping(value="login_1", method=RequestMethod.POST)
	@ResponseBody
	public JsonResult userLogin(HttpServletRequest request)
	{
		
		System.out.println("\n"+request.getParameter("name")+"\n"+request.getParameter("password")+"\n"+request.getParameter("email")+"\n");
		
		return JsonResult.succeed();
	}
	
	
	@RequestMapping("aa")
	public String test()
	{
		return "system/userPage/userPage";
	}

}
