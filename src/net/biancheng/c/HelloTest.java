package net.biancheng.c;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class HelloTest {
    private String message;

    public void setMessage(String message) {
        System.out.println("正在执行 HelloTest 类的 setMessage() 方法…… 参数分别为：message=" + message);
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Message : " + message);
    }

    public void init() {
        System.out.println("Bean 正在初始化");
    }

    public void destroy() {
        System.out.println("Bean 将要被销毁");
    }
}
