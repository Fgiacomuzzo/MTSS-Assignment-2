////////////////////////////////////////////////////////////////////
// Francesco Giacomuzzo 2000553
// Alberto Michelazzo 2010007
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NumberBelowZeroException extends Exception {
    /* Eccezione per i numeri minori di zero */
    public NumberBelowZeroException() {
        super("Non esistono numeri romani negativi.");
    }
}