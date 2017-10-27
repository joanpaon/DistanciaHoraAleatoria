package org.japojava.main;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Constantes
        final int H_INI = 8;
        final int M_INI = 20;
        final int S_INI = 0;

        // Random
        Random rnd = new Random();

        // Gregorian Calendar
        GregorianCalendar gc = new GregorianCalendar();

        // Hora Actual
        int hAct = gc.get(Calendar.HOUR_OF_DAY);
        int mAct = gc.get(Calendar.MINUTE);
        int sAct = gc.get(Calendar.SECOND);

        // Tiempos
        int tiempoIni = H_INI * 3600 + M_INI * 60 + S_INI;
        int tiempoAct = hAct * 3600 + mAct * 60 + sAct;
        int tiempoRnd = rnd.nextInt(tiempoAct - tiempoIni + 1) + tiempoIni;
        int tiempoDis = tiempoAct - tiempoRnd;

        // Hora Aleatoria
        int hRnd = tiempoRnd / 3600;
        tiempoRnd = tiempoRnd % 3600;
        int mRnd = tiempoRnd / 60;
        int sRnd = tiempoRnd % 60;

        // Distacia
        int hDis = tiempoDis / 3600;
        tiempoDis = tiempoDis % 3600;
        int mDis = tiempoDis / 60;
        int sDis = tiempoDis % 60;

        // Salidas
        System.out.printf("Hora actual ......: %02d:%02d:%02d\n", hAct, mAct, sAct);
        System.out.printf("Hora inicio ......: %02d:%02d:%02d\n", hRnd, mRnd, sRnd);
        System.out.printf("Tiempo de clase ..: %2d:%02d:%02d\n", hDis, mDis, sDis);
    }
}
