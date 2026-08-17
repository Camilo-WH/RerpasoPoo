public abstract class Vehiculo {

    //------------------ATRIBUTOS---------------------
    protected String placa;
    protected String marca;
    protected String modelo;
    protected int año;
    protected double precio;

    //---------------CONSTRUCTOR------------------------------

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String modelo, int año, double precio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.precio = precio;
    }

    //-------------------------GETS AND SETS-----------------------------


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", año=" + año +
                ", precio=" + precio +
                '}';
    }

    //-------------------METODOS-------------------------------

    public abstract double CalcularPrecioFinal();
    public String MostrarFicha(){
        System.out.println("Este método muestra la información común del vehiculo");
        return "";
    }


}


