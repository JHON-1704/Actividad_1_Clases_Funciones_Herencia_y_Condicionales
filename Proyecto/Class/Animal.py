class Animal:
    def __init__(self, nombre, peso):
        self.nombre = nombre  
        self.peso = peso      

    def imprimir_informacion(self):
        print(f"Nombre: {self.nombre}, Peso: {self.peso} kg")