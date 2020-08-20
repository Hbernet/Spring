package com.hb.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author hb
 * @create 2020-06-17 10:01
 */
public class DateConverter implements Converter<String,Date> {
    @Override
    public Date convert(String str) {
        Date date=null;
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        try {
            date=format.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

}
