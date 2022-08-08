package com.atguigu.java;

import com.atguigu.java1.Person;
import com.atguigu.java1.Student;
import org.junit.Test;

import java.util.*;

import static jdk.nashorn.internal.objects.Global.print;

/**
 * @author shkstart
 * @create 2022-03-26 20:30
 */
public class GenericTest {
   @Test
    public void test1(){
       ArrayList list = new ArrayList();
       list.add(123);
       list.add(256);
       list.add(345);
       list.add(789);

//       list.add("Tom");

       for(Object obj : list){
           int value = (int) obj;
           System.out.println(value);
       }
   }

   @Test
    public void test2(){
       ArrayList<Integer> list = new ArrayList<Integer>();
       list.add(123);
       list.add(234);
       list.add(567);
       list.add(899);

//       for(Integer source : list){
//           System.out.println(source);
//       }

       Iterator<Integer> iterator = list.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

   }

   @Test
    public void test3(){
       Map<String , Integer> map = new HashMap<String , Integer>();
       map.put("wb",12);
       map.put("fchj",76);
       map.put("shjd",67);
       map.put("cvcbs",78);
       map.put("vdds",56);

       Set<Map.Entry<String, Integer>> entries = map.entrySet();
       Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
       while(iterator.hasNext()){
         Map.Entry<String,Integer> e = iterator.next();
           String key = e.getKey();
           Integer value = e.getValue();
           System.out.println(key+">>>>>"+value);

       }

   }

   @Test
    public void test5(){
       List <String> list1 = null;
       List <Object> list2 = null;

       List<?> list = null;
       list = list1;
       list = list2;

//       print(list1);
//       print(list2);

       List<String> list3 = new ArrayList<>();
       list3.add("AA");
       list3.add("BB");
       list3.add("CC");
       list3.add("DD");

       list = list3;
       Object o = list.get(0);
       System.out.println(o);

   }

   public void print(List <?> list){
       Iterator <?> iterator = list.iterator();
       while(iterator.hasNext()){
           System.out.println(iterator.next());
       }

   }
   @Test
    public void test6(){
       List<? extends Person> list1 = null;
       List<? super Person> list2 = null;

       List<Person> list3 = null;
       List<Student> list4 = null;
       List<Object> list5 = null;

       list1 = list3;
       list1 = list4;
//       list1 = list5;

       list2 = list3;
//       list2 = list4;
       list2 = list5;

       list1 = list4;
       Person person = list1.get(0);

       list2 = list3;
       Object object = list2.get(0);


       list2.add(new Person());
       list2.add(new Student());

   }

}


