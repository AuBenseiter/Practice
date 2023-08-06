//a y b en este caso son parametros
let sumar = function (a =3 ,b = 6){
    console.log(arguments[0]);
    console.log(arguments[1]);
    console.log(arguments[2]);
    return a + b

};
resultado = sumar(5,3,7);
//1 y 3 son los argumentos que asigno a los parametros a y b
console.log(resultado);
