//en las clases no existe el hoisting, solo existe en funciones
class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    //Metodos
    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }

    set apellido(apellido){
        this._apellido = apellido;
    }
    nombreCompleto(){
        return this._nombre + " " + this._apellido;
    }
    //sobreescribiendo el metodo de la clase padre (object)
    toString(){
        //Se aplica polimorfismo (multiples formas en tiempo de ejecucion)
        //el metodo que se ejecuta depende si es una referencia de tipo padre o hijaN
        return this.nombreCompleto();
    }
}

class Empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);//llamar al constructor de la clase padre
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento
    }
    set departamento(departamento){
        this._departamento = departamento
    }
    //sobreescritura
    nombreCompleto(){
        return super.nombreCompleto() + ', ' + this._departamento
    }
}



let persona1 = new Persona('Daniel', 'Frias');
console.log(persona1.toString())
//
console.log(persona1);
console.log(persona1.nombre);
persona1.nombre = 'Daniel Frias';
console.log(persona1.nombre);
//

let empleado1 = new Empleado('Ruan', 'Nett', 'sistemas');
console.log(empleado1);
console.log(empleado1.nombre)
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString())