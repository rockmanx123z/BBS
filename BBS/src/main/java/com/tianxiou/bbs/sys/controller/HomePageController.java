package com.tianxiou.bbs.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tianxiou.bbs.common.valueObject.ArticlesTitle;
import com.tianxiou.bbs.common.valueObject.JsonResult;
import com.tianxiou.bbs.common.valueObject.PageObject;
import com.tianxiou.bbs.sys.service.HomePageService;

@Controller
@RequestMapping("/home/")
public class HomePageController
{

	
	@Autowired
	HomePageService homePageService;
	
	@RequestMapping("showFeaturedArticles")
	@ResponseBody
	public JsonResult showFeaturedArticles(Integer pageCurrent)
	{
		System.out.println("开始查询数据"+ pageCurrent);
		PageObject<ArticlesTitle> articlesTitleList = homePageService.findArticlesTitle(pageCurrent);
		System.out.println(articlesTitleList);
		return JsonResult.succeed(articlesTitleList);
	}
}
