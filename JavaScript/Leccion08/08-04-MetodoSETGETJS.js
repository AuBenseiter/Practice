let persona = {
    nombre: 'Daniel',
    apellido : 'Frias',
    email: 'hayalfo@gmail.com',
    edad: 28,
    idioma: 'es_ch',
    //metodo
    //get nombre de la funcion(parametros){cuerpo}
    get lang(){
        return this.idioma.toUpperCase();
    },
    set lang(lang){
        this.idioma = lang.toUpperCase();
    },
    get nombreCompleto(){
        return this.nombre + ' ' + this.apellido
    }
}
//asi se llama un metodo con get
console.log(persona.nombreCompleto);

console.log(persona.lang);

//agrrega nuevo valor al idioma

persona.lang = 'ru';
console.log(persona.lang);
console.log(persona.idioma);