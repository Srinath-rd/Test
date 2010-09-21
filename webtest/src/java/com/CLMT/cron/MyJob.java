/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.CLMT.cron;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class MyJob implements Job {

    @Override
    public void execute(JobExecutionContext context)
     throws JobExecutionException {

      System.out.println("Cron executing ");

    }
}

