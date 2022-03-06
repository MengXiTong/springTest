package net.biancheng.c;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class XMLLifeCycleBean {
    private static final Log LOGGER = LogFactory.getLog(XMLLifeCycleBean.class);
    private String webName;
    private String url;

    public void setWebName(String webName) {
        LOGGER.info("正在执行 XMLLifeCycleBean 类的 setWebName() 方法…… 参数分别为：webName=" + webName);
        this.webName = webName;
    }

    public void setUrl(String url) {
        LOGGER.info("正在执行 XMLLifeCycleBean 类的 setUrl() 方法…… 参数分别为：url=" + url);
        this.url = url;
    }

    @Override
    public String toString() {
        return "XMLLifeCycleBean{" +
                "webName='" + webName + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    /**
     * 初始化回调方法
     */
    public void init() {
        LOGGER.info("在 XML 配置中通过 init-method 属性指定初始化方法：init() 方法");
    }

    /**
     * 销毁回调方法
     */
    public void destroy() {
        LOGGER.info("在 XML 配置中通过 destroy-method 属性指定回调方法：destroy() 方法");
    }
}
