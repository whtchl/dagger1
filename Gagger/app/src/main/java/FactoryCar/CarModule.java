package FactoryCar;

import android.text.Editable;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;


/**
 * Created by tchl on 2016-05-04.
 */
@Module(
        injects = FactoryApp.class
)
public class CarModule {
    @Provides
    @Singleton
    CarMaker provideCarMaker() {
        return new CarMaker();
    }
}