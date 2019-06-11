package com.zf.proxyDynamicTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicTest implements InvocationHandler {

    private Performan performan;

    public JDKDynamicTest(Performan performan) {
        this.performan = performan;
    }

    public static Performan newProxyInstance(Performan performan) {
        return (Performan) Proxy.newProxyInstance(JDKDynamicTest.class.getClassLoader(),
                new Class<?>[]{Performan.class},
                new JDKDynamicTest(performan));
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(performan,args);
    }


}
