package net.biancheng.c;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class JavaCollection {
    private static final Log LOGGER = LogFactory.getLog(JavaCollection.class);
    private String[] courses;
    private List<String> list;
    private Map<String, String> maps;
    private Set<String> sets;
    private Course[] courses2;

    public void setCourses(String[] courses) {
        LOGGER.info("正在执行 JavaCollection 类的 setCourses() 方法…… 参数分别为：courses=" + Arrays.toString(courses));
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    public void setCourses2(Course[] courses2) {
        LOGGER.info("正在执行 JavaCollection 类的 setCourses2() 方法…… 参数分别为：courses2=" + Arrays.toString(courses2));
        this.courses2 = courses2;
    }

    @Override
    public String toString() {
        return "JavaCollection{" +
                "courses=" + Arrays.toString(courses) +
                ", list=" + list +
                ", maps=" + maps +
                ", sets=" + sets +
                ", courses2=" + Arrays.toString(courses2) +
                '}';
    }
}
