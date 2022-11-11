package com.aop.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class SpringAOPConfig {
	
	//declares the before advice. It is applied before calling the actual method.
	//this method will be called before the ping() method of the SpringAopController class
	@Before("execution(* com.aop.controller.SpringAopController.ping(..))")
	public void BeforeAdvice(JoinPoint jp) {
		
		System.out.println("Before Advice method is getting executed"+ "Method signature "+jp.getSignature());
		
	}
	//declares the after advice. It is applied after calling the actual method and before returning result.
	//this method will be called after the ping() method execution of the SpringAopController class
	@After("execution(* com.aop.controller.SpringAopController.ping(..))")
	public void AfterAdvice(JoinPoint jp) {
		
		System.out.println("After Advice method is getting executed " +"Method signature"+ jp.getSignature());
		
	}
	//declares the around advice. It is applied before and after calling the actual method.
	@Around("execution(* com.aop.controller.SpringAopController.ping(..))")
	public void AroundAdvice(JoinPoint jp) {
		
		System.out.println("Around Advice method is getting executed" + "Method signature" +jp.getSignature());
	}

}
