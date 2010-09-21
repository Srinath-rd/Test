/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.CLMT.cron;

import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

public class CronScheluder {

    public CronScheluder() throws Exception {

        SchedulerFactory sf = new StdSchedulerFactory();

        Scheduler sche = sf.getScheduler();

        sche.start();

        JobDetail jDetail2 = new JobDetail("news", "MJob", MyJob2.class);
        JobDetail jDetail = new JobDetail("Newsletter", "NJob", MyJob.class);

        //"0 0 12 * * ?" Fire at 12pm (noon) every day
        //"0/2 * * * * ?" Fire at every 2 seconds every day

 CronTrigger crTrigger = new CronTrigger("cronTrigger", "NJob", "0/2 * * * * ?");
 CronTrigger crTrigger1 = new CronTrigger("cronTrigger1", "MJob", "0/3 * * * * ?");

        sche.scheduleJob(jDetail, crTrigger);
        sche.scheduleJob(jDetail2, crTrigger1);
    }
}

