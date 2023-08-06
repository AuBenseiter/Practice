let persona1 = {
    nombre: 'Daniel',
    apellido: 'Frias',
    nombreCompleto: function(titulo, tel){
        //return this.nombre + ' ' + this.apellido;
        return titulo + ': ' +this.nombre + ' ' + this.apellido + ', ' + tel;
    }
}

let persona2 ={
    nombre: 'Juan',
    apellido: 'Wakfu'
}

//uso de call
//para ocupar nombre completo en persona2

console.log(persona1.nombreCompleto('Lic.', 235423));

console.log(persona1.nombreCompleto.call(persona2));

console.log(persona1.nombreCompleto.call(persona2, 'DOC', 123423));

//usar applay
console.log(persona1.nombreCompleto.apply(persona2));
let arreglo = ['Doc', 789781789]
console.log(persona1.nombreCompleto.apply(persona2, arreglo));