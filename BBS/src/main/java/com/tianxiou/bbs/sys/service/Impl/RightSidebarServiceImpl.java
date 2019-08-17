package com.tianxiou.bbs.sys.service.Impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tianxiou.bbs.common.valueObject.SidebarElement;
import com.tianxiou.bbs.sys.service.RightSidebarService;

@Service
public class RightSidebarServiceImpl implements RightSidebarService
{

	@Override
	public List<SidebarElement> findSidebarList() {
		List<SidebarElement> eidebarList = new ArrayList<SidebarElement>(); 
		
		eidebarList.add(new SidebarElement("categories","common/sidebar/recentComments"));
		eidebarList.add(new SidebarElement("support","common/sidebar/support"));
		eidebarList.add(new SidebarElement("categories","common/sidebar/recentComments"));
		
		return eidebarList;
	}



}
