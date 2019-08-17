package com.tianxiou.bbs.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tianxiou.bbs.common.valueObject.ArticlesData;
import com.tianxiou.bbs.common.valueObject.JsonResult;

@Controller
@RequestMapping("/artile/")
public class ArtileController
{
	@RequestMapping("testArtile/{artileId}")
//	@ResponseBody
	public String findArtile(@PathVariable String artileId ,Model model)
	{
//		return JsonResult.succeed(new ArticlesData("aa","bb","cc","dd",7,"ff"));
		
        model.addAttribute("artileData",new ArticlesData("aa","bb","cc","dd",7,"ff"));  
		
		return "System/artile/article";
	}
}
