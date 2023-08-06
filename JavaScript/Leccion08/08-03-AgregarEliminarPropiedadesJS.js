let persona = {
    nombre: 'Daniel',
    apellido : 'Frias',
    email: 'hayalfo@gmail.com',
    edad: 28,
    nombreCompleto: function(){
        return this.nombre + ' ' + this.apellido
    }
}

//modificar una propiedad
persona.tel = '5555';
persona.tel = '4434'

console.log(persona);

//borrar una propiedad
delete persona.tel;

console.log(persona);

//imprimir los valores

//1.-Concatenar
console.log(persona.nombre + ', ' + persona.apellido);

//2.-con for in
for(nombrePropiedad in persona){
    console.log(persona[nombrePropiedad]);
}

//3.-con object values
let personaArray = Object.values(persona);
console.log(personaArray);

let personaString = JSON.stringify(persona);
console.log(personaString);
