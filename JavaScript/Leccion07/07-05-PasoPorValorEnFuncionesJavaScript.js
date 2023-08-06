//Tipos Promotivos
let x = 10;

function cambiarValor(a){
    a = 20;
    //cuando se termina de ejecutatar
    //esta funcion, el valor de a se destruye
    console.log(a);
}


//PASO POR VALOR
cambiarValor(x);//10
console.log(x);

//console.log(a); //a no esta definido

//PASO POR REFERENCIA

const persona = {
    nombre: 'DANIEL',
    apellido: 'FRIAS'
}
console.log(persona);

function cambiarValorObjeto(p1){
    p1.nombre = 'Karlos';
    p1.apellido = 'Manzana';
}
//paso por referencia
cambiarValorObjeto(persona);
console.log(persona);