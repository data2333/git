package com.springapp.mvcaa;

import java.lang.annotation.*;

/**
 * Created by Administrator on 2017/3/19.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface SessionAttribute {
    String[] value() default {};
    Class<?>[] types() default{};
}
