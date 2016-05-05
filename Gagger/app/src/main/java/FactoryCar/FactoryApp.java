package FactoryCar;

import javax.inject.Inject;

import dagger.ObjectGraph;


/**
 * Created by tchl on 2016-05-04.
 * 没有通过@Inject构造函数初始化对象，而是在Module中用@Provider来完成对象的初始化
 */
public class FactoryApp  implements Runnable{
    @Inject
    CarMaker carMaker;
    @Override public void run() {
        carMaker.getCarType();
    }
    public static void makeCar() {
        ObjectGraph objectGraph = ObjectGraph.create(new CarModule());
        FactoryApp carApp = objectGraph.get(FactoryApp.class);
        carApp.run();
    }
}