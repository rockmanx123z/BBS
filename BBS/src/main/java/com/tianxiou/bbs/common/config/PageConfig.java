package com.tianxiou.bbs.common.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
@PropertySource("classpath:pageConfig.properties")
public class PageConfig 
{
	@Autowired
	public static PageConfig instance;
                         	
	@Value("${pageObject.pageSize}")
	private Integer pageSize = 3;
}
