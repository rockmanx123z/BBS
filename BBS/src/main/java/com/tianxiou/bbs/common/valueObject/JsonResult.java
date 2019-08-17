package com.tianxiou.bbs.common.valueObject;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResult 
{
	private Integer status;
	
	private String msg;
	
	private Object data;
	
	public static JsonResult  succeed()
	{
		return new JsonResult(200,"OK",null);
	}
	
	public static JsonResult  succeed(Object resultData)
	{
		return new JsonResult(200,"OK",resultData);
	}
	
	public static JsonResult fault()
	{
		return new JsonResult(500,"error",null);
	}
}
