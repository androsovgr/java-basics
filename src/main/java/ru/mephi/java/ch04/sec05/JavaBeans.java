package ru.mephi.java.ch04.sec05;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

public class JavaBeans {
  public static void main(String[] args) throws Exception {
    Employee e = new Employee(20, "Name");
    PropertyDescriptor sp = findProperty(Employee.class, "salary");
    System.out.println(sp.getReadMethod().invoke(e));
    // 20.0
    sp.getWriteMethod().invoke(e, 30);
    System.out.println(e);
    // Employee [salary=30.0, name=Name]
  }

  private static PropertyDescriptor findProperty(Class<?> claz, String propertyName) throws Exception {
    BeanInfo info = Introspector.getBeanInfo(claz);
    PropertyDescriptor[] props = info.getPropertyDescriptors();
    for (PropertyDescriptor prop : props) {
      if (prop.getName().equals(propertyName))
        return prop;
    }
    return null;
  }
}
