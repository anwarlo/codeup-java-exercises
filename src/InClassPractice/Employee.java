package InClassPractice;

abstract class Employee {

    protected String name;
    protected String department;


    Employee(String name, String department){
        this.name = name;
        this.department = department;
    }

    public String getName(){
        return name;
    }

    public String getDepartment(){
        return department;
    }

    public abstract String work();

}
