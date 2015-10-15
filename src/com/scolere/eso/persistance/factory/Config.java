package com.scolere.eso.persistance.factory;

import com.adventnet.zoho.client.report.ReportClient;

/**
 * 
 * This file contains the common configuration that in the example.
 * 
 *  Update the necessary configurations below to try out the samples.
 * 
 * 
 **/


public class Config 
{
    public static final String LOGINEMAILID="pamela@esecondopinion.com";
    public static final String AUTHTOKEN="8955659940ecb89e2299fa180aa04196";
    public static final String DATABASENAME="eSO";



    public static ReportClient getReportClient()
    {
        ReportClient rc = new ReportClient(Config.AUTHTOKEN);

        System.out.println("ReportClient created successfully");
        return rc;
    }
}
