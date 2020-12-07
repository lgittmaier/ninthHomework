/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3.timeutil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import net.htlgrieskirchen.pos3.timeutil.TimeUtilPro;
import org.junit.*;

import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class TimeUtilProTest {

    public TimeUtilProTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of intToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDate() {
        System.out.println("intToLocalDate");
        int date = 20010501;
        LocalDate expResult = LocalDate.of(2001, 05, 01);
        LocalDate result = TimeUtilPro.intToLocalDate(date);
        assertEquals(expResult, result);
    }


    /**
     * Test of longToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDate() {
        System.out.println("longToLocalDate");
        long dateTime = 20040105L;
        LocalDate expResult = LocalDate.of(2004, 01, 05);
        LocalDate result = TimeUtilPro.longToLocalDate(dateTime);
        assertEquals(expResult, result);
    }

    /**
     * Test of dateToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDate() {
        System.out.println("dateToLocalDate");
        Date dateTime = new Date(1397306127000L);
        LocalDate expResult = LocalDate.of(2014, 04, 12);
        LocalDate result = TimeUtilPro.dateToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of calendarToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDate() {
        System.out.println("calendarToLocalDate");
        Calendar dateTime = Calendar.getInstance();
        dateTime.set(2005, 04, 03);
        LocalDate expResult = LocalDate.of(2005, 05, 03);
        LocalDate result = TimeUtilPro.calendarToLocalDate(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of intToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDateTime() {
        System.out.println("intToLocalDateTime");
        int date = 20060101;
        LocalDateTime expResult = LocalDateTime.of(2006, 01, 01, 00, 00, 00);
        LocalDateTime result = TimeUtilPro.intToLocalDateTime(date);
        assertEquals(expResult, result);

    }

    /**
     * Test of longToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDateTime() {
        System.out.println("longToLocalDateTime");
        long dateTime = 20101110103015L;
        LocalDateTime expResult = LocalDateTime.of(2010, 11, 10, 10, 30, 15);
        LocalDateTime result = TimeUtilPro.longToLocalDateTime(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of dateToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDateTime() {
        System.out.println("dateToLocalDateTime");
        Date dateTime = new Date(1444918220000L);
        LocalDateTime expResult = LocalDateTime.of(2015, 10, 15, 16, 10, 20);
        LocalDateTime result = TimeUtilPro.dateToLocalDateTime(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of calendarToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDateTime() {
        System.out.println("calendarToLocalDateTime");
        Calendar dateTime = Calendar.getInstance();
        dateTime.setTimeInMillis(1237145130000L);
        LocalDateTime expResult = LocalDateTime.of(2009, 03, 15, 20, 25, 30);
        LocalDateTime result = TimeUtilPro.calendarToLocalDateTime(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToInt() {
        System.out.println("localDateToInt");
        LocalDate date = LocalDate.of(2005, 02, 01);
        int expResult = 20050201;
        int result = TimeUtilPro.localDateToInt(date);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateTimeToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToInt() {
        System.out.println("localDateTimeToInt");
        LocalDateTime dateTime = LocalDateTime.of(2005, 6, 1, 15, 5, 8);
        int expResult = 2005611558;
        int result = TimeUtilPro.localDateTimeToInt(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToLong() {
        System.out.println("localDateToLong");
        LocalDate date = LocalDate.of(2014, 10, 25);
        long expResult = 20141025L;
        long result = TimeUtilPro.localDateToLong(date);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateTimeToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToLong() {
        System.out.println("localDateTimeToLong");
        LocalDateTime dateTime = LocalDateTime.of(2009, 12, 11, 05, 50, 25);
        long expResult = 2009121155025L;
        long result = TimeUtilPro.localDateTimeToLong(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToDate() throws ParseException {
        System.out.println("localDateToDate");
        LocalDate date = LocalDate.of(2000, 04, 27);
        Date expResult = new SimpleDateFormat("yyyyMMdd").parse(String.valueOf(20000427));
        Date result = TimeUtilPro.localDateToDate(date);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateTimeToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToDate() throws ParseException {
        System.out.println("localDateTimeToDate");
        LocalDateTime dateTime = LocalDateTime.of(2001, 05, 10, 12, 30, 25);
        Date expResult = new SimpleDateFormat("yyyyMMddHHmmss").parse(String.valueOf("20010510123025"));
        Date result = TimeUtilPro.localDateTimeToDate(dateTime);
        assertEquals(expResult, result);

    }

    /**
     * Test of localDateToCalendar method, of class TimeUtilPro.
     */
    @Deprecated
    @Test
    public void testLocalDateToCalendar(){
        System.out.println("localDateToCalendar");
        LocalDate date = LocalDate.of(2010, 11, 25);
        Calendar expResult = GregorianCalendar.from(date.atStartOfDay(ZoneId.systemDefault()));
        Calendar result = TimeUtilPro.localDateToCalendar(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateTimeToCalendar method, of class TimeUtilPro.
     */
    @Deprecated
    @Test
    public void testLocalDateTimeToCalendar() {
        System.out.println("localDateTimeToCalendar");
        LocalDateTime dateTime = LocalDateTime.of(2006,04,03,10,15,20);
        Calendar expResult = GregorianCalendar.from(dateTime.atZone(ZoneId.systemDefault()));
        Calendar result = TimeUtilPro.localDateTimeToCalendar(dateTime);
        assertEquals(expResult, result);

    }
}


