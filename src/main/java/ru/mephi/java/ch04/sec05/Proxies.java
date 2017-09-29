package ru.mephi.java.ch04.sec05;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class Proxies {
  public static void main(String[] args) {
    Object[] values = new Object[1000];
    for (int i = 0; i < values.length; i++) {
      Object value = new Integer(i);
      InvocationHandler ih = new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method m, Object[] args) throws Exception {
          System.out.println(value + "." + m.getName() + Arrays.toString(args));
          return m.invoke(value, args);
        }
      };
      values[i] = Proxy.newProxyInstance(null, value.getClass().getInterfaces(), ih);
    }
    Arrays.binarySearch(values, 10);
    // 499.compareTo[10]
    // 249.compareTo[10]
    // 124.compareTo[10]
    // 61.compareTo[10]
    // 30.compareTo[10]
    // 14.compareTo[10]
    // 6.compareTo[10]
    // 10.compareTo[10]
  }
}
