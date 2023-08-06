//EJERCICIO 1
let numero = 3;

if (numero == 1) {
    console.log("Numero uno");
}else if(numero == 3){
    console.log("Numero tres");
}else if (numero == 4) {
    console.log("Numero cuatro");
}else{
    console.log("Numero desconocido");
}
//EJERCICIO 2
let mes = 4;
let estacion;

if (mes == 1 || mes == 2 || mes == 12) {
    estacion = "Invierno";
}else if(mes == 3 || mes == 4 || mes == 5){
    estacion = "Primavera";
}else if (mes == 6 || mes == 7 || mes == 8) {
    estacion = "verano";
}else if (mes == 9 || mes == 10 || mes == 11) {
    estacion = "otoño";
}else{
    estacion = "Valor incorrecto"
}
console.log(estacion);

//EJERCICIO 3
let hora = 6;
let palabra;
if (hora>=6 && hora<= 11) {
    palabra = "Buenos dias";
}else if (hora>= 12 && hora<=18) {
    palabra = "Buenas Tardes";
}else if (hora>=19 && hora<=24) {
    palabra = "Buenas Noches";
}else if (hora>=0 && hora <6) {
    palabra = "Durmiendo";
}
console.log(palabra);