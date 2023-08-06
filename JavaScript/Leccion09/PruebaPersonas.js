class Persona{
    static contadorPersonas = 0;
    //contructor
    constructor(nombre, apellido, email, edad){
        this._idPersona = ++Persona.contadorPersonas;
        this._nombre = nombre
        this._apellido = apellido;
        this._email = email;
        this._edad = edad;
       /* if (Persona.contadorPersonas < Persona.maxPersonas) {
            this.idPersona = ++Persona.contadorPersonas;
        }else{
            console.log('has superado el limite de personas')
        }*/
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

class Empleado extends Persona{
    static contadoeEmpleados = 0.0;
    //contructor
    constructor(nombre, apellido, email, edad, sueldo){
        super(nombre, apellido, email, edad);
        this._idEmpleado = ++Empleado.contadoeEmpleados;
        this._sueldo = sueldo;
        /*if(Empleado.idEmpleado < Persona.maxPersonas){
            Empleado.idEmpleado = ++Empleado.idEmpleado;
        }else{
            console.log('El limite de empleados se a superdado')
        }*/
    }

    //metodos
    static get idEmpleado(){
        return this._idEmpleado;
    }
    get sueldo(){
        return this._sueldo;
    }
    set sueldo(sueldo){
        this._sueldo = sueldo;
    }
    toString(){
        return super.toString() + ' ' + this._idEmpleado + ' ' + this._sueldo;
    }
}

class Cliente extends Persona{
    static contadorClientes = 0;
    //constructor
    constructor(nombre, apellido, email, edad, fechaRegistro){
        super(nombre, apellido, email, edad);
        this._idCliente = ++Cliente.contadorClientes;
        this._fechaRegistro = fechaRegistro;
    }
    get idCliente(){
        return this._idCliente;
    }
    get fechaRegistro(){
        return this._fechaRegistro;
    }
    set fechaRegistro(fechaRegistro){
        this._fechaRegistro = fechaRegistro;
    }
    toString(){
        return `${this.nombreCompletoemail()} ${this._idCliente} ${this._fechaRegistro}`;
    }
}



let persona = new Persona('Daniel', 'Frias', 'lalala@lal.cl', 20);
let persona2= new Persona('Dan', 'd', '@', 21)
console.log(persona.toString());
console.log(persona2.toString());

let cliente = new Cliente('Daniel', 'Usio', '@', 42, 123124.2)
console.log(cliente.toString())

let empleado = new Empleado('Usiel', '!@', '@', 32,new Date())
console.log(empleado.toString());