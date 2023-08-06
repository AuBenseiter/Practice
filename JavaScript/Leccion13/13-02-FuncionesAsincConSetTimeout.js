function miFuncion1(){
    console.log('funcion 1');
}

function miFuncion2(){
    console.log('funcion 2');
}

miFuncion1();
miFuncion2();

//FUNCIONES DE TIPO CALLBACK
let imp = function imprimir(mensaje){
    console.log(mensaje);
}

function sunmar(op1, op2, funcionCallback){
    let res = op1 + op2;
    funcionCallback(`Resultado: ${res}`);
}

sunmar(5,3,imp);

//Llamadas asincronas con uso setTimeout
//LA F1 LLAMA A LA F2 Y NO SIGUE LA F1 HASTA QUE FINALICE F2
function miFuncionCallback(){
    console.log('Saludo asincrono despues de 3 seg');
}

setTimeout(miFuncionCallback, 3000);//despues de 3 seg

setTimeout(function(){console.log('saludo asincrono 2')}, 4000);

setTimeout(() => console.log('SALUDO ASINCRONO 3'), 5000);