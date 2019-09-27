package com.neu.util;

import java.text.SimpleDateFormat;

public class GetDate {
	public String getDate(java.util.Date now,java.util.Date subbmittime) {
	    long l=now.getTime()-subbmittime.getTime()+8*1000*60*60;
	    long day=l/(24*60*60*1000);
        long hour=(l/(60*60*1000));
        long min=(l/(60*1000));
//        return String.valueOf(hour)+String.valueOf(now)+String.valueOf(subbmittime);
	    if(day>=1) {
	    	return String.valueOf(day)+"天前";
	    }
	    else if(hour>=1) {
	    	return String.valueOf(hour)+"小时前";
	    }
	    else if(min>=1){
	    	return String.valueOf(min)+"分钟前";
	    }
	    else {
	    	return "1分钟前";
	    }
	}
}
