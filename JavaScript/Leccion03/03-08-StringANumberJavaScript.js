let miNumero = "19x";

console.log(typeof miNumero);;

let edad = Number(miNumero);
console.log(typeof edad);
//Preguntar si es Nan
if (isNaN(edad)) {
    console.log("No es un numero")
}else{
    console.log("Es un numero Mi pana")
    if (edad >= 18) {
        console.log("Puede Votar");
    }else{
        console.log("No puede Votar");
    }
}

//Preguntar si es Nan
if (isNaN(edad)) {
    console.log("No es un numero")
}else{
    let resultado = (edad >= 18) ? "Puede votar" : "No puede Votar";
    console.log(resultado);
}

