package net.biancheng.c;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Employee {
    private static final Log LOGGER = LogFactory.getLog(Employee.class);
    private String empNo;
    private String empName;
    private Dept dept;

    public Employee() {
        LOGGER.info("正在执行 Employee 的无参构造方法");
    }

    public Employee(String empNo, String empName, Dept dept) {
        LOGGER.info("正在执行 Employee 的有参构造方法，参数分别为：empNo=" + empNo + ",empNo=" + empName+ ",dept=" + dept);
        this.empNo = empNo;
        this.empName = empName;
        this.dept = dept;
    }

    public void setEmpNo(String empNo) {
        LOGGER.info("正在执行 Employee 类的 setEmpNo() 方法…… 参数分别为：empNo=" + empNo);
        this.empNo = empNo;
    }

    public void setEmpName(String empName) {
        LOGGER.info("正在执行 Employee 类的 setEmpName() 方法…… 参数分别为：empName=" + empName);
        this.empName = empName;
    }

    public void setDept(Dept dept) {
        LOGGER.info("正在执行 Employee 类的 setDept() 方法…… 参数分别为：dept=" + dept);
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" + "empNo='" + empNo + '\'' + ", empName='" + empName + '\'' + ", dept=" + dept + '}';
    }
}
