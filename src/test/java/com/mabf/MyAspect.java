package com.mabf;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author mabf
 * @create 2020-06-05 0:11
 */
@Aspect
@Component
class MyAspect {

    @Before("execution(* com.mabf.service.*.*(..))")
    public void name(Joinpoint joinpoint) {

    }
}
