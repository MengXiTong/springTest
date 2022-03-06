package net.biancheng.c;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class ExampleBean {
    private static final Log LOGGER = LogFactory.getLog(ExampleBean.class);

    private String propertyNull;
    private String propertyEmpty;
    private String propertyLiteral;
    private String propertyLiteral2;
    private DependBean dependBean;

    public void setPropertyNull(String propertyNull) {
        LOGGER.info("正在执行 ExampleBean 类的 setPropertyNull() 方法…… 参数分别为：propertyNull=" + propertyNull);
        this.propertyNull = propertyNull;
    }

    public void setPropertyEmpty(String propertyEmpty) {
        this.propertyEmpty = propertyEmpty;
    }

    public void setPropertyLiteral(String propertyLiteral) {
        this.propertyLiteral = propertyLiteral;
    }

    public void setPropertyLiteral2(String propertyLiteral2) {
        this.propertyLiteral2 = propertyLiteral2;
    }

    public void setDependBean(DependBean dependBean) {
        this.dependBean = dependBean;
    }

    public DependBean getDependBean() {
        return dependBean;
    }

    @Override
    public String toString() {
        return "ExampleBean{" +
                "propertyNull='" + propertyNull + "\'" +
                ", propertyEmpty='" + propertyEmpty + "\'" +
                ", propertyLiteral='" + propertyLiteral + '\'' +
                ", propertyLiteral2='" + propertyLiteral2 + '\'' +
                ", dependBean='" + dependBean + '\'' +
                '}';
    }
}
