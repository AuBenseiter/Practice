//funcion constructor de objetos de tipo Persona
function Persona(nombre, apellido, email){

    this.nombre = nombre;
    this.apellido = apellido;
    this.email = email;
    //metodo de forma function
    this.nombreCompleto = function(){
        return this.nombre + ' ' + this.apellido;
    }
}

Persona.prototype.tel = '4433123131'
let padre = new Persona('Carlos', 'Pascal', 'Carl@mail.cl');
padre.tel = '1231245134'
console.log(padre.nombreCompleto());
console.log(padre.tel)

let madre = new Persona('Valk', 'Edar', 'valk@mail.cl');
console.log(madre.nombreCompleto());
madre.tel = '12342135'
console.log(madre.tel);
