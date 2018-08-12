package com.tigrex.api.constant;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@Documented
public @interface DataSource {

    ContextConst.DataSourceType value() default ContextConst.DataSourceType.EMPLOYEE;

}
