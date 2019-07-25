package com.company.annotations;

import com.company.enums.DAY;
import com.company.enums.MONTH;
import com.company.enums.YEAR;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by karodes on 7/24/2017.
 */
@Retention(RetentionPolicy.CLASS)
@Target(ElementType.TYPE)
public @interface TimeStamp {
    YEAR year();
    MONTH month();
    DAY day();
}
