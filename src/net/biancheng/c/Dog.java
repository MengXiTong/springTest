package net.biancheng.c;

public class Dog {
    private String name;
    private Integer age;
    //    private String age;
    private String call;

    public void setName(String name) {
        System.out.println("Dog setName：" + name);
        this.name = name;
    }

    public void setAge(Integer age) {
        System.out.println("Dog setAge：" + age);
        this.age = age;
    }


//    public void setAge(String age) {
//        System.out.println("Dog setAge：" + age);
//        this.age = age;
//    }

    public void setCall(String call) {
        System.out.println("Dog setCall：" + call);
        this.call = call;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", call='" + call + '\'' +
                '}';
    }
}
