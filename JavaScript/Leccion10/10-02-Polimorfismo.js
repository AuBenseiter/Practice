class Empleado{
    constructor(nombre, sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    obtenerDetalles(){
        return `Empleado: nombre: ${this.nombre}, sieldo: ${this.sueldo}`;
    }
}

class Gerente extends Empleado{
    constructor(nombre, sueldo, departamento){
        super(nombre, sueldo);
        this.departamento = departamento;
    }

    obtenerDetalles(){
        return`Gerente: ${super.obtenerDetalles()} depto: ${this.departamento}`
    }
}

//Polimorfismo
function imprimir(tipo){
    console.log(tipo.obtenerDetalles());
}
let empleado1 = new Empleado('Jaime', 399);
let gerente1 = new Gerente('Daniel', 444,'Sistemas');

imprimir(empleado1);
imprimir(gerente1);