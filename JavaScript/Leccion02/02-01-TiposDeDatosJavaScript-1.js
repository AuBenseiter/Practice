/*Ejemplos de Archivos de datos */
//Tipo de dato String
var nombre = "Daniel";
//cambiamos el valor
nombre = "OtroNombre";
nombre = 100
console.log(nombre);
console.log(typeof nombre);

//Tipo de dato Numerico
var numero = 100;
console.log(numero);

//Tipo de dato Object

var objeto = {
    nombre : "Furura",
    apellido: "Wakfu",
    telefono : 44444
}

console.log(objeto);
console.log(typeof objeto);

//Tipo de dato Boolean
var bandera = true;
console.log(bandera);
console.log(typeof bandera);

//tipo de dato function
function miFuncion(){}
console.log(miFuncion);
console.log(typeof miFuncion);

//Tipo de dato Symbol
var simbolo = Symbol("Mi simbolo bonito");
console.log(simbolo);
console.log(typeof simbolo);

//Tipo clase es una function
class Persona{
    constructor(nombre, apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
}
console.log(Persona);
console.log(typeof Persona);

//Tipo Undefine
var x;
x = undefined;
console.log(x);
console.log(typeof x);

//Tipo NULL = ausencia de valor

var y = null;
console.log(y);
console.log(typeof y);

//Tipo Array
var autos = ['Ford', 'Nissan', 'Mitsubishi'];
console.log(autos);
console.log(typeof autos);

//Tipo empty String
var z = '';
console.log(z);
console.log(typeof z);