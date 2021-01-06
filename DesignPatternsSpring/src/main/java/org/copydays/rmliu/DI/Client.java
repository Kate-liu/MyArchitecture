package org.copydays.rmliu.DI;


import org.w3c.dom.Element;

import java.lang.reflect.Method;
import java.util.List;

public class Client {
    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    private static void parseBeanElement(Element beanElement) throws Exception {
        String id = beanElement.getAttribute("id");
        String clsName = beanElement.getAttribute("class");

        // 获取 class 对象
        Class<?> cls = Class.forName(clsName);
        // 直接调用无参构造函数，实例化一个对象
        Object beanObj = cls.getDeclaredConstructor().newInstance();

        beanMap.put(id, beanObj);  // 使用 map 存储所有的beans

        // 获取属性结点，并调用 setter 方法设置属性
        List<Element> subElemList = beanElement.elements();

        for (Element subElem : subElemList) {
            // 获取属性名称
            String name = subElem.getAttribute("name");
            // 获取属性值
            String ref = subElem.getAttribute("ref");

            Object refObj = beanMap.get(ref);
            // 根据属性名称构造 setter 方法名：set + 属性首字母大写 + 属性其他字符，例：setUserDao
            String methodName = "set" + (char) (name.charAt(0) - 32) + name.substring(1);
            // 获取Method 对象
            Method method = cls.getDeclaredMethod(methodName, refObj.getClass().getInterfaces()[0]);
            // 调用setter 方法，设置对象属性
            method.invoke(beanObj, refObj);
        }
    }
}
