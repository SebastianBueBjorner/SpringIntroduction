package com.example.demo.services;

import java.util.Calendar;

public class Calculate {
    private int day;
    private String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public Calculate() {
        Calendar calendar = Calendar.getInstance();
        this.day = calendar.get(Calendar.DAY_OF_WEEK);
    }

    public boolean isItFriday() {
        if (day == 6) {
            return true;
        } else {
            return false;
        }
    }

    public String getWeekday() {
        return weekDays[day-1];
    }

}
