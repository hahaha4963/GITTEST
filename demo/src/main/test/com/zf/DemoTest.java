package com.zf;

import org.junit.Test;

import java.util.ArrayList;

public class DemoTest {

    @Test
    public void Test1(){
        //自己的红包，目前初始为 0
        DemoModule zhangfan = new DemoModule("zhangfan");

        //定义些群成员
        DemoModule mahuateng = new DemoModule("mahuateng", 1000000D);
        DemoModule wangsicong = new DemoModule("wangsicong", 100000000D);

        zhangfan.qiangBalance(1000D);
        zhangfan.shouBalance();
        System.out.println("+++++++++++++++++++++++");

        //将他们拉进一个群中
        ArrayList<DemoModule> names = new ArrayList<DemoModule>();
        names.add(zhangfan);
        names.add(mahuateng);
        names.add(wangsicong);

        for (DemoModule name : names) {
            System.out.println(name.getAccountName()+","+name.getAccount());
        }
        System.out.println("=========================");

        mahuateng.faBalance(5000D);
        zhangfan.qiangBalance(2000D);

        mahuateng.shouBalance();
        zhangfan.shouBalance();

    }
}
