public class Motocicleta extends Vehiculo {

    private int Cilindraje;
    //----------------------CONSTRUCTOR-------------------------------


    public Motocicleta(String placa, String marca, String modelo, int año, double precio, int cilindraje) {
        super(placa, marca, modelo, año, precio);
        Cilindraje = cilindraje;
    }



    //--------------------GETS AND SETS--------------------------------------

    public int getCilindraje() {
        return Cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        Cilindraje = cilindraje;
    }


    //---------------------TO STRINGS------------------------------


    @Override
    public String toString() {
        return "Motocicleta{" +
                "Cilindraje=" + Cilindraje +
                '}';
    }
    //-------------------METODOS-------------------------------

    @Override
    public double CalcularPrecioFinal() {
        System.out.println("Este método calculará el precio final de la motocicleta");
        return 0;
    }


}
