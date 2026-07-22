class Employee {
    String name;
    int id;
    String address;
    // String email;
    // Date joiningDate;
    // String panId;
    // double ctc;
    // String role;

    private Employee(EmployeeBuilder eb){
        this.name = eb.name;
        this.id = eb.id;
        this.address = eb.address;
    }
    public String getName(){
        return name;
    }
    public static class EmployeeBuilder{
        String name;
        int id;
        String address;
        // String email;
        // Date joiningDate;
        // String panId;
        // double ctc;
        // String role;
    
    public EmployeeBuilder name(String name){
        this.name = name;
        return this;
    }
    public EmployeeBuilder id(int id){
        this.id = id;
        return this;
    }
    public EmployeeBuilder address(String address){
        this.address = address;
        return this;
    }
    
    public Employee build(){
        if(id == 123){
            System.out.println("It will throw an exception now");
            throw new IllegalArgumentException ("This ID is blocked");
        }
        return new Employee(this); 
    }
    }

}

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee.EmployeeBuilder()
        .name("Dhara")
        .id(123)
        .build();
        System.out.println(e1.getName());
    }
}
/*If you don't want the program to terminate

Catch the exception:

try {
    Employee e = new Employee.EmployeeBuilder()
            .name("Dhara")
            .id(123)
            .build();

    System.out.println(e.getName());
} catch (IllegalArgumentException e) {
    System.out.println(e.getMessage());
}*/

