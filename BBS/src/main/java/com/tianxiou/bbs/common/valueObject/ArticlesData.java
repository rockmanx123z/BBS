package com.tianxiou.bbs.common.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticlesData  extends ValueObjectBase
{
//	文章题目
	private String title;
	
//	分类
	private String tags;
	
//	作者
	private String authorId;
	
//	文章主体
	private String articlesData;
	
	/**
	 * 文章获得 赞 数
	 */
	private Integer commend;
	
	
//	评论ID
	private String comment ;
}
