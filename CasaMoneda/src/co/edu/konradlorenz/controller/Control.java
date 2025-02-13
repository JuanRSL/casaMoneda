package co.edu.konradlorenz.controller;

import co.edu.konradlorenz.model.HistoricoTrm;
import co.edu.konradlorenz.model.Trm;
import co.edu.konradlorenz.view.Ventana;

public class Control {

    Trm objM = new Trm();
    HistoricoTrm objHT = new HistoricoTrm();
    Ventana objV = new Ventana();

    public void run() {
        int opcion = 0;
        do {
            switch (opcion) {
                case 1:
                    objV.mostrarTabla(objHT.getSemana3a7Feb());
                    break;
                case 2:
                    objV.mostrarTabla(objHT.getSemana3a7Feb());
                    int seleccion = objV.pedirOpcionConversion();
                    long valor = objV.pedirValorConversion();
                    objV.mostrarConversion(objHT.convertirDolPes(valor,seleccion));
                    break;
                case 3:
                    objV.mostrarTabla(objHT.getSemana3a7Feb());
                    break;
                case 4:
                    objV.mostrarTabla(objHT.getSemana3a7Feb());
                    break;
                case 5:
                    objV.mostrarTabla(objHT.getSemana3a7Feb());
                    break;
                    
                    
            }
        } while (true);
    }

    public void llenarTabla() {
        objHT.setSemana3a7Feb(new Trm("Lunes 3 de Febrero de 2025", 4183.93));
        objHT.setSemana3a7Feb(new Trm("Martes 4 de Febrero de 2025", 4198.66));
        objHT.setSemana3a7Feb(new Trm("Miercoles 5 de Febrero de 2025", 4153.54));
        objHT.setSemana3a7Feb(new Trm("Jueves 6 de Febrero de 2025", 4189.06));
        objHT.setSemana3a7Feb(new Trm("Viernes 7 de Febrero de 2025", 4180.66));
    }

}
