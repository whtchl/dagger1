package Family;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by tchl on 2016-05-04.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Named {
      String value() default "";
}
