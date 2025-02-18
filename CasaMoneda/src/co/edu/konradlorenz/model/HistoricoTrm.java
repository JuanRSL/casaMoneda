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
        promedio = 0;
        if (semana3a7Feb.isEmpty()) {
            return;
        }

        for (Trm trm : semana3a7Feb) {
            promedio += trm.getDolarTrm();
        }

        promedio = promedio / semana3a7Feb.size();
    }

    public static double convertirDolPes(double valor, int seleccion, int diaSeleccionado) {
        if (diaSeleccionado < 0 || diaSeleccionado >= semana3a7Feb.size()) {
            return -1;
        }

        Trm trmSeleccionado = semana3a7Feb.get(diaSeleccionado);

        return switch (seleccion) {
            case 1 ->
                valor * trmSeleccionado.getPrecioVenta();
            case 2 ->
                valor / trmSeleccionado.getPrecioCompra();
            default ->
                -1;
        };
    }

}
