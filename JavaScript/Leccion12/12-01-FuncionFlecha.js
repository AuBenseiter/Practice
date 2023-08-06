//FUNCION NORMAL
function miFuncion(){
    console.log('saludos desde mi funcion');
}
miFuncion();

/* const funcionFlecha = ()=>{
    console.log('Soy una funcion Flecha')
}
funcionFlecha(); */

/* const miFuncionFlecha = () => console.log('Soy una funcion Flecha');
miFuncionFlecha(); */

/* const saludar = () => {
    return `Saludos desde funcion flecha`
} */
const saludar = () => 'Saludos desde funcion flecha'

const regresaObjeto = () => ({nombre: 'juna', apellido: 'Hai'});

const funcionConParametros = (mensaje) => console.log(mensaje);
funcionConParametros('saludos con parametros');

/* cosnt funcionConParametros = function(mensaje){
    console.log(mensaje);
} */

const funcionConParametrosMulti = (op1, op2) => op1 + op2;
/* const funcionConParametrosMulti = (op1, op2) => {
    let resultado = op1 + op2;
    return `resultado: ${resultado}`;
}; */

console.log(regresaObjeto());
console.log(saludar());
console.log(funcionConParametrosMulti(3,4));