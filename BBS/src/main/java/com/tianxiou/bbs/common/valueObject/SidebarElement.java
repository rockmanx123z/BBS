package com.tianxiou.bbs.common.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class SidebarElement 
{
	private String name;
	
	private String url;
}
