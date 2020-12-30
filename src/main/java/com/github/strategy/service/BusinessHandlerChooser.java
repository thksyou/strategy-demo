package com.github.strategy.service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.core.annotation.AnnotationUtils;

import com.github.strategy.annonation.HandlerType;

/**
 * 业务处理策略选择器
 * 
 */
public class BusinessHandlerChooser {

	private Map<String, BusinessHandler> businessHandlerMap;

	public void setBusinessHandlerMap(List<BusinessHandler> businessHandlers) {
		businessHandlerMap = businessHandlers.stream().collect(
				Collectors.toMap(orderHandler -> AnnotationUtils.findAnnotation(orderHandler.getClass(), HandlerType.class).groupName(),
						v -> v, (v1, v2) -> v1));
	}

	public <R, T> BusinessHandler<R, T> businessHandlerChooser(String groupName) {
		return businessHandlerMap.get(groupName);
	}
}
