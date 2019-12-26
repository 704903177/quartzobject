package com.example.quartz.object;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MininutesJob implements Job {
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        Date now = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(now);
        System.out.println("执行时间为："+currentTime);
        System.out.println("============");
        System.out.println("=====再次修改2=======");
    }
}
