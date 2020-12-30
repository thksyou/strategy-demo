package com.msg;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpringMain {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TestSpringConfig.class);
		
		MsgService msgService = (MsgService)context.getBean(MsgService.class);
		
		msgService.msgManage("groupType");
	}
}
