import java.util.*;
class Employee{
    private int Eid;
    private String name;
    Employee(int Eid, String name){
        this.Eid=Eid;
        this.name=name;
    }

    public void display(){
        System.out.println("Employee id: " + Eid);
        System.out.println("Employee name: " + name);
    }

}
public class emp {
    public static void main(String [] args){
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(1,"harsha"));
        list.add(new Employee(2,"mahesh"));

        for(Employee e : list){
            e.display();
        }
    }
}