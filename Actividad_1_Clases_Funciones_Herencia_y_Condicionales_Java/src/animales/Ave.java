package animales;

import java.time.Year;

// Clase Ave que hereda de Animal
public class Ave extends Animal {
    private int añoNacimiento;
    private String propietario; // Se agrega el atributo propietario

    // Constructor que incluye el propietario
    public Ave(String nombre, double peso, int añoNacimiento, String propietario) {
        super(nombre, peso);
        this.añoNacimiento = añoNacimiento;
        this.propietario = propietario;
    }

    // Método para calcular la edad y determinar si es mayor o menor de edad
    public void calcularEdad() {
        int añoActual = Year.now().getValue();
        int edad = añoActual - añoNacimiento;
        
        System.out.println("Nombre: " + nombre + ", Edad: " + edad + " años, Propietario: " + propietario);
        if (edad >= 5) {
            System.out.println("MAYOR DE EDAD");
        } else {
            System.out.println("MENOR DE EDAD");
        }
    }
}