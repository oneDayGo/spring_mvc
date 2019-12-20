package com.xiaoluomo.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAspect {

    //前置通知
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知:模拟执行权限检查");
        System.out.println("目标类是:"+joinPoint.getTarget());
        System.out.println("被植入的目标方法为"+joinPoint.getSignature().getName());

    }

    //后置通知
    public void myAfterReturning(JoinPoint joinPoint){
        System.out.println("后置通知:模拟记录日志");
        System.out.println("被植入增强处理的目标方法为"+joinPoint.getSignature().getName());


    }

    //环绕通知
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable{
        //开始
        System.out.println("环绕开始:执行目标方法之前模拟事务开启");

        //执行目标方法　proceedingJoinPoint.getSignature().getName()
        Object obj = proceedingJoinPoint.proceed();



        //结束
        System.out.println("环绕结束:执行目标方法之后模拟关闭事务");
       // return  obj;
        return  null;
    }

    //异常通知
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e){
        //System.out.println("异常通知:出错了"+e.getMessage());
    }

    //最终通知
    public void myAfter(){

        //System.out.println("最终通知:模拟方法结束后释放资源")oooooooooosdsdooodsodsodsooodsodsodsoddkd     asssvvvvvv88888sssss4545454ppppppppppppppppppppppppppppppppppppppppppppppppppppppppppqewewe
        //
        // ;
    }
}
