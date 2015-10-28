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
    public static final String AUTHTOKEN="c6f713d0b88c91342b61b009bff7a21b";
    public static final String DATABASENAME="eSO";



    public static ReportClient getReportClient()
    {
        ReportClient rc = new ReportClient(Config.AUTHTOKEN);

        System.out.println("ReportClient created successfully");
        return rc;
    }
}
