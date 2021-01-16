package OOD;

public class Employee {
    static double bonusRate = 0.1;

    final String name;
    final String id;
    int age;
    int salary;
    int level;

    Employee(String name, int age, String id, int level){
        this.name = name;
        this.age = age;
        this.id = id;
        this.level = level;
    }

    void printlnfo() {
        System.out.println("Name" + name + ";age:" + age + ";ID:"+id);
    }

    void setAge(int age){
        this.age = age;
    }

    public int calculateSalary(double performanceScore){
            this.salary = (int) (performanceScore * (1+bonusRate));
            return salary;
    }

    public static void main(String[] args) {

    }
}
