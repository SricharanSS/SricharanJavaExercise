package FlyWeightPattern;

public class Main {
    public static void main(String[] args) {
        Student stud1 = new Student("Sricharn", 101, "IT-A", "FullTime", 1);
        Student stud2 = new Student("Ekesh", 102, "IT-B", "Caras", 2);
        Student stud3 = new Student("Sathish", 103, "IT-A", "FullTime", 1);
        Student stud4 = new Student("Madan", 104, "IT-B", "Caras", 2);
        Student stud5 = new Student("Aravind", 105, "IT-B", "Caras", 2);
        Student stud6 = new Student("Somnath", 106, "IT-B", "Caras", 2);


        stud1.PrintDetails();
        System.out.println();

        stud2.PrintDetails();
        System.out.println();

        stud3.PrintDetails();
        System.out.println();

        stud4.PrintDetails();
        System.out.println();

        stud5.PrintDetails();
        System.out.println();

        stud6.PrintDetails();
        System.out.println();
    }
}
