package Family;

import dagger.Module;
import dagger.Provides;

import java.lang.String;
/**
 * Created by tchl on 2016-05-04.
 * @Qualifier的使用
 */
@Module(
        injects = FamilyApp.class
)
public class FamilyModule {
    int k =4;
    String str = "str";
    @Provides @Named("Jack") USAFamily provideUSAFamilyJack(){
        return new USAFamily();
    }
    @Provides @Named("Mike") USAFamily provideUSAFamilyMike(){
        return new USAFamily();
    }
}
