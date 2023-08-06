//HOISTING
/*
DONDE SE DECLARE LA FUNCION SIEMPRE SE MOVERA
(O EJECUTARA) DE AL PRIMCIPIO DEL CODIGO

 */

//Declaracion de la funcion
function miFuncion(a, b){
    console.log(arguments.length)
    console.log("Suma: " + (a+b));
}
//LLAMO LA FUNCION
miFuncion(12,3);

//EJEMPLO 2
function funcionDos(a, b){
    return a + b;
}

//llamando a la funcion
let resultado = funcionDos(2,3);
console.log(resultado);

//FUNCION DE TIPO EXPRESION
let sumar = function (a,b){return a + b};

resultado = sumar(1,3);
console.log(resultado);

//FUNCION SELF INVOKING
//solo de una invocacion
(function (a, b){
    console.log('Ejecutando la funcion');
    console.log(a + b);
})(3,4);//DE ESTA FORMA SE LLAMA()

console.log(typeof(miFuncion));

var miFuncionTexto = miFuncion.toString();
console.log(miFuncionTexto);

