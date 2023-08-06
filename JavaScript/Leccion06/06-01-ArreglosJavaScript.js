//ANTIGUA FORMA
//let autos = new Array('Subaru', 'Nissan', 'Mitsubishi');
/*FORMA CORRECTA ACTUAL*/
const autos = ['Nissan', 'Mitsubishi', 'Subaru'];
console.log(autos);

for (let i = 0; i < autos.length; i++) {
    
    console.log(i + " : " + autos[i]);
}
//CAMBIAR UN ELEMENTO
autos[1] = 'Volvo';
console.log(autos[1]);
//AGREGAR ELEMENTOS
autos.push('RAM')
console.log(autos);
//AGREGAR ELEMENTO CONSIDERANDO EL LARGO
console.log(autos.length);
autos[autos.length] = 'Toyota';
console.log(autos);
//NO RECOMENDABLE
autos[6] = 'Audi';
console.log(autos);
autos[5] = 'Chevrolet'; //autos[50] = 'Chevrolet';
console.log(autos);
//PREGUNTAR SI ES ARRAY
console.log(typeof autos);
console.log(Array.isArray(autos));
console.log(autos instanceof Array)