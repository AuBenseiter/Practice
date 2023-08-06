let resultado = sumarTodo(4, 5, 6, 7, 4, 12, 12, 12,13);
console.log(resultado);

function sumarTodo(){
    let suma = 0;
    for (let i = 0; i < arguments.length; i++) {
       suma += arguments[i];
        
    }
    return suma;
}