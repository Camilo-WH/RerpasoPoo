import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehiculo> inventario = new ArrayList();
        System.out.println("Gestión del concesionario");

        }
    //------------------------------Agregar vehiculo-----------------------------
    public static void AgregarVehiculo(ArrayList<Vehiculo> inventario, Vehiculo v){
        System.out.println("Este método agrega un vehiculo al inventario");
    }
    //-----------------------------Listar Inventario-----------------------------------
    public static void ListarInventario(ArrayList<Vehiculo> inventario){
        System.out.println("Este metodo muestra los vehiculos del inventario");
    }
    //---------------Calcular el total----------------------
    public static void CalcularTotalInventario(ArrayList<Vehiculo> inventario){
        System.out.println("Este metodo calcula el valor total del inventario");
    }
    //----------Buscar por placa--------------
    public static void BuscarPorPlaca(ArrayList<Vehiculo> inventario){
        System.out.println("Este metodo busca un vehiculo por su placa");
    }

    }
