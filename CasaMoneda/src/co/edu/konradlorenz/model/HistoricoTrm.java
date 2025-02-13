package co.edu.konradlorenz.model;

import java.util.ArrayList;

public class HistoricoTrm {

    private static ArrayList<Trm> semana3a7Feb = new ArrayList<>();
    private static double promedio = 0;

    public HistoricoTrm() {
    }

    public static ArrayList<Trm> getSemana3a7Feb() {
        return semana3a7Feb;
    }

    public static void setSemana3a7Feb(Trm Dia) {
        HistoricoTrm.semana3a7Feb.add(Dia);
    }

    public static double getPromedio() {
        return promedio;
    }

    public static void setPromedio(double promedio) {
        HistoricoTrm.promedio = promedio;
    }

    public static void calcularPromedio() {
        for (Trm trm : semana3a7Feb) {
            promedio += trm.getDolarTrm();
        }
        promedio = promedio / semana3a7Feb.size();
    }
}
