	//处理服务端返回的结果
	function doHandleResponseResult(result,backFunction) {
		//console.log(result);
		if (result.status == 200) {//呈现数据(重点)
			//将日志记录呈现在本页面的tbody位置
			//doSetTableBodyRows(result.data.records);
			backFunction(result);
			//将分页信息呈现在分页div中
			// doSetPagination(result.data);
		} else {
			alert(result.message);
		}
	}