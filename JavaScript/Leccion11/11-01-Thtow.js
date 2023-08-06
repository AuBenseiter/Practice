'use strict'
try{
    //x = 10;
    //mifuncion();
    let y = 9;
    throw 'MI error';

}
catch(error){
    console.log(error);
}
//bloque opcional
finally{
    console.log('termina la revision de errores');
}
console.log('continuamos')


let resultado = 3;
try{
    //g =12;
    if(isNaN(resultado)) throw 'No es un numero';
    else if(resultado === '') throw 'Es cadena vacia';
    else if(resultado >= 0) throw 'Es positivo';
    else if(resultado < 0 ) throw 'Valor negativo';
}
catch(error){
    console.log(error);
    //console.log(error.name);
    //console.log(error.message);
}
finally{
    console.log('Termina revision de errores');
}