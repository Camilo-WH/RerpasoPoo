public class Automovil extends Vehiculo {

    private int Numeropuertas;
    private String Tipocombustible;

    //------------------CONSTRUCTOR---------------
    public Automovil(String placa, String marca, String modelo, int año, double precio, String tipocombustible, int numeropuertas) {
        super(placa, marca, modelo, año, precio);
        Tipocombustible = tipocombustible;
        Numeropuertas = numeropuertas;
    }

    //-----------------------GETS AND SETS--------------------------------------


    public int getNumeropuertas() {
        return Numeropuertas;
    }

    public void setNumeropuertas(int numeropuertas) {
        Numeropuertas = numeropuertas;
    }

    public String getTipocombustible() {
        return Tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        Tipocombustible = tipocombustible;
    }

    //---------------------TO STRINGS------------------------------------


    @Override
    public String toString() {
        return "Automovil{" +
                "Numeropuertas=" + Numeropuertas +
                ", Tipocombustible='" + Tipocombustible + '\'' +
                '}';
    }
}
