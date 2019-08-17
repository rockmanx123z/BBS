package com.tianxiou.bbs.sys.service;

import com.tianxiou.bbs.common.valueObject.ArticlesTitle;
import com.tianxiou.bbs.common.valueObject.PageObject;

public interface HomePageService 
{
	PageObject<ArticlesTitle> findArticlesTitle(int startPage);
}
