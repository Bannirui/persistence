package com.rxy.persistence.consumer.scrapy.statistics.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * @Author: dingrui
 * @Date: Create in 2020/7/1
 * @Description: 日期工具类
 */
public class DateUtil {

    private static final String SDF = "yyyy-MM-dd";

    /**
     * 根据指定时间 添加或者减去指定时间量
     * 例如，从当前日历时间减去5天 就是getBeforeOrAfterDate(new Date(), -5)
     *
     * @param date
     * @param num
     * @return
     */
    public static Date getBeforeOrAfterDate(Date date, int num) {
        // 获取日历
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, num);
        // 日历时间转为Date
        return calendar.getTime();
    }

    /**
     * 根据指定时间 添加或者减去指定时间量
     * 例如，从当前日历时间减去5天 就是getBeforeOrAfterDate(new Date(), -5)
     *
     * @param date
     * @param num
     * @return
     */
    public static String getBeforeOrAfterDateStr(Date date, int num) {
        // 获取日历
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DATE, num);
        // 日历时间转为Date
        Date dateResult = calendar.getTime();
        SimpleDateFormat dateFormat = new SimpleDateFormat(SDF);
        return dateFormat.format(dateResult);
    }

    /**
     * 格式化日期
     *
     * @param date
     * @return
     */
    public static String dateStringFormat(Date date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(SDF);
        return dateFormat.format(date);
    }

    /**
     * num为正数 以date为起点的近num天列表
     * num为负数 以date为终点的近num天列表
     *
     * @param date
     * @param num
     * @return
     */
    public static List<Date> getDateList(Date date, int num) {
        List<Date> dates = new ArrayList<Date>();
        if (num >= 0) {
            for (int i = 0; i <= num; i++) {
                Date beforeOrAfterDate = getBeforeOrAfterDate(date, i);
                dates.add(beforeOrAfterDate);
            }
        } else {
            for (int i = 0; i <= (-num); i++) {
                Date beforeOrAfterDate = getBeforeOrAfterDate(date, -i);
                dates.add(beforeOrAfterDate);
            }
        }
        return dates;
    }

    /**
     * num为正数 以date为起点的近num天列表
     * num为负数 以date为终点的近num天列表
     *
     * @param date
     * @param num
     * @return
     */
    public static List<String> getDateStrList(Date date, int num) {
        List<String> dates = new ArrayList<String>();
        if (num >= 0) {
            for (int i = 0; i <= num; i++) {
                Date beforeOrAfterDate = getBeforeOrAfterDate(date, i);
                SimpleDateFormat dateFormat = new SimpleDateFormat(SDF);
                dates.add(dateFormat.format(beforeOrAfterDate));
            }
        } else {
            for (int i = 0; i <= (-num); i++) {
                Date beforeOrAfterDate = getBeforeOrAfterDate(date, -i);
                SimpleDateFormat dateFormat = new SimpleDateFormat(SDF);
                dates.add(dateFormat.format(beforeOrAfterDate));
            }
        }
        return dates;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        List<String> dateStrList = getDateStrList(new Date(), -3);
        System.out.println(dateStrList);
    }

}
