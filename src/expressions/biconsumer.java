package expressions;

import java.util.function.*;
import java.util.*;
 class employee
 {
        String name;
         double salary;
         employee(String name, double salary)
         {
         this.name=name;
         this.salary=salary;
         }
         }
         class biconsumer
 {
        public static void main(String[] args)
        {
        ArrayList<employee> l= new ArrayList<employee>();
        populate(l);
        BiConsumer<employee,Double> c=(e, d)->e.salary=e.salary+d;
        for(employee e:l)
        {
        c.accept(e,500.0);
        }
        for(employee e:l)
        {
        System.out.println("employee Name:"+e.name);
        System.out.println("employee Salary:"+e.salary);
        System.out.println();
        }

        }
         public static void populate(ArrayList<employee> l)
         {
         l.add(new employee("karni",1000));
         l.add(new employee("Sunny",2000));
         l.add(new employee("Bunny",3000));
         l.add(new employee("Chinny",4000));
         }
         }
