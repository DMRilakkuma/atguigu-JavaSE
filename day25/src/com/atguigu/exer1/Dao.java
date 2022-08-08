package com.atguigu.exer1;

import java.util.*;

/**
 * @author shkstart
 * @create 2022-03-30 14:54
 */
public class Dao <T> {
    private Map<String , T > map = new HashMap<>();

    public  void  save(String id, T entity) {
        map.put(id,entity);
    }

    public T get(String id){
        return map.get(id);
    }

    public void update(String id, T entity){
        if(map.containsKey(id)){
            map.put(id,entity);
        }
    }

    public List<T> list(){
        Collection<T> values = map.values();
        List <T> list = new ArrayList<>();
        for(T t : values){
            list.add(t);
        }

        return list;

    }

    public void delete(String id){
        map.remove(id);
    }

    @Override
    public String toString() {
        return "Dao{" +
                "map=" + map +
                '}';
    }
}
