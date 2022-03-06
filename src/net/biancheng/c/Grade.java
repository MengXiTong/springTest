package net.biancheng.c;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Grade {
    private static final Log LOGGER = LogFactory.getLog(Grade.class);
    private Integer gradeId;
    private String gradeName;

    public Grade() {
        LOGGER.info("正在执行 Grade 的无参构造方法");
    }

    public Grade(Integer gradeId, String gradeName) {
        LOGGER.info("正在执行 Grade 的有参构造方法，参数分别为：gradeId=" + gradeId + ",gradeName=" + gradeName);
        this.gradeId = gradeId;
        this.gradeName = gradeName;
    }

    public void setGradeId(Integer gradeId) {
        LOGGER.info("正在执行 Grade 类的 setGradeId() 方法…… 参数分别为：gradeId=" + gradeId);
        this.gradeId = gradeId;
    }

    public void setGradeName(String gradeName) {
        LOGGER.info("正在执行 Grade 类的 setGradeName() 方法…… 参数分别为：gradeName=" + gradeName);
        this.gradeName = gradeName;
    }

    @Override
    public String toString() {
        return "Grade测试{" + "gradeId=" + gradeId + ", gradeName='" + gradeName + '\'' + '}';
    }
}
