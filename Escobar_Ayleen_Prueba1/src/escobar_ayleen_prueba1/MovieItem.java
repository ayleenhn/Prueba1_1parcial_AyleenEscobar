package escobar_ayleen_prueba1;

import java.util.Date;

public class MovieItem extends BlockBusterItem{
    
    private String estado;

    public MovieItem(String estado, int cod, String name, double precio) {
        super(cod, name, precio);
        this.estado = "ESTRENO";
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    @Override
    public String toString() {
        return "Estado= " + estado + "- Movie";
    }

    @Override
    public double pagoRenta(int dias) {

        double pago = getPrecio();
        if (estado.equals("ESTRENO") && dias > 2) {
            pago += (dias - 2) * 50;
        } else if (estado.equals("NORMAL") && dias > 5) {
            pago += (dias - 5) * 30;
        }
        return pago;
    }
    
    public void evaluarEstado() {
        Date fecha = new Date();
        
        /*if (meses >= 5) {
            estado = "NORMAL";
        }*/
    }
}
