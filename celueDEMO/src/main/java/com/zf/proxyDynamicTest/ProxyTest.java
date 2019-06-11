package com.zf.proxyDynamicTest;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProxyTest {

    public static void main(String[] args) {
        Performan performan = new PerformanImpl();
        Performan performanJdk = JDKDynamicTest.newProxyInstance(performan);
        Performan performanCglib = CglibDynamicTest.newInstanceProxy(PerformanImpl.class);

        //预热
        int preCount = 10000;
        runWithoutMonitor(performan, preCount);
        runWithoutMonitor(performanJdk, preCount);
        runWithoutMonitor(performanCglib, preCount);

        //执行测试
        Map<String, Performan> testss = new LinkedHashMap<String, Performan>();
        testss.put("performan ", performan);
        testss.put("jdk       ", performanJdk);
        testss.put("cglib     ", performanCglib);

        int repeatCount = 3;
        int runCount = 1000000;
        runTest(repeatCount, runCount, testss);

        runCount = 5000000;
        runTest(repeatCount, runCount, testss);
    }

    private static void runTest(int repeatCount, int runCount, Map<String, Performan> tests) {
        System.out.println(String.format("========== run test : [repeatCount=%s] [runCount=%s] [java.version=%s] ===========",
                repeatCount, runCount, System.getProperty("java.version")));

        for (int i = 0; i < repeatCount; i++) {
            System.out.println(String.format("========= test : [%s] =============", i + 1));
            for (String key : tests.keySet()) {
                runWithMonitor(tests.get(key), runCount, key);
            }
        }
    }

    private static void runWithoutMonitor(Performan performan, int runCount) {
        for (int i = 0; i < runCount; i++) {
            performan.test(i);
        }
    }

    private static void runWithMonitor(Performan performan, int runCount, String tag) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < runCount; i++) {
            performan.test(i);
        }

        long end = System.currentTimeMillis();
        System.out.println("[" + tag + "] total time:" + (end - start) + "ms");
    }
}
