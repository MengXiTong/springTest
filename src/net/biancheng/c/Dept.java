package net.biancheng.c;


import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Dept {
    private static final Log LOGGER = LogFactory.getLog(Dept.class);
    private String deptNo;
    private String deptName;

    public Dept() {
        LOGGER.info("正在执行 Dept 的无参构造方法");
    }

    public Dept(String deptNo, String deptName) {
        LOGGER.info("正在执行 Dept 的有参构造方法，参数分别为：deptNo=" + deptNo + ",deptName=" + deptName);
        this.deptNo = deptNo;
        this.deptName = deptName;
    }

    public void setDeptNo(String deptNo) {
        LOGGER.info("正在执行 Dept 类的 setDeptNo() 方法…… 参数分别为：deptNo=" + deptNo);
        this.deptNo = deptNo;
    }

    public void setDeptName(String deptName) {
        LOGGER.info("正在执行 Dept 类的 setDeptName() 方法…… 参数分别为：deptName=" + deptName);
        this.deptName = deptName;
    }

    @Override
    public String toString(){
        return "Dept{" + "deptNo='" + deptNo + '\'' + ", deptName='" + deptName + '\'' + '}';
    }
}
