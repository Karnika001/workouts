package expressions;

import java.util.function.*;
 import java.util.*;
class supplier
 {
         public static void main(String[] args)
         {
         Supplier<String> s=()->
         {
         String symbols="ABCDEFGHIJKLMNOPQRSTUVWXYZ#$@";
         Supplier<Integer> d=()->(int)(Math.random()*10);
         Supplier<Character> c=()->symbols.charAt((int)(Math.random()*29));
         String pwd="";
         for(int i =1;i<=8;i++)
         {
         if(i%2==0)
         {
         pwd=pwd+d.get();
         }
         else
         {
         pwd=pwd+c.get();
         }
         }
         return pwd;
         };
         System.out.println(s.get());
         System.out.println(s.get());
         System.out.println(s.get());
         System.out.println(s.get());
         System.out.println(s.get());
         }
         }
