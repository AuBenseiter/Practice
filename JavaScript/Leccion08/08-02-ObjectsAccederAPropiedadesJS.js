let persona = {
    nombre: 'Daniel',
    apellido : 'Frias',
    email: 'hayalfo@gmail.com',
    edad: 28,
    nombreCompleto: function(){
        return this.nombre + ' ' + this.apellido
    }
}

console.log(persona.nombre);
console.log(persona['apellido']);

//FOR IN
for(nombrePropiedad in persona){
    console.log(nombrePropiedad);
    console.log(persona[nombrePropiedad]);
}