package net.biancheng.c;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Course {
    private static final Log LOGGER = LogFactory.getLog(Course.class);
    private Integer courseId;
    private String courseName;

    public void setCourseId(Integer courseId) {
        LOGGER.info("正在执行 Course 类的 setCourseId() 方法…… 参数分别为：courseId=" + courseId);
        this.courseId = courseId;
    }

    public void setCourseName(String courseName) {
        LOGGER.info("正在执行 Course 类的 setCourseName() 方法…… 参数分别为：courseName=" + courseName);
        this.courseName = courseName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                "，courseName=" + courseName +
                "}";
    }
}
