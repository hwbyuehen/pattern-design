# pattern-design
设计模式相关

uml目录：/src/main/java/com/yuehen/pattern/uml/

1、工厂模式
抽象工厂模式中的产品族和产品等级结构之间的区别：产品族一般为品牌，是一个比产品等级维度高的；产品等级结构是该品牌下的各个产品。

2、单例模式
饿汉式单例模式：优点：没有加载锁、执行效率比较高。缺点：类加载时就初始化，不管用不用都占用空间。
懒汉式单例模式：优点：使用时才进行初始化。缺点：用锁的那种有性能问题。
注册式单例模式：优点：定义一组单例对象。缺点：用锁的那种有性能问题。
序列化单例模式：优点：防止序列化反序列化导致创建多个对象实例。
ThreadLocal单例：优点：定义线程级别的单例对象。

破坏单例的方式有：序列化反序列化，反射创建对象。

内部类单例执行逻辑：未使用该类时，不加载内部类，当使用时加载内部类，然后内部类的静态属性自动进行创建，获得的实例就是刚刚创建的单例对象。

3、为什么JDK动态代理中要求目标类实现的接口数量不能超过65535个？
if (interfaces.length > 65535) {
    throw new IllegalArgumentException("interface limit exceeded");
}

4、用一句自己的话总结学过的设计模式：
单例模式：独一无二的一个对象
工厂模式：直接给你创建好的对象，不用关注细节
原型模式：方便复制复杂对象
观察者模式：我感兴趣的事情发生的时候通知我
策略模式：用户选择多但结果一样
模板方法模式：准化流程，定制细节
适配器模式：兼容适配接口
代理模式：增强功能，找人做事
装饰模式：包装，同宗同源
委派模式：活你做，钱我拿

5、列举SpringAOP、IOC、DI应用的代码片段：


<?xml version="1.0" encoding="UTF-8" ?>
<beans xmlns="http://www.springframework.org/schema/beans"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns:context="http://www.springframework.org/schema/context"
    xsi:schemaLocation="http://www.springframework.org/schema/beans 
         http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
         http://www.springframework.org/schema/context
         http://www.springframework.org/schema/context/spring-context-3.0.xsd"
       default-autowire="byName"
         >
    <bean id="logDao" class="com.gupao.LogDao"/>
    <bean id="userDao" class="com.gupao.UserDao"/>
   <bean class="com.gupao.LogonService">
       <property name="logDao" ref="logDao"></property>
       <property name="userDao" ref="userDao"></property>
   </bean>
</beans>
IOC：创建对象的控制在spring初始化的时候来创建配置的bean
DI：对这个对象的赋值操作也通过自动注入的方式
AOP：下面这种对com.gupao包下面的所有类定义了一个统一的切面，就是请求完方法打印结果。

@Aspect
public class SystemLogAspect {
@Pointcut("execution(* com.gupao..*(..)) && !execution(* com.gupao.logging..*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object doInvoke(ProceedingJoinPoint pjp) {
        long start = System.currentTimeMillis();

        Object result = null;

        try {
            result = pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
            LOG.error(throwable.getMessage(), throwable);
            throw new RuntimeException(throwable);
        } finally {
            long end = System.currentTimeMillis();
            long elapsedTime = end - start;

            //定义统一的日志打印
            printLog(pjp, result, elapsedTime);

        }

        return result;
    }
}
