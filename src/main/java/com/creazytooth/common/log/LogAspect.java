package com.creazytooth.common.log;

import com.alibaba.fastjson.JSONArray;
import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;


/**
 * @author CC
 * @ClassName: LogAspect
 * @Description: 日志
 * @date 2016年5月3日 下午11:41:39
 */
public class LogAspect {
    private Logger logger = Logger.getLogger(this.getClass());

    //任何通知方法都可以将第一个参数定义为 org.aspectj.lang.JoinPoint类型
    public void before(JoinPoint call) {
        //获取目标对象对应的类名
        String className = call.getTarget().getClass().getName();
        //获取目标对象上正在执行的方法名
        String methodName = call.getSignature().getName();
        Object[] args = call.getArgs();
        // TODO：将参数序列化成json
        JSONArray.toJSON(args);
        System.out.println(JSONArray.toJSON(args));
        System.out.println("前置通知:" + className + "类的" + methodName + "方法开始了" + args);
    }

    public void afterReturn() {
        System.out.println("后置通知:方法正常结束了");
    }

    public void after() {
        System.out.println("最终通知:不管方法有没有正常执行完成，一定会返回的");
    }

    public void afterThrowing(JoinPoint call, Throwable e) {
        System.out.println("异常抛出后通知:方法执行时出异常了" + e.getMessage());
    }

    //用来做环绕通知的方法可以第一个参数定义为org.aspectj.lang.ProceedingJoinPoint类型
    public Object doAround(ProceedingJoinPoint call) throws Throwable {
        Object result = null;
        //this.before(call);//相当于前置通知
        try {
            result = call.proceed();
            this.afterReturn(); //相当于后置通知
        } catch (Throwable e) {
            //this.afterThrowing(e);  //相当于异常抛出后通知
            System.out.println("异常堆栈：" + e.getMessage());
        } finally {
            this.after();  //相当于最终通知
        }
        return result;
    }
}
