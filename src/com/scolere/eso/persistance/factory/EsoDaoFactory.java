package com.scolere.eso.persistance.factory;

import java.util.logging.Level;
import java.util.logging.Logger;


//Local running setup
public class EsoDaoFactory{

    
    public static Object getDAO(Class daoImplClassName)
            throws Exception {

        Object obj = null;

        String implClassName = "com.scolere.eso.persistance.dao.impl." + daoImplClassName.getSimpleName() + "Impl";

        // obj=Class.forName(implClassName).newInstance();

        Class clazz = Class.forName(implClassName);
        System.out.println(">>>>>" + clazz);

        return (Object) clazz.newInstance();
    }

    
    //test
    public static void main(String[] arg) {
        try {


        } catch (Exception ex) {
            Logger.getLogger(EsoDaoFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}