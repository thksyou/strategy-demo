package com.msg.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.strategy.service.BusinessHandler;
import com.github.strategy.service.BusinessHandlerChooser;
import com.msg.MsgService;

/**
 * 业务实现
 */
@Service
public class MsgServiceImpl implements MsgService {

	@Autowired
	BusinessHandlerChooser businessHandlerChooser;
	
	@Override
	public void msgManage(String msgType) {
		BusinessHandler<Object, Object> bsh = businessHandlerChooser.businessHandlerChooser(msgType);
		System.out.println(bsh.businessHandler("参数111111"));
	}

	
	
	
}
