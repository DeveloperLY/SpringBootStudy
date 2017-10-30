package net.developerly.springbootproject.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * @author LY
 * @create 2017/10/17
 **/

@Aspect
@Component
public class HttpAspect {
    private final static Logger logger = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * net.developerly.springbootproject.controller.PeopleController.*(..))")
    public void log() {
    }

    @Before("log()")
    public void doBefore(JoinPoint joinpoint) {
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        // URL
        logger.info("URL = {}", request.getRequestURL());

        // Method
        logger.info("Method = {}", request.getMethod());

        // Ip
        logger.info("Ip = {}", request.getRemoteAddr());

        // 类方法
        logger.info("ClassMethod = {}", joinpoint.getSignature().getDeclaringTypeName() + "." + joinpoint.getSignature().getName());

        // 参数
        logger.info("Args = {}", joinpoint.getArgs());
    }

    @After("log()")
    public void doAfter() {
        logger.info("HTTP请求后...");
    }

    @AfterReturning(returning = "object", pointcut = "log()")
    public void doAfterReturning(Object object) {
        logger.info("response = {}", object.toString());
    }

}
