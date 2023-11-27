import java.util.ArrayList;

public class Consola {
    public static void main(String[] args) {
        Edificio edificio = new Edificio(100, 200, 50, 300, 150);
        Vehiculo vehiculo = new Vehiculo(100, 150, 50, 200);
        Bicicleta bicicleta = new Bicicleta(50, 80, 40, 100);

        ArrayList<ImpactoEcologico> objetos = new ArrayList<>();
        objetos.add(edificio);
        objetos.add(vehiculo);
        objetos.add(bicicleta);

        for (ImpactoEcologico objeto : objetos) {
            System.out.println(objeto.getIdentificacion() + " - Impacto Ecológico: " 
                    + objeto.calcularImpactoEcologico());
        }
    }
}

