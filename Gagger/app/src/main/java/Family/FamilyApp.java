package Family;

import javax.inject.*;

import coffee.DripCoffeeModule;
import dagger.ObjectGraph;

/**
 * Created by tchl on 2016-05-04.
 */
public class FamilyApp   implements Runnable {
    @Inject @Named("Jack") USAFamily jack;
    @Inject @Named("Mike") USAFamily mike;
    @Override public void run() {
        jack.getFamilyName();
        jack.getClass().toString();
        mike.getFamilyName();
        mike.getClass().getName();

    }

    public static void makkefamily() {
        ObjectGraph objectGraph = ObjectGraph.create(new DripCoffeeModule());
        FamilyApp familyApp = objectGraph.get(FamilyApp.class);
        familyApp.run();
    }
}
