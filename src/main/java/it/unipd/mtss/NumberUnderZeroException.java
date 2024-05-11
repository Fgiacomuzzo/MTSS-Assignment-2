////////////////////////////////////////////////////////////////////
// Francesco Giacomuzzo 2000553
// Alberto Michelazzo 2010007
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NumberUnderZeroException extends Exception {
    /* Eccezione per i numeri minori di zero */
    public NumberUnderZeroException() {
        super("Non esistono numeri romani negativi.");
    }
}