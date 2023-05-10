package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

@Around(value = "execution(* com.example.demo.controller.HelloController.*(..))")	
public void sayKiran(ProceedingJoinPoint joinPoint) throws Throwable
{
	
	System.out.println("KIRAN....KIRAN...KIRAN"+joinPoint.getSignature());
	joinPoint.proceed();
	System.out.println("KIRAN1....KIRAN1...KIRAN1"+joinPoint.getSignature());
	
	
	}
	
	
}
