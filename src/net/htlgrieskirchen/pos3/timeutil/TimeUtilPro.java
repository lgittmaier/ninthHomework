package net.htlgrieskirchen.pos3.timeutil;

import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


public class TimeUtilPro
{   
    private TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    
    public static LocalDate intToLocalDate(int date) {

        if(date<=99991231 && date >= 10000101){
            String tmp = ""+date;
            int[] a = new int[tmp.length()];
            for (int i = 0; i< a.length; i++){
                a[i] = Integer.parseInt(tmp.substring(i,i+1));
            }
            String year = a[0]+ ""+a[1]+""+a[2]+""+a[3];
            String month = a[4]+""+a[5];
            String day = a[6]+""+a[7];
            int y = Integer.parseInt(year);
            int m = Integer.parseInt(month);
            int d = Integer.parseInt(day);
            if(y<=1000 && y>= 9999 || m <= 00 && m >= 12|| d <= 00 && d >= 31){
                return null;
            }else{
                LocalDate lc = LocalDate.of(y,m,d);
                return lc;
            }

        }else{
            return null;
        }


    }

    public static LocalDate longToLocalDate(long dateTime) {
        if(dateTime<=99991231 && dateTime >= 10000101){
            String tmp = ""+dateTime;
            long[] a = new long[tmp.length()];
            for (int i = 0; i< a.length; i++){
                a[i] = Long.parseLong(tmp.substring(i,i+1));
            }
            String year = a[0]+ ""+a[1]+""+a[2]+""+a[3];
            String month = a[4]+""+a[5];
            String day = a[6]+""+a[7];
            int y = Integer.parseInt(year);
            int m = Integer.parseInt(month);
            int d = Integer.parseInt(day);
            if(y<=1000 || y>= 9999 || m <= 00 || m >= 12|| d <= 00 || d >= 31){
                return null;
            }else{
                LocalDate lc = LocalDate.of(y,m,d);
                return lc;
            }

        }else{
            return null;
        }
    }
    
    public static LocalDate dateToLocalDate(Date dateTime) {
        if(dateTime.getTime()< 2145875727000L && dateTime.getTime()> 0L){
            return Instant.ofEpochMilli(dateTime.getTime())
                    .atZone(ZoneId.systemDefault())
                    .toLocalDate();
        }else{
            return null;
        }
        }
    
    public static LocalDate calendarToLocalDate(Calendar dateTime) {
        LocalDate localDate = LocalDate.ofInstant(dateTime.toInstant(), dateTime.getTimeZone().toZoneId());
        return localDate;
    }
    
    // ########## LOCALDATETIME METHODS ##########
            
    public static LocalDateTime intToLocalDateTime(int date) {
        if(date<=99991231 && date >= 10000101){
            String tmp = ""+date;
            int[] a = new int[tmp.length()];
            for (int i = 0; i< a.length; i++){
                a[i] = Integer.parseInt(tmp.substring(i,i+1));
            }
            String year = a[0]+ ""+a[1]+""+a[2]+""+a[3];
            String month = a[4]+""+a[5];
            String day = a[6]+""+a[7];
            int y = Integer.parseInt(year);
            int m = Integer.parseInt(month);
            int d = Integer.parseInt(day);
            if(y<=1000 && y>= 9999 || m <= 00 && m >= 12|| d <= 00 && d >= 31){
                return null;
            }else{
                LocalDateTime ldt = LocalDateTime.of(y,m,d,00,00,00);
                return ldt;
            }

        }else{
            return null;
        }
    }
    
