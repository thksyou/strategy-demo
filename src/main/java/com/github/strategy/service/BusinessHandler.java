package com.github.strategy.service;

/**
 * 业务处理策略接口
 * 
 */
public interface BusinessHandler<R, T> {

	/**
	 * 业务处理
	 *
	 * @param t  参数
	 * @return R　结果
	 */
	R businessHandler(T t);
}
