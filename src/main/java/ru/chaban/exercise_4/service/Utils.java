package ru.chaban.exercise_4.service;

import ru.chaban.exercise_4.utility.ConvertRawToUsers;
import ru.chaban.exercise_4.utility.ConvertRawToUsersInteface;

import java.lang.reflect.Proxy;

public class Utils {

    public static Object cache(Object obj) {
        Class cls = obj.getClass();
        Object res = Proxy.newProxyInstance(cls.getClassLoader(),
                new Class[]{ConvertRawToUsersInteface.class},
                new FunctionForTestHadler(obj));


        return res;
    }
}
