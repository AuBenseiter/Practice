//Llamadas SINCRONAS con uso setTimeout
//LA F1 LLAMA A F2 Y F1 PUEDE SEGUIR EJECUTANDOSE JUNTO OCN F2
let reloj = () => {
    let fecha = new Date();
    console.log(`${fecha.getHours()}:${fecha.getMinutes()}:${fecha.getSeconds()}`)
}

setInterval(reloj, 1000);// 1 seg
//manda a llamar de manera asincrona el metodo reloj
//por ende se ve el cambio en la salidaa