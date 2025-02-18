package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.HistoricoTrm;
import co.edu.konradlorenz.model.Trm;
import co.edu.konradlorenz.view.Ventana;

public class Control {

    HistoricoTrm objHT = new HistoricoTrm();
    Ventana objV = new Ventana();

    public void run() {
        llenarTabla();
        int opcion;

        do {
            opcion = objV.pedirOpcion();
            switch (opcion) {
                case 1:
                    objV.mostrarTabla(objHT.getSemana3a7Feb());
                    break;
                case 2:
                    objV.mostrarTabla(objHT.getSemana3a7Feb());
                    int diaSeleccionado = objV.pedirDiaSeleccionado() - 1;
                    if (diaSeleccionado >= 0 && diaSeleccionado < objHT.getSemana3a7Feb().size()) {
                        int seleccion = objV.pedirOpcionConversion();
                        double valor = objV.pedirValorConversion();
                        double resultado = objHT.convertirDolPes(valor, seleccion, diaSeleccionado);
                        objV.mostrarConversion(resultado);
                    } else {
                        objV.mostrarMensaje("Día seleccionado no válido.");
                    }
                    break;
                case 3:
                    objHT.calcularPromedio();
                    objV.mostrarTabla(objHT.getSemana3a7Feb());
                    objV.mostrarPromedio(objHT.getPromedio());
                    break;
                case 4:
                    objV.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    objV.mostrarMensaje("Opción no válida, intenta de nuevo.");
                    break;
            }
        } while (opcion != 4);
    }

    public void llenarTabla() {
        objHT.setSemana3a7Feb(new Trm("Lunes 3 de Febrero de 2025", 4183.93, 4030, 4180));
        objHT.setSemana3a7Feb(new Trm("Martes 4 de Febrero de 2025", 4198.66, 4030, 4180));
        objHT.setSemana3a7Feb(new Trm("Miércoles 5 de Febrero de 2025", 4153.54, 4030, 4180));
        objHT.setSemana3a7Feb(new Trm("Jueves 6 de Febrero de 2025", 4189.06, 4030, 4180));
        objHT.setSemana3a7Feb(new Trm("Viernes 7 de Febrero de 2025", 4180.66, 4030, 4180));
    }
}
