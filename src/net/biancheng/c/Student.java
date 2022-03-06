package net.biancheng.c;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Student {
    private static final Log LOGGER = LogFactory.getLog(Student.class);
    private int id;
    private String name;
    private Grade grade;

    public Student() {
        LOGGER.info("正在执行 Student 的无参构造方法");
    }

    public Student(int id, String name, Grade grade) {
        LOGGER.info("正在执行 Student 的有参构造方法，参数分别为：id=" + id + ",name=" + name + ",grade=" + grade);
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public void setId(int id) {
        LOGGER.info("正在执行 Student 类的 setId() 方法…… 参数分别为：id=" + id);
        this.id = id;
    }

    public void setName(String name) {
        LOGGER.info("正在执行 Student 类的 setName() 方法…… 参数分别为：name=" + name);
        this.name = name;
    }

    public void setGrade(Grade grade) {
        LOGGER.info("正在执行 Student 类的 setGrade() 方法…… 参数分别为：grade=" + grade);
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name='" + name + '\'' + ", grade=" + grade + '}';
    }
}
