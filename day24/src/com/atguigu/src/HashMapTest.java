package com.atguigu.src;

import org.junit.Test;

import java.util.*;

/**
 *  添加、删除、修改操作：
 *  Object put(Object key,Object value)：将指定key-value添加到(或修改)当前map对象中
 *  void putAll(Map m):将m中的所有key-value对存放到当前map中
 *  Object remove(Object key)：移除指定key的key-value对，并返回value
 *  void clear()：清空当前map中的所有数据
 *  元素查询的操作：
 *  Object get(Object key)：获取指定key对应的value
 *  boolean containsKey(Object key)：是否包含指定的key
 *  boolean containsValue(Object value)：是否包含指定的value
 *  int size()：返回map中key-value对的个数
 *  boolean isEmpty()：判断当前map是否为空
 *  boolean equals(Object obj)：判断当前map和参数对象obj是否相等
 *
 *
 *
 *  Set keySet()：返回所有key构成的Set集合
 *  Collection values()：返回所有value构成的Collection集合
 *  Set entrySet()：返回所有key-value对构成的Set集合
 *
 *
 * @author shkstart
 * @create 2022-03-25 21:41
 */
public class HashMapTest {

    @Test
    public void test2(){
       Map map = new HashMap();
       map.put("AA",123);
       map.put("BB", 234);
       map.put("CC", 456);

        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("*************************");

        Collection values = map.values();
        for(Object obj : values){
            System.out.println(obj);
        }
        System.out.println("****************");
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while(iterator1.hasNext()) {
            Object obj = iterator1.next();
            Map.Entry entry =(Map.Entry)obj;
            System.out.println(entry);
        }

        System.out.println("****************");
        Set set2 = map.keySet();
        Iterator iterator2 = set2.iterator();
        while(iterator2.hasNext()) {
            Object key = iterator2.next();
            Object value = map.get(key);
            System.out.println(key + ">>>>>>"+value);

        }
    }



    @Test
    public void test() {
        Map map = new HashMap();
        map.put("AA", 123);
        map.put("BB", 234);
        map.put("CC", 456);
        System.out.println(map);
        System.out.println(map.get("AA"));
        System.out.println(map.containsKey("DD"));
        System.out.println(map.containsValue(123));
        System.out.println(map.size());

        System.out.println(map.isEmpty());
        Map map2 = new HashMap();
        map2.put("AA", 123);
        map2.put("BB", 234);
        map2.put("CC", 456);
        System.out.println(map.equals(map2));


        Map map1 = new HashMap();
        map1.put("DD", 123);
        map1.put("EE", 234);

        map.putAll(map1);
        System.out.println(map);

        Object value = map.remove("AA");
        System.out.println(value);
        System.out.println(map);

        map.clear();
        System.out.println(map.size());
        System.out.println(map);


    }
}
