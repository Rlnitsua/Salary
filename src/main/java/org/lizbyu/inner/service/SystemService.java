package org.lizbyu.inner.service;

import java.lang.reflect.Constructor;

public class SystemService {
    private static SystemService instance;

    private SystemService() {}

    public static SystemService instance() {
        if (instance == null) {
            synchronized (SystemService.class) {
                if (instance == null) {
                    instance = new SystemService();
                }
            }
        }
        return instance;
    }

    public Manager getManager(Class<? extends Manager> managerClazz) throws Exception {
        Constructor<? extends Manager> declaredConstructor = managerClazz.getDeclaredConstructor();
        return declaredConstructor.newInstance();
    }
}
