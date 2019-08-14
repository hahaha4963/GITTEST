package com.neicunTest;

import java.io.Serializable;
import java.util.*;

public class Demo1 implements Serializable{

    public static void main(String[] args) {

        Map<String,List<People>> map = new HashMap<String, List<People>>();
        List<People> peopleList = new ArrayList<People>();
        List<People> list = new ArrayList<People>();
        People people = new People("哈哈",1);
        People people2 = new People("嘿嘿",2);
        People people3 = new People("wwww",33);
        People people4 = new People("cccc",44);
        People people5 = new People("1234",666);

        peopleList.add(people);
        peopleList.add(people2);

        list.add(people3);
        list.add(people4);
        list.add(people5);

        map.put("a",peopleList);
        map.put("b",list);


        for (Map.Entry<String, List<People>> stringListEntry : map.entrySet()) {
            String key = stringListEntry.getKey();
            List<People> value = stringListEntry.getValue();
            if (key.equals("a")){
                System.out.println(key+"等于a============="+value);
            }else {
                System.out.println(key+"等于b============="+value.toString());
            }
        }

        Iterator<Map.Entry<String, List<People>>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, List<People>> next = iterator.next();
            String key = next.getKey();
            List<People> value = next.getValue();
            System.out.println(key+"++++++++++++++"+value.toString());
        }
    }
}
