package expressions;

import java.util.function.Predicate;
import java.util.ArrayList;
class predicate
{
         String name;
         String designation;
         double salary;
         String city;
         predicate(String name,String designation,double salary,String city)
         {
         this.name=name;
         this.designation=designation;
         this.salary=salary;
         this.city=city;
         }
         public String toString()
         {
         String s=String.format("[%s,%s,%.2f,%s]",name,designation,salary,city);
         return s;
         }
         public boolean equals(Object obj)
         {
         predicate e=(predicate)obj;
         if(name.equals(e.name)&&designation.equals(e.designation)&&salary==e.salary && city==e.city)
         {
         return true;
         }
         else
         {
         return false;
         }
         }
         }
         class Test
 {
         public static void main(String[] args)
         {
         ArrayList<predicate> list= new ArrayList<predicate>();
         populate(list);

         Predicate<predicate> p1= emp->emp.designation.equals("Manager");
         System.out.println("Managers Information:");
         display(p1,list);

         Predicate<predicate> p2= emp->emp.city.equals("Bangalore");
         System.out.println("Bangalore predicates Information:");
         display(p2,list);

         Predicate<predicate> p3= emp->emp.salary<20000;
         System.out.println("predicates whose slaray <20000 To Give Increment:");
         display(p3,list);

         System.out.println("All Managers from Bangalore city for Pink Slip:");
         display(p1.and(p2),list);

         System.out.println("predicates Information who are either Managers or salary <20000");
         display(p1.or(p3),list);

         System.out.println("All predicates Information who are not managers:");
         display(p1.negate(),list);

         Predicate<predicate> isCEO=Predicate.isEqual(new predicate("Durga","CEO",30000,"Hyderabad"));

         predicate e1=new predicate("Durga","CEO",30000,"Hyderabad");
         predicate e2=new predicate("Sunny","Manager",20000,"Hyderabad");
         System.out.println(isCEO.test(e1));//true
         System.out.println(isCEO.test(e2));//false

         }
         public static void populate(ArrayList<predicate> list)
         {
         list.add(new predicate("Durga","CEO",30000,"Hyderabad"));
         list.add(new predicate("Sunny","Manager",20000,"Hyderabad"));
        list.add(new predicate("Mallika","Manager",20000,"Bangalore"));
         list.add(new predicate("Kareena","Lead",15000,"Hyderabad"));
         list.add(new predicate("Katrina","Lead",15000,"Bangalore"));
         list.add(new predicate("Anushka","Developer",10000,"Hyderabad"));
         list.add(new predicate("Kanushka","Developer",10000,"Hyderabad"));
         list.add(new predicate("Sowmya","Developer",10000,"Bangalore"));

         list.add(new predicate("Ramya","Developer",10000,"Bangalore"));
         }
         public static void display(Predicate<predicate> p, ArrayList<predicate> list)
         {
         for (predicate e: list )
         {
         if(p.test(e))
         {
         System.out.println(e);
         }
         }
         System.out.println("**************************************************");
         }
         }
