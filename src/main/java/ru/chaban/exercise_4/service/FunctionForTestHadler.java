package ru.chaban.exercise_4.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

public class FunctionForTestHadler implements InvocationHandler {
    private Object obj;

    private Set<String> getMethods = new HashSet<>();

    public FunctionForTestHadler(Object obj) {
        this.obj = obj;
        System.out.println("Конструктор");

        for (Method md : obj.getClass().getMethods()) {
            if (md.isAnnotationPresent(LogTransformation.class)) {
                getMethods.add(md.getName());
            }
        }


    }



    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method==null)
            return null;

        if (proxy==null)
            return null;

        Object tmp = method.invoke(obj, args);;

        if (getMethods.contains(method.getName())) {
            System.out.println("==++** method=" + method.getName() + "; args=" + args[0].toString() + "; ret_Value=" + obj.toString() + "; time=" + LocalDateTime.now());
        }

        return tmp;

//        if (setCache.contains(method.getName())
//                && setMutator.containsKey(method.getName())) {
//            System.out.println("        и кеш и мутатор, просто вызываем метод");
//            return method.invoke(obj, args);
//        }
//
//        if (setCache.contains(method.getName())) {
//            System.out.println("     есть аннотация кеширования");
//
//            // получить значения ключа
//            String keyValue = method.getName() + "; " + getStrKeyValue();
//            System.out.println("        Ключ для кеша " + keyValue);
//
//            if (multiCache.get(keyValue) == null) {
//                CacheInfo cacheInfo = new CacheInfo();
//                cacheInfo.setObj(method.invoke(obj, args));
//                cacheInfo.setTime(LocalDateTime.now());
//                multiCache.put(keyValue, cacheInfo);
//
//                System.out.println("        посчитали, в кеш " + multiCache.get(keyValue));
//            } else {
//                // проверить актуальность кеша
//                long timeAfter = ChronoUnit.SECONDS.between(multiCache.get(keyValue).getTime(), LocalDateTime.now());
//
//                if (timeAfter > timeLive) {
//                    System.out.println("        Перевызов. Кеш потерял актуальность, прошло секунд " + timeAfter);
//                    return method.invoke(obj, args);
//                } else {
//                    System.out.println("        Прочитали из кеша" + multiCache.get(keyValue) + "; прошло секунд " + timeAfter);
//                    return multiCache.get(keyValue).getObj();
//                }
//            }
//
//            return multiCache.get(keyValue).getObj();
//        } else {
//            if (setMutator.containsKey(method.getName())) {
//                System.out.println("        мутатор");
//                // сбросить кеш
///*
//                for (String key : setCache.keySet()) {
//                    setCache.put(key, null);
//                }
//
// */
//            } else {
//                System.out.println("        Не мутатор");
//            }
//
//            System.out.println("        перевызов");
//            return method.invoke(obj, args);
    }

/*
        Method m = obj.getClass().getMethod(method.getName(), method.getParameterTypes());
        boolean hasMutatorAnn = false;
        boolean hasCasheAnn = false;

        for (Annotation a: m.getAnnotations())
        {
            if (a.annotationType().equals(Mutator.class)){
                hasMutatorAnn = true;
            };
            if (a.annotationType().equals(Cache.class)){
                hasCasheAnn = true;
            };
        }

        if (hasMutatorAnn) {
            //modCount++;
            modCounts.put(m.getName(), modCounts.containsKey(m.getName())?modCounts.get(m.getName())+1:1);
            System.out.println("Not cashed val from mutator ");
            return method.invoke(obj, args);

        }

        if (hasCasheAnn) {

            //Integer time = m.getAnnotation(Cache.class).time();
            if (!modCounts.containsKey(m.getName()) || modCounts.get(m.getName()) > 0) {
                System.out.println("Not cashed val: ");
                cashedVal = method.invoke(obj, args);
                cashes.put(m.getName(),cashedVal);


                Thread t  = new Thread(()->{
                    System.out.println("timer is running");
                    //Thread.sleep(time);
                    modCounts.put(m.getName(), modCounts.get((m.getName())+1));

                });
                terminators.put(m.getName(), t);
                t.start();



                //modCount=0;
                modCounts.put(m.getName(), 0);
                return cashedVal;
            } else {
                //modCount=0;
                System.out.println("Cashed val: ");
                //return cashedVal;
                return cashes.get(m.getName());
            }

        }



*/
}

