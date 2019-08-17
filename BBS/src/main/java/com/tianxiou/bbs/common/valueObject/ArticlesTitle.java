package com.tianxiou.bbs.common.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticlesTitle extends ValueObjectBase
{
	/**
	 * 文章路径
	 */
	private String path;
	/**
	 * 文章标题
	 */
	private String title;
	/**
	 * 文章的组id
	 */
	private String groupId;
	/**
	 * 文章的作者
	 */
	private String author;
	/**
	 * 文章获得 赞 数
	 */
	private Integer commend;
}
