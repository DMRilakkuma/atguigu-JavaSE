package com.atguigu.src;

import org.junit.Test;

import java.util.*;

/**
 *
 * reverse(List)：反转 List 中元素的顺序
 * shuffle(List)：对 List 集合元素进行随机排序
 * sort(List)：根据元素的自然顺序对指定 List 集合元素按升序排序
 * sort(List，Comparator)：根据指定的 Comparator 产生的顺序对 List 集合元素进行排序
 * swap(List，int， int)：将指定 list 集合中的 i 处元素和 j 处元素进行交换
 * int frequency(Collection，Object)：返回指定集合中指定元素的出现次数
 * void copy(List dest,List src)：将src中的内容复制到dest中
 * boolean replaceAll(List list，Object oldVal，Object newVal)：使用新值替换
 * List 对象的所有旧值
 * @author shkstart
 * @create 2022-03-26 16:45
 */
public class CollectionsTest {
    @Test
    public void test(){
        List list = new ArrayList();
        list.add("123");
        list.add("234");
        list.add("567");
        list.add("789");
        list.add("156");
        list.add("156");
        list.add("156");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.swap(list,0,1);
        System.out.println(list);
        int frequency = Collections.frequency(list, "156");
        System.out.println(frequency);

        List list1 = Arrays.asList(new Object[list.size()]);
        Collections.copy(list1,list);
        System.out.println(list1);

        Collections.replaceAll(list,"156","999");
        System.out.println(list);
    }
}
