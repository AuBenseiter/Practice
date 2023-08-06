class Empleado{
    constructor(nombre, sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    obtenerDetalles(){
        return `Empleado: nombre: ${this.nombre}, sieldo: ${sueldo}`;
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

let empleado1 = new Empleado('Jaime', 399)
console.log(empleado1);

let gerente1 = new Gerente('Daniel', 444,'Sistemas');
console.log(gerente1);