package com.ssm_project.intercept;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Logww {
      String operationType() default "";


      String operationName() default "";
}
