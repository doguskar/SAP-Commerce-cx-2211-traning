package com.customcore.util;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.joda.time.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

public class DateUtil {

    private DateUtil() {
        // private constructor to hide public constructor
    }

    private static final Logger LOGGER = Logger.getLogger(DateUtil.class);

    private static String DEFAULT_DATE_PATTERN = "yyyy-MM-dd";

    public static final String DATE_FORMAT = "dd/MM/yyyy";

    private static String DEFAULT_TIME_PATTERN = "hh:mm";
    public static final String CA_DATE_FORMAT = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX";

    public static final String formatDate(final Date date) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("converting '" + date + "' to String with mask '" + DEFAULT_DATE_PATTERN + "'");
        }

        final SimpleDateFormat df = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
        return df.format(date);
    }

    public static final String formatDate(final Date date, final String format) {

    	try {
    		  if (LOGGER.isDebugEnabled()) {
    	            LOGGER.debug("converting '" + date + "' to String with mask '" + format + "'");
    	        }

    	        final SimpleDateFormat df = new SimpleDateFormat(format);
    	        return df.format(date);
    	}catch (Exception e) {
			return org.apache.commons.lang3.StringUtils.EMPTY;
		}

    }

    public static final String formatHour(final Date hour) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("converting '" + hour + "' to String with mask '" + DEFAULT_TIME_PATTERN + "'");
        }

        final SimpleDateFormat df = new SimpleDateFormat(DEFAULT_TIME_PATTERN);
        return df.format(hour);
    }

    public static final String formatHour(final Date hour, final String timePattern) {

        if (LOGGER.isDebugEnabled()) {
            LOGGER.debug("converting '" + hour + "' to String with mask '" + timePattern + "'");
        }

        final SimpleDateFormat df = new SimpleDateFormat(timePattern);
        return df.format(hour);
    }

    public static final Date parseDate(final String stringDate) {

        Date dateDate = null;
        final SimpleDateFormat df = new SimpleDateFormat(DEFAULT_DATE_PATTERN);
        try {
            dateDate = df.parse(stringDate);
        } catch (final ParseException e) {
            LOGGER.error("Conversion error :" + stringDate, e);
            return null;
        }
        return dateDate;
    }

    public static Date parseDate(final String stringDate, final String datePattern) {
    	if(StringUtils.isBlank(stringDate)) {
    		return null;
    	}

        Date dateDate = null;
        final SimpleDateFormat df = new SimpleDateFormat(datePattern);
        try {
            dateDate = df.parse(stringDate);
        } catch (final ParseException e) {
            LOGGER.error("Conversion error :" + stringDate, e);
            return null;
        }
        return dateDate;
    }

    public static DateTime parseStringDateToDateTime(final String stringDate, final String datePattern) {
        DateTime dateDate = null;
        final SimpleDateFormat df = new SimpleDateFormat(datePattern);
        try {
            dateDate = new DateTime(df.parse(stringDate));
        } catch (final ParseException e) {
            LOGGER.error("Conversion error :" + stringDate, e);
            return null;
        }
        return dateDate;
    }

    public static String parseDateWithDefaultTimezone(final Date date, final String datePattern){
        if(date != null){
            final SimpleDateFormat format = new SimpleDateFormat(datePattern);
            format.setTimeZone(TimeZone.getTimeZone("UTC"));
            return format.format(date);
        }
        return StringUtils.EMPTY;
    }

    public static String parseDate(final Date date, final String datePattern){
        if(date != null){
            final SimpleDateFormat format = new SimpleDateFormat(datePattern);
            return format.format(date);
        }
        return StringUtils.EMPTY;
    }

    public static final long dayDifference(final Date now, final Date past) {
        final long diff = now.getTime() - past.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public static final Boolean sameDay(final Date today, final Date date) {
        if (date != null) {
            return formatDate(today).equals(formatDate(date));
        }
        return false;
    }

    public static String formatStringValue(String date) throws ParseException {
        return formatStringValue(date, DATE_FORMAT);
    }

    public static String formatStringValue(final String date, final String inputFormat) throws ParseException {
        return formatStringValue(date, inputFormat, DEFAULT_DATE_PATTERN);
    }

    public static String formatStringValue(final String date, final String inputFormat, final String outputFormat) throws ParseException {
        SimpleDateFormat inDate = new SimpleDateFormat(inputFormat);
        SimpleDateFormat outDate = new SimpleDateFormat(outputFormat);
        Date formattedDate = inDate.parse(date);
        return outDate.format(formattedDate);
    }

    public static Date createDate(String year, String month, String day) {
        LocalDate date = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));
        return Date.from(date.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static Date getDateBeforeDayFromToday(Integer beforeDay) {
        Calendar cal = new GregorianCalendar();
        cal.add(Calendar.DAY_OF_MONTH, beforeDay);
        return cal.getTime();
    }

    public static boolean checkValidDate(final String date) {
        if (StringUtils.isNotBlank(date)) {
            try {
                DateFormat df = new SimpleDateFormat(DATE_FORMAT);
                df.setLenient(false);
                df.parse(date);
                return true;
            } catch (Exception e) {
                return false;
            }
        }
        return false;
    }

    public static Date addDayToDate(Date date, int day) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.DATE, day);
        return c.getTime();
    }

    public static Date addSecondToDate(Date date, int second) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.SECOND, second);
        return c.getTime();
    }

    public static Date addMinuteToDate(Date date, int minute) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MINUTE, minute);
        return c.getTime();
    }

    public static Date setTime(Date date, int hour, int minute, int second, int millisecond) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.HOUR_OF_DAY, hour);
        c.set(Calendar.MINUTE, minute);
        c.set(Calendar.SECOND, second);
        c.set(Calendar.MILLISECOND, millisecond);
        return c.getTime();
    }
}
