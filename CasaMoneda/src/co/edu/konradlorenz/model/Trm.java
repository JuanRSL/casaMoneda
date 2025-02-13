package co.edu.konradlorenz.model;

public class Trm {

    private String fecha;
    private double dolarTrm;
    private double precioCompra;
    private double precioVenta;
    

    public Trm(String fecha, double dolarTrm, double precioCompra, double precioVenta) {
        this.fecha = fecha;
        this.dolarTrm = dolarTrm;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
    }

    public Trm() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getDolarTrm() {
        return dolarTrm;
    }

    public void setDolarTrm(double dolarTrm) {
        this.dolarTrm = dolarTrm;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        return "Trm{" + "fecha=" + fecha + ", dolarTrm=" + dolarTrm + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + '}';
    }

    public void calcularVenta() {
        precioVenta = dolarTrm - (dolarTrm * 0.05);
    }

    public void calcularPrecioVenta() {
        precioCompra = dolarTrm - (dolarTrm * 0.07);
    }
}
