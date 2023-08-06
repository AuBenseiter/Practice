let persona = {
    nombre: 'Daniel',
    apellido : 'Frias',
    email: 'hayalfo@gmail.com',
    edad: 28,
    nombreCompleto: function(a = this.nombre){
        return this.nombre = a+ ' ' + this.apellido
    }
}

console.log(persona.nombre);
console.log(persona.edad);
console.log(persona.apellido);
console.log(persona.nombreCompleto('jaime'));
console.log(persona);

let persona2 = new Object();
persona2.nombre = 'Panqueque';
persona2.direccion = 'balvar 1243';
persona2.tel = 2123;

console.log(persona2.tel);