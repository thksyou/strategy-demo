package com.github.strategy.annonation;

import org.springframework.stereotype.Service;

import java.lang.annotation.*;

/**
 * 标识具体的策略服务
 *
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Service
public @interface HandlerType {

	/**
	 * 标识不同策略分组
	 */
	String groupName();

}
