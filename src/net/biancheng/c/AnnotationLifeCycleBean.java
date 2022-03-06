package net.biancheng.c;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationLifeCycleBean {
    private static final Log LOGGER = LogFactory.getLog(AnnotationLifeCycleBean.class);
    //网站名称
    private String webName;
    //网站地址
    private String url;

    public AnnotationLifeCycleBean(String webName, String url) {
        LOGGER.info("正在执行 AnnotationLifeCycleBean 的有参构造方法，参数分别为：webName=" + webName + ",url=" + url);
        this.webName = webName;
        this.url = url;
    }

    @Override
    public String toString() {
        return "AnnotationLifeCycleBean{" +
                "webName='" + webName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    /**
     * 初始化回调方法
     */
    @PostConstruct
    public void init() {
        LOGGER.info("通过 @PostConstruct 注解，指定初始化方法：init() 方法");
    }

    /**
     * 销毁回调方法
     */
    @PreDestroy
    public void destroy() {
        LOGGER.info("通过 @PreDestroy 注解，指定初始化方法：destroy() 方法");
    }
}
