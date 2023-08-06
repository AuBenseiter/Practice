class Persona{
    static contadorPersonas = 0;
    //contructor
    constructor(nombre, apellido, email, edad){
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre
        this._apellido = apellido;
        this._email = email;
        this._edad = edad;
        if (Persona.contadorPersonas < Persona.maxPersonas) {
            this.idPersona = ++Persona.contadorPersonas;
        }else{
            console.log('has superado el limite de personas')
        }
    }

    //Metodos
    static get maxPersonas(){
        return 10;
    }
    get idPerdona(){
        return this._idPersona;
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
    get email(){
        return this._email;
    }
    set email(email){
        this._email = email;
    }
    get edad(){
        return this._edad;
    }
    set edad(edad){
        this._edad = edad;
    }
    nombreCompletoemail(){
        return `
        ${this._idPersona}
        ${this._nombre}
        ${this._apellido}
        ${this._email}
        ${this._edad}
        `//this._idPersona + ' ' + this._nombre + ' ' + this._apellido + ' tiene ' + this._email;
    }
    toString(){
        return this.nombreCompletoemail();
    }
}