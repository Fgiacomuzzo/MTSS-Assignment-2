////////////////////////////////////////////////////////////////////
// Francesco Giacomuzzo 2000553
// Alberto Michelazzo 2010007
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class NumberAOneThousand extends Exception {
    /* Eccezione per i numeri maggiori di 1000 */
    public NumberAOneThousand() {
        super(" I numeri maggiori di 1000 non rientrano nei requisiti dell'assignment. ");
    }
}