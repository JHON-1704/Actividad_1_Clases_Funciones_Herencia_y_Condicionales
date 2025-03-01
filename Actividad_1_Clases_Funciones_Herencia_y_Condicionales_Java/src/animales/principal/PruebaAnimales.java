package animales.principal;

import animales.Ave;

public class PruebaAnimales {
    public static void main(String[] args) {
        Ave aguila = new Ave("Águila Real", 3.2, 2018, "Juan Pérez");
        
        aguila.calcularEdad(); // Llamamos a la función para verificar la edad
    }
}