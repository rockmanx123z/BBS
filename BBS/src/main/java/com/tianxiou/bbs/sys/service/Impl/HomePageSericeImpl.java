package com.tianxiou.bbs.sys.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tianxiou.bbs.common.config.PageConfig;
import com.tianxiou.bbs.common.valueObject.ArticlesTitle;
import com.tianxiou.bbs.common.valueObject.PageObject;
import com.tianxiou.bbs.sys.mapper.ArticlesTitleMapper;
import com.tianxiou.bbs.sys.service.HomePageService;

@Service
public class HomePageSericeImpl implements HomePageService
{
	
	//@Autowired
	//private ArticlesTitleMapper articlesTitleMapper;
	
	
	
	@Override
	public PageObject<ArticlesTitle> findArticlesTitle(int startPage) {
		List<ArticlesTitle> articlesList ;//= articlesTitleMapper.findAritclesTitleByPaging(startPage,PageConfig.instance.getPageSize());
		Integer pageCount;// = articlesTitleMapper.findAritclesCount();
		
		articlesList= new ArrayList<ArticlesTitle>();
		articlesList.add(new ArticlesTitle("12345","文章标题1","文章分组","作者",5));
		articlesList.add(new ArticlesTitle("2","文章标题2","文章分组","作者",5));
		articlesList.add(new ArticlesTitle("3","文章标题3","文章分组","作者",5));
		articlesList.add(new ArticlesTitle("4","文章标题4","文章分组","作者",5));	
		articlesList.add(new ArticlesTitle("5","文章标题5","文章分组","作者",5));
		
		pageCount = 3;
		return PageObject.buildPageObject(articlesList,pageCount ,startPage) ;
	}

}
