// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        List<Employee> l1 = new ArrayList<>();
        Employee e1 = new Employee(1,"XYZ");
        Employee e2 = new Employee(2,"pqr");
        Employee e3 = new Employee(3,"aaa");
        Employee e4 = new Employee(4,"java");
        Employee e5 = new Employee(5,"c++");
        Employee e6 = new Employee(6,"python");
        Employee e7 = new Employee(7,"django");
        Employee e8 = new Employee(8,"php");
        Employee e9 = new Employee(9,"pyt");
        Employee e10 = new Employee(10,"jango");
        l1.add(e1);
        l1.add(e2);
        l1.add(e3);
        l1.add(e4);
        l1.add(e5);
        l1.add(e6);
        l1.add(e7);
        l1.add(e8);
        l1.add(e9);
        l1.add(e10);
        // Will not fail or concurrent modification expection list agin loaded after removal of obj and 
        // for(int i=0;i<l1.size();i++){
        //     if(itr.getId()%2==0)
        //         l1.remove(itr);
        // }
        //Fail Safe Iterator
        Iterator<Employee> itr = l1.iterator();
        while(itr.hasNext()){
            Employee e = itr.next();
            if(e.getId()%2==0)
                l1.remove(itr);
        }
        //Result In concurrent Modification exception as  adv for loop uses fail fast interator
        // for(Employee l : l1){
        //     if(l.getId()%2==0)
        //         l1.remove(l);
        // }
        System.out.println(l1);
    }
}

class Employee{
    int id;
    String name;
    
    public Employee(int id,String name){
        this.name = name;
        this.id = id;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString(){
        return "ID="+this.getId()+", Name="+this.getName();
    }
}
