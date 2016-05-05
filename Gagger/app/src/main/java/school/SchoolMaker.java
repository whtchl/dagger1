package school;
import javax.inject.Inject;
/**
 * Created by tchl on 2016-05-03.
 */
public class SchoolMaker {
    @Inject Teacher teacher;
    public void getTeacher() {
            teacher.getTeacher();
    }
}
