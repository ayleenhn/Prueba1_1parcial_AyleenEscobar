package escobar_ayleen_prueba1;

import java.util.Date;

public abstract class BlockBusterItem {
    private int cod;
    private String name;
    private double precio;
    private Date fecha;

    public BlockBusterItem(int cod, String name, double precio) {
        this.cod = cod;
        this.name = name;
        this.precio = precio;
        this.fecha = new Date();
    }

    public int getCod() {
        return cod;
    }

    public String getName() {
        return name;
    }

    public double getPrecio() {
        return precio;
    }

    public Date getFecha() {
        return fecha;
    }
    
    
    @Override
    public String toString() {
        return "Codigo=" + cod 
                + " Nombre=" + name 
                + " Precio de renta=" + precio;
    }
    
    public abstract double pagoRenta(int dias);
}
