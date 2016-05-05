package school;
import javax.inject.Inject;

import coffee.DripCoffeeModule;
import dagger.ObjectGraph;
/**
 * Created by tchl on 2016-05-03.
 * 通过@Inject构造函数初始化对象
 *
 */
public class SchoolApp implements Runnable {
    @Inject
    SchoolMaker schoolMaker;

    @Override public void run() {
        schoolMaker.getTeacher();
    }


    public static void makeschool() {
        ObjectGraph objectGraph = ObjectGraph.create(new SuperSchoolModule());
        SchoolApp SchoolApp = objectGraph.get(SchoolApp.class);
        SchoolApp.run();
    }
}


