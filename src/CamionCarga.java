public class CamionCarga extends Vehiculo {

    private double CapacidadTonelada;

    //---------------CONSTRUCTOR------------------------------

    public CamionCarga(String placa, String marca, String modelo, int año, double precio, double capacidadTonelada) {
        super(placa, marca, modelo, año, precio);
        CapacidadTonelada = capacidadTonelada;
    }


    //--------------------GETS AND SETS--------------------------

    public double getCapacidadTonelada() {
        return CapacidadTonelada;
    }

    public void setCapacidadTonelada(double capacidadTonelada) {
        CapacidadTonelada = capacidadTonelada;
    }


    //---------------------TO STRINGS-------------------------------


    @Override
    public String toString() {
        return "CamionCarga{" +
                "CapacidadTonelada=" + CapacidadTonelada +
                '}';
    }
}
