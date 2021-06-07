package test;

import onetwoweek.linkedlist.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.groupingBy;

public class Test1 {

   public static void main(String[] args) {
      Salary sal1= new Salary("A", "Year", 100);
      Salary sal2= new Salary("B", "Year", 200);
      Salary sal3= new Salary("A", "Monthly", 300);
      Salary sal4= new Salary("B", "Year", 400);
      Salary sal5= new Salary("A", "Monthly", 500);


      List<Salary> lst = new ArrayList<>();

      lst.add(sal1);
      lst.add(sal2);
      lst.add(sal3);
      lst.add(sal4);
      lst.add(sal5);
   }


}
