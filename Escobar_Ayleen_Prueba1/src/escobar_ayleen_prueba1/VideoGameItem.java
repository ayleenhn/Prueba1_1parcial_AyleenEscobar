package escobar_ayleen_prueba1;

public class VideoGameItem extends BlockBusterItem{
    private String nombreConsola;
    private static final String PLAYSTATION = "PLAYSTATION";
    private static final String XBOX = "XBOX";
    private static final String WII = "WII";
    
    public VideoGameItem(String nombreConsola, int cod, String name, double precio) {
        super(cod, name, 30);
        this.nombreConsola = nombreConsola;
        if (validarConsola(nombreConsola)) {
            this.nombreConsola = nombreConsola;
        } else {
            throw new IllegalArgumentException("Error, el nombre de la consola no es valida");
        }
    }

    
    @Override
    public String toString() {
        return super.toString() + " - " + nombreConsola + " Game";
    }

    @Override
    public double pagoRenta(int dias) {
        return getPrecio() * dias;
    }

    private boolean validarConsola(String consola) {
        return consola.equals(PLAYSTATION) || 
                consola.equals(XBOX) || 
                consola.equals(WII);
    }
}
