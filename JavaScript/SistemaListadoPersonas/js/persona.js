console.log('Clase de personas');
class Persona{

    static contadorPersonas = 0;

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        this._persona = ++Persona.contadorPersonas;
    }
    
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre;
    }
    get apellido(){
        return this._apellido;
    }
    set apellido(apellido){
        this._apellido = apellido;
    }
}