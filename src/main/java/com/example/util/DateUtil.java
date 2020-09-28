package com.example.util;

import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @Auther: cuijian05
 * @Date: 2020/9/28
 * @Description: 时间工具类
 */
public class DateUtil{
    public static final String yyyyMMddHHmmss = "yyyy-MM-dd HH:mm:ss";

    @Test
    public void getOneYearAfterTest(){
        System.out.println( "当前时间：  " + dateToString( new Date(), yyyyMMddHHmmss ) );
        System.out.println( "一年后时间： " + dateToString( getXXYearAfter( 1 ), yyyyMMddHHmmss ) );
    }

    /**
     * 获取一年后时间date
     *
     * @return
     */
    public static Date getXXYearAfter( int year ){

        Calendar calendar = Calendar.getInstance();
        calendar.setTime( new Date() );
        //calendar.add(calendar.DAY_OF_YEAR, 1);//增加一天,负数为减少一天
        //calendar.add(calendar.DAY_OF_MONTH, 1);//增加一天
        //calendar.add(calendar.DATE,1);//增加一天
        //calendar.add(calendar.WEEK_OF_MONTH, 1);//增加一个礼拜
        //calendar.add(calendar.WEEK_OF_YEAR,1);//增加一个礼拜
        calendar.add( calendar.YEAR, year ); //把日期往后增加一年.整数往后推,负数往前移动
        return calendar.getTime();
    }

    /**
     * 时间Date格式化
     *
     * @param date
     * @param format
     * @return
     */
    public static String dateToString( Date date, String format ){
        DateFormat df = new SimpleDateFormat( format );
        return df.format( date );
    }
}
