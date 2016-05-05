package school;

import javax.inject.Inject;

/**
 * Created by tchl on 2016-05-03.
 */
public class Teacher {
    @Inject
    Teacher() {
        System.out.println(" [_]P tchl Teacher contructor! [_]P ");
    }
    public void  getTeacher(){
        System.out.println(" [_]P tchl getTeacher! [_]P ");
    }
}
