package com.zf.proxyDynamicTest;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibDynamicTest implements MethodInterceptor {

    public CglibDynamicTest() {
    }

    public static <T extends Performan> Performan newInstanceProxy(Class<T> targetInstanceClazz) {
        Enhancer enhancer = new Enhancer();
        enhancer.setCallback(new CglibDynamicTest());
        enhancer.setSuperclass(targetInstanceClazz);

        return (Performan) enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        return methodProxy.invokeSuper(o, objects);
    }
}
