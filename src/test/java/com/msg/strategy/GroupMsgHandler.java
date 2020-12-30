package com.msg.strategy;

import com.github.strategy.annonation.HandlerType;
import com.github.strategy.service.BusinessHandler;

@HandlerType(groupName="groupType")
public class GroupMsgHandler implements BusinessHandler<String, String> {

	@Override
	public String businessHandler(String p) {
		return "返回结果： 你传入groupType->" + p;
	}

}
