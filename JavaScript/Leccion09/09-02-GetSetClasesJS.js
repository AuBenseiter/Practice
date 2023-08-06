//en las clases no existe el hoisting, solo existe en funciones
class Persona{
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
    }
    get nombre(){
        return this._nombre;
    }

    set nombre(nombre){
        this._nombre = nombre;
    }
}

let persona1 = new Persona('Daniel', 'Frias');
console.log(persona1);
console.log(persona1.nombre);
persona1.nombre = 'Daniel Frias';
console.log(persona1.nombre);

let persona2 = new Persona('Ania', 'Toromillo');
console.log(persona2);