//funcion constructor de objetos de tipo Persona
function Persona(nombre, apellido, email){

    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    //metodo de forma function
    this.nombreCompleto = function(){
        return this.nombre + ' ' + this.apellido;
    }
}

let padre = new Persona('Carlos', 'Pascal', 'Carl@mail.cl');
console.log(padre);
console.log(padre.nombreCompleto());

let madre = new Persona('Valk', 'Edar', 'valk@mail.cl');
console.log(madre);
console.log(madre.nombreCompleto());

padre.nombre = 'Juan';
console.log(padre);
console.log(madre);

//sintax formal
let miObjeto = new Objeto();
//sintax corta
let miObheto2 = {};

let miCadenas1 = new String('hola');
//sintax corta
let miCadena2 = 'hola';

let miNumero = new Number(1);
//sintax corta
let miNumero2 = 1;

let miBoolean = new Boolean(false);
//sintax corta
let miBoolean1 = false;

let miArreglo1 = new Objeto();
//sintax corta
let miArreglo2 = [];

let miFuncion = new Function();
//sintax corta
let miFuncion1 = function(){};