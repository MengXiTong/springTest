package net.biancheng.c;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class DependBean {
    private static final Log LOGGER = LogFactory.getLog(DependBean.class);
    private String dependProperty;

    public void setDependProperty(String dependProperty) {
        LOGGER.info("正在执行 DependBean 类的 setDependProperty() 方法…… 参数分别为：dependProperty=" + dependProperty);
        this.dependProperty = dependProperty;
    }

    @Override
    public String toString() {
        return "DependBean{" +
                "dependProperty='" + dependProperty + '\'' +
                '}';
    }
}
