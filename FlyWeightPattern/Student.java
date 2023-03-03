package FlyWeightPattern;

public class Student {
    String name;
    int rollNo;
    FlyWeight type;
    Student(String name, int rollNo, String className, String courseType, int courseID) {
        this.name = name;
        this.rollNo = rollNo;
        type = FlyWeight.getType(className, courseType, courseID);
    }

    public void PrintDetails() {
        System.out.println(name);
        System.out.println(rollNo);
        System.out.println(type.className);
        System.out.println(type.courseType);
        System.out.println(type.courseID);
    }
}
