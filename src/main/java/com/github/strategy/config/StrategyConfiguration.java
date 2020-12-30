package com.github.strategy.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.strategy.service.BusinessHandler;
import com.github.strategy.service.BusinessHandlerChooser;

/**
 * 注册策略bean
 *
 */
@Configuration
public class StrategyConfiguration {

	@SuppressWarnings("rawtypes")
	@Bean
	public BusinessHandlerChooser businessHandlerChooser(List<BusinessHandler> businessHandlers) {
		BusinessHandlerChooser businessHandlerChooser = new BusinessHandlerChooser();
		businessHandlerChooser.setBusinessHandlerMap(businessHandlers);
		return businessHandlerChooser;
	}

}
