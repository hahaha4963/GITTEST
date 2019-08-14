package com.zf.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class MyTest {

    public static Map m = new HashMap() {
        {
            put("a", "2");
        }
    };

    public static void main(String[] args) {
        Integer a = (Integer) m.get("a");

        System.out.println(a)
        ;


//        Date date = new Date();
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            Date parse = dateFormat.parse("2019-06-06 03:00:00");
//            boolean after = parse.before(date);
//            System.out.println(after);
//            System.out.println("***************");
//            System.out.println(date);
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }


    }

}
