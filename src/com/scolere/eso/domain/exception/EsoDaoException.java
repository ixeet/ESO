package com.scolere.eso.domain.exception;
/**
*
* @author akj
*/
public class EsoDaoException extends Exception {


    public EsoDaoException() {
    }

    /**
     * Constructs an instance of
     * <code>LmsDaoException</code> with the specified detail message.
     *
     * @param msg the detail message.
     */
    public EsoDaoException(String msg) {
        super("Exception occured at dao layer : "+msg);
    }
}
