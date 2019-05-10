package com.ssm_project.intercept;
import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Documented
public @interface Logww {
      String operationType() default "";
      String operationName() default "";
      String operationName34() default "";
      String operationNam2e() default "";
      String operationNam2e3() default "";
      String operationNam2e3q3() default "";


}
