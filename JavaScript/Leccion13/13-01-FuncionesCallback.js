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