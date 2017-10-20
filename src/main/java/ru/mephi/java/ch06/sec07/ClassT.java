package ru.mephi.java.ch06.sec07;

import java.awt.Color;
import java.lang.reflect.Constructor;

import ru.mephi.java.ch04.sec03.Size;

public class ClassT {

  public static <T> void right(Object obj, Class<T> cl) throws Exception {
    T t = cl.newInstance();

    Class<? extends Number> nClass = cl.asSubclass(Number.class);
    Number n = nClass.newInstance();

    T t2 = cl.cast(obj);

    Constructor<T> cnstr = cl.getConstructor(Integer.class);
    T t3 = cnstr.newInstance(5);

    T[] constants = cl.getEnumConstants();
  }

  public static <T> void notRight(Object obj, Class<T> cl) throws Exception {
    // T t = new T();

    Class<? extends Number> nClass = (Class<? extends Number>) cl;
    Number n = nClass.newInstance();

    T t2 = (T) obj;

    // T t3 = new T(5);

    // T[] ts = T.values();
  }

  public static void withRegularClass(Object obj) {
    ClassT instanse = new ClassT();

    Class<? extends Number> nClass = Integer.class;

    Integer i = (Integer) obj;

    Integer i2 = new Integer(5);

    Size[] sizes = Size.values();
  }
}
