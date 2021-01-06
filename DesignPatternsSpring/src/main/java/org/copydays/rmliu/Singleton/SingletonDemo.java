package org.copydays.rmliu.Singleton;

import java.util.HashMap;
import java.util.Map;

import static sun.tools.jconsole.inspector.XObject.NULL_OBJECT;

public class SingletonDemo {
    private final Map singletonObjects = new HashMap();

    protected Object getSingleton(String beanName) {
        Object singletinObjet = this.singletonObjects.get(beanName); // 检查缓存中是否存在实例

        if (singletinObjet == null) {
            synchronized (this.singletonObjects) {  // 如果为空，则锁定全局变量并进行处理
                singletinObjet = singletonFactory.getObjet(); // 调用工厂的 getObject 方法
                this.earlySingletonObjects.put(beanName, singletinObjet); // 纪录在缓存中
            }
        }
        return (singletinObjet != NULL_OBJECT ? singletinObjet : null);
    }
}
