package net.biancheng.c;

import net.biancheng.c.controller.UserController;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.HashSet;
import java.util.Set;

/**
 * 学习参考网址：http://c.biancheng.net/spring/
 */
public class MainApp {
    private static final Log LOGGER = LogFactory.getLog(MainApp.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
//        BeanFactory context = new ClassPathXmlApplicationContext("Beans.xml");
//
//        /*第一个Spring程序*/
//        HelloWorld obj = context.getBean("helloWorld2", HelloWorld.class);
//        obj.getMessage();
//
//        /*Spring Bean属性注入，构造函数注入*/
//        Student student = context.getBean("student",Student.class);
//        System.out.println(student.toString());
//
//        /*Spring Bean属性注入，setter 注入*/
//        Student student2 = context.getBean("student2", Student.class);
//        LOGGER.info(student2);
//
//        /*Spring Bean属性注入，短命名空间注入*/
//        Employee employee = context.getBean("employee", Employee.class);
//        LOGGER.info(employee);
//
//        /*Spring注入内部Bean，setter 方式注入内部 Bean*/
//        Employee employee2 = context.getBean("employee2", Employee.class);
//        LOGGER.info(employee2);
//
//        /*Spring注入内部Bean，构造函数方式注入内部 Bean*/
//        Employee employee3 = context.getBean("employee3", Employee.class);
//        LOGGER.info(employee3);
//
//        /*Spring注入集合*/
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("BeansCollections.xml");
//        JavaCollection javaCollection = context1.getBean("javaCollection", JavaCollection.class);
//        LOGGER.info(javaCollection);
//
//        /*Spring注入其他类型的属性*/
//        ExampleBean exampleBean = context.getBean("exampleBean", ExampleBean.class);
//        LOGGER.info(exampleBean);
//
//        /*Spring Bean作用域，singleton*/
//        SingletonBean singletonBean = context.getBean("singletonBean", SingletonBean.class);
//        SingletonBean singletonBean2 = context.getBean("singletonBean", SingletonBean.class);
//        System.out.println(singletonBean);
//        System.out.println(singletonBean2);
//
//        /*Spring Bean作用域，prototype*/
//        PrototypeBean prototypeBean = context.getBean("prototypeBean", PrototypeBean.class);
//        PrototypeBean prototypeBean2 = context.getBean("prototypeBean", PrototypeBean.class);
//        System.out.println(prototypeBean);
//        System.out.println(prototypeBean2);
//
//        /*自定义 Bean 的生命周期，通过接口实现*/
//        ClassPathXmlApplicationContext context2 = new ClassPathXmlApplicationContext("Beans.xml");
//        LifeCycleBean lifeCycleBean = context2.getBean("lifeCycleBean", LifeCycleBean.class);
//        LOGGER.info(lifeCycleBean);
//        context2.close();
//
//        /*自定义 Bean 的生命周期，通过 XML 配置实现*/
//        XMLLifeCycleBean xmlLifeCycleBean = context2.getBean("xmlLifeCycleBean", XMLLifeCycleBean.class);
//        LOGGER.info(xmlLifeCycleBean);
//        context2.close();
//
//        /*自定义 Bean 的生命周期，使用注解实现*/
//        AnnotationLifeCycleBean annotationLifeCycleBean = context2.getBean("annotationLifeCycleBean", AnnotationLifeCycleBean.class);
//        LOGGER.info(annotationLifeCycleBean);
//        context2.close();
//
//        /*Spring后置处理器*/
//        AbstractApplicationContext context3 = new ClassPathXmlApplicationContext("Beans.xml");
//        HelloTest helloTest = (HelloTest) context3.getBean("helloTest");
//        helloTest.getMessage();
//        context3.registerShutdownHook();
//
//        /*Spring Bean继承*/
//        Dog dog = context.getBean("dog", Dog.class);
//        System.out.println(dog);

        /*Spring自动装配，看api就行，对注入内部Bean的扩充*/
        UserController userController = context.getBean("userController", UserController.class);
        userController.doStr();
    }
}
