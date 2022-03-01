package com.esprit.examen.services;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class AffichageLog {
    private static final Logger l = LogManager.getLogger(AffichageLog.class);
    public static void main(String[] args) {
        AffichageLog al = new AffichageLog(); al.getAllPrducts(); }
    public void getAllPrducts ()
    {
        try {
            l.info("In getAllPrducts() : ");
            l.debug("Je vais lancer la divsion.");
            int i = 1/1;
            l.debug("Je viens de lancer la divsion. " + i);
            l.debug("Je viens de finir l'opération X.");

            l.info("Out getAllPrducts() without errors.");
        }
        catch (Exception e) { l.error("Erreur dans getAllPrducts() : " + e); }
    }
}

