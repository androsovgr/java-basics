package ru.mephi.java.ch06.sec07;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.stream.Stream;

public class GenericInfo {

  public static void main(String[] args) throws Exception {
    demo(Stream.class);
  }

  private static void demo(Class<?> cl) {
    TypeVariable<?>[] vars = cl.getTypeParameters();
    System.out.println(Arrays.toString(vars));
    Type[] bounds = vars[0].getBounds();
    System.out.println(Arrays.toString(bounds));
    if (bounds[0] instanceof ParameterizedType) {
      ParameterizedType p = (ParameterizedType) bounds[0];
      Type[] typeArguments = p.getActualTypeArguments();
      if (typeArguments[0] instanceof WildcardType) {
        WildcardType t = (WildcardType) typeArguments[0];
        Type[] upper = t.getUpperBounds();
        Type[] lower = t.getLowerBounds();
        if (lower.length > 0) {
          String description = lower[0].getTypeName();
        }
      }
    }
  }
}
