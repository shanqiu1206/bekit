/* 
 * 作者：钟勋 (e-mail:zhongxunking@163.com)
 */

/*
 * 修订记录:
 * @author 钟勋 2017-04-04 18:41 创建
 */
package org.bekit.flow.annotation.listener;

import org.bekit.event.annotation.listener.Listen;
import org.bekit.flow.listener.ListenFlowExceptionResolver;
import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.*;

/**
 * 监听流程异常事件
 * （配合TheFlowListener一起使用；当流程执行过程中发生任何异常，都会调用注入本注解对应的方法；
 * 一个TheFlowListener内最多只能出现一次；对应的监听方法入参类型必须为（Throwable, TargetContext））
 */
@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Listen(resolver = ListenFlowExceptionResolver.class)
public @interface ListenFlowException {
    /**
     * 是否按照优先级升序
     */
    @AliasFor(annotation = Listen.class, attribute = "priorityAsc")
    boolean priorityAsc() default true;
}
