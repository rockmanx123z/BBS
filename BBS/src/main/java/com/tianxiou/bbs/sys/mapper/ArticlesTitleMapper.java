package com.tianxiou.bbs.sys.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.tianxiou.bbs.common.valueObject.ArticlesTitle;

@Mapper()
public interface ArticlesTitleMapper {

	List<ArticlesTitle>  findAritclesTitleByPaging(int start, int pageSize);
	
	Integer findAritclesCount();

}
