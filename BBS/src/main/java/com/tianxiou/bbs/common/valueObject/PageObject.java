package com.tianxiou.bbs.common.valueObject;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;

import com.tianxiou.bbs.common.config.PageConfig;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor 
@NoArgsConstructor 
@ToString
public class  PageObject<T> 
{
	/**
	 * 要呈现的数据
	 */
	private List<T> records;
	
	/**
	 * 总记录数
	 */
	private Integer rowCount=0;
	
	/**当前页码*/
	private Integer pageCurrent=1;
	
	/**
	 * 总页数
	 */
	private Integer pageCount =0;
	
	/**
	 * 每个页面要显示的记录数
	 */
	private Integer pageSize = 3;
	
	
	

	
	public PageObject(List<T> records,Integer rowCount,Integer pageCurrent)
	{
		this.records = records;
		this.rowCount = rowCount;
		this.pageCurrent = pageCurrent; 
		pageCount = (rowCount-1)/pageSize+1; 
	}
	
	public Integer getPageSize()
	{
//		pageSize = PageConfig.instance.getPageSize();
		return pageSize ;
	}
	
	public Integer getPageCount()
	{
		pageSize = 3;
		pageCount =(rowCount-1)/pageSize+1;
		return pageCount; 
	}
	
	/**
	 * 构造页面信息
	 * @param <T>			
	 * @param records 		要呈现的数据
	 * @param rowCount		总记录数
	 * @param pageCurrent	当前页码
	 * @return
	 */
	public static <T> PageObject<T> buildPageObject(List<T> records,Integer rowCount,Integer pageCurrent)
	{
	   return new PageObject<T>(records,rowCount,pageCurrent);
	}
	
}
