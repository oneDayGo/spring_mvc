package com.xiaoluomo.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * 使用注解配置aop
 * */

@Aspect
@Component
public class MyAspectAnnotation {
    @Pointcut("execution(* com.xiaoluomo.annotation_dao.*.*(..))")
    //使用一个返回值为void方法体为空的方法来命名切入点
    public void myPointCut(){}

    @Before("myPointCut()")
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知:模拟执行权限检测");
        System.out.println("目标类:"+joinPoint.getTarget());
        System.out.println("被植入增强处理的目标方法为"+joinPoint.getSignature().getName());
    }

    @AfterReturning(value = "myPointCut()")
    public void myAfterReturning(JoinPoint joinPoint){
        System.out.println("后置通知:模拟记录日志");
        System.out.println("被植入增强处理的目标方法为"+joinPoint.getSignature().getName());
    }

    /**
     *
     * 环绕通知
     * */
    @Around("myPointCut()")
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{

        System.out.println("环绕开始:执行目标方法之前模拟事务开启啦");

        //执行目标方法　proceedingJoinPoint.getSignature().getName()
        Object obj = proceedingJoinPoint.proceed();

        System.out.println("环绕结束:执行目标方法之后模拟关闭事务");
        return  obj;
    }


    /**　异常通知 */
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        System.out.println("异常通知:出错了"+e.getMessage());
    }

    /** 最终通知*/
    @After("myPointCut()")
    public void myAfter(){
        System.out.println("最终通知,模拟方法结束后释放");

    }
}
