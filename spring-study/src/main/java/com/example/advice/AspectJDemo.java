package com.example.advice;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 这个类主要是用来测试 AOP
 */
@Aspect
@Component
public class AspectJDemo {

	@Pointcut("execution(* com.example.service.impl.UserServiceImpl.*(..))")
	private void pointCut(){}

	@Before("pointCut()")
	public void beforeExam(){
		System.out.println("aop before...");
	}
}