    public static LocalDateTime longToLocalDateTime(long dateTime) {
        if(dateTime<=99991231235959L && dateTime >= 10000101000000L){
            String tmp = ""+dateTime;
            long[] a = new long[tmp.length()];
            for (int i = 0; i< a.length; i++){
                a[i] = Long.parseLong(tmp.substring(i,i+1));
            }
            String year = a[0]+ ""+a[1]+""+a[2]+""+a[3];
            String month = a[4]+""+a[5];
            String day = a[6]+""+a[7];
            String stringHour = a[8]+""+a[9];
            String stringMin = a[10]+""+a[11];
            String stringSec = a[12]+""+a[13];
            int y = Integer.parseInt(year);
            int m = Integer.parseInt(month);
            int d = Integer.parseInt(day);
            int hour = Integer.parseInt(stringHour);
            int min = Integer.parseInt(stringMin);
            int sec = Integer.parseInt(stringSec);

            if(y<=1000 || y>= 9999 || m <= 00 || m >= 12|| d <= 00 || d >= 31 || hour <=00 || hour >=24 || min <=00 || min >= 60 || sec <=00 || sec >= 60){
                return null;
            }else{
                LocalDateTime lct = LocalDateTime.of(y,m,d,hour,min,sec);
                return lct;
            }

        }else{
            return null;
        }
    }
    
    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        if(dateTime.getTime()< 2145913199L && dateTime.getTime()> 0L) {
            return null;
        }else{
            return dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
        }
    }
    
    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
         return dateTime.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime();
    }
           
    // ########## INT METHODS ##########
    
    public static int localDateToInt(LocalDate date) {
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        if(month <10 && day < 10){
            return Integer.parseInt(year+"0"+month+"0"+day);
        }else if(month <10){
            return Integer.parseInt(year+"0"+month+""+day);
        }else if(day < 10){
            return Integer.parseInt(year+""+month+"0"+day);
        }
        return Integer.parseInt(year+""+month+""+day);
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        int year = dateTime.getYear();
        int month =dateTime.getMonthValue();
        int day = dateTime.getDayOfMonth();
        int hour = dateTime.getHour();
        int min = dateTime.getMinute();
        int sec = dateTime.getSecond();

        if(month <10 && day < 10 && hour < 10 && min <10 && sec < 10) {
            return Integer.parseInt(year + "0" + month + "0" + day + "0" + hour + "0" + min + "0" + sec);
        }
        else {
            return Integer.parseInt(year + "" + month + "" + "" + day + "" + hour + "" + min + "" + sec);
        }
    }


    // ########## LONG METHODS ##########
    
    public static long localDateToLong(LocalDate date) {
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        if(month <10 && day < 10){
            return Integer.parseInt(year+"0"+month+"0"+day);
        }else if(month <10){
            return Integer.parseInt(year+"0"+month+""+day);
        }else if(day < 10){
            return Integer.parseInt(year+""+month+"0"+day);
        }
        return Integer.parseInt(year+""+month+""+day);
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        long year = dateTime.getYear();
        long month = dateTime.getMonthValue();
        long day = dateTime.getDayOfMonth();
        long hour = dateTime.getHour();
        long min = dateTime.getMinute();
        long sec = dateTime.getSecond();

        if (month < 10 && day < 10 && hour < 10 && min < 10 && sec < 10) {
            return Long.parseLong(year + "0" + month + "0" + day + "0" + hour + "0" + min + "0" + sec);
        }
        else if(month > 10 && day < 10 && hour < 10 && min < 10 && sec < 10){
            return Long.parseLong(year + "" + month + "0" + day + "0" + hour + "0" + min + "0" + sec);
        }
        else if(month < 10 && day > 10 && hour < 10 && min < 10 && sec < 10){
            return Long.parseLong(year + "0" + month + "" + day + "0" + hour + "0" + min + "0" + sec);
        }
        else if(month > 10 && day < 10 && hour > 10 && min < 10 && sec < 10){
            return Long.parseLong(year + "0" + month + "0" + day + "" + hour + "0" + min + "0" + sec);
        }
        else if(month > 10 && day < 10 && hour < 10 && min > 10 && sec < 10){
            return Long.parseLong(year + "0" + month + "0" + day + "0" + hour + "" + min + "0" + sec);
        }
        else if(month > 10 && day < 10 && hour < 10 && min < 10 && sec > 10){
            return Long.parseLong(year + "0" + month + "0" + day + "0" + hour + "0" + min + "" + sec);
        }
        else{
            return Long.parseLong(year + "" + month + "" + day + "" + hour + "" + min + "" + sec);
        }
    }

    // ########## DATE METHODS ##########
    
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        return java.util.Date.from(date.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return java.util.Date
                .from(dateTime.atZone(ZoneId.systemDefault())
                        .toInstant());
    }

    // ########## CALENDAR METHODS ##########
    
    public static Calendar localDateToCalendar(LocalDate date) {
       /* Calendar c = Calendar.getInstance();
        c.set(date.getYear(), date.getMonthValue(),date.getDayOfMonth());
        return c;*/

        return GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        /*Calendar c = Calendar.getInstance();
        c.set(dateTime.getYear(), dateTime.getMonthValue(), dateTime.getDayOfMonth(),dateTime.getHour(),dateTime.getMinute(),dateTime.getSecond());
        return c;*/

        return GregorianCalendar.from(dateTime.atZone(ZoneId.systemDefault()));
    }

}
