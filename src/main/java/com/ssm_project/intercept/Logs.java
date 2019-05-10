package com.ssm_project.intercept;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Logs {
      String operationName() default "";


}
