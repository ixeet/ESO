package com.scolere.eso.common.mail;



public class Emailer
{
    
    public void mailto(String from, String to, String subject, String message){

            System.out.println("Sending message with from = "+from+" to= "+to+" subject= "+subject+" message= "+message);
            sendMail(from,to,subject,message);
            
    }   
    
   
   /**
    * Use to send HTML email.
    * @param fromEmailId
    * @param toEmailId
    * @param subject
    * @param message 
    */
    public static void sendMail(String fromEmailId, String toEmailId, String subject, String emailMessage) {
        
        try {

        } catch (Exception ex) {
            System.out.println("Exception : " + ex);
            ex.printStackTrace();
        }

    }
    

    
   
   
 
}//end of class
