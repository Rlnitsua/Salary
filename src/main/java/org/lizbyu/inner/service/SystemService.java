package org.lizbyu.inner.service;

import org.lizbyu.inner.utils.LogUtils;

import java.lang.reflect.Constructor;

public class SystemService {
    private static final String TAG = "SystemService";
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

    public Manager getManager(Class<? extends Manager> managerClazz) {
        Constructor<? extends Manager> declaredConstructor;
        try {
            declaredConstructor = managerClazz.getDeclaredConstructor();
            return declaredConstructor.newInstance();
        } catch (Exception e) {
            LogUtils.e(TAG, "get " + managerClazz + " error : " + e.getMessage());
            return null;
        }
    }
}
