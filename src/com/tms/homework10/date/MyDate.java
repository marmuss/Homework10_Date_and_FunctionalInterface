package com.tms.homework10.date;

import java.text.SimpleDateFormat;
import java.util.*;
/**
Определяет какой сегодня день недели и определяет дату следующего вторника
 */
public class MyDate {
    public static void main(String[] args) {
        Calendar myDate = Calendar.getInstance();
        SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MMM/yyyy", Locale.ENGLISH);
        System.out.println("Today's date: " + myDateFormat.format(myDate.getTime()));
        SimpleDateFormat dayOfWeekFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
        System.out.println("It's " + dayOfWeekFormat.format(myDate.getTime()));

        int dayOfWeek = myDate.get(Calendar.DAY_OF_WEEK);

        int amount = (Calendar.SATURDAY - dayOfWeek + Calendar.TUESDAY) % 7;
        if (amount != 0) {
            myDate.add(Calendar.DAY_OF_MONTH, amount);
        } else {
            myDate.add(Calendar.DAY_OF_MONTH, (amount + 7));
        }

        System.out.println("Next Tuesday will be " + myDateFormat.format(myDate.getTime()));
    }
}
