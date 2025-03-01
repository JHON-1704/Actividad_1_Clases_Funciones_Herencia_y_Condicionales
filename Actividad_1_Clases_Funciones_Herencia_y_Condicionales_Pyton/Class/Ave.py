from datetime import datetime
from Class.Animal import Animal  # Importamos la clase Animal

class Ave(Animal):
    def __init__(self, nombre, peso, ano_nacimiento, propietario):
        super().__init__(nombre, peso) 
        self.ano_nacimiento = ano_nacimiento
        self.propietario = propietario

    def calcular_edad(self):
        ano_actual = datetime.now().year
        return ano_actual - self.ano_nacimiento

    def mostrar_edad(self):
        edad = self.calcular_edad()
        if edad >= 5:
            print(f"El ave tiene {edad} años y es MAYOR DE EDAD")
        else:
            print(f"El ave tiene {edad} años y es MENOR DE EDAD")