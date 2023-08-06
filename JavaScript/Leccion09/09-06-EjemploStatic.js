//en las clases no existe el hoisting, solo existe en funciones
class Persona{

    static contadorPersonas = 0; //atributo de nuestra clase(plantilla)
    
    //leer el valor
    static get MAX_OBJ(){
        return 5;
    }

    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        if (Persona.contadorPersonas < Persona.MAX_OBJ) {
            this.idPersona = ++Persona.contadorPersonas;
        }else{
            console.log('Se ha superado el maximo de obj permitidos');
        }
        
    }
    //Metodos
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
    nombreCompleto(){
        return this.idPersona + " " + this._nombre + " " + this._apellido;
    }
    //sobreescribiendo el metodo de la clase padre (object)
    toString(){
        //Se aplica polimorfismo (multiples formas en tiempo de ejecucion)
        //el metodo que se ejecuta depende si es una referencia de tipo padre o hijaN
        return this.nombreCompleto();
    }
    static saludar(){
        return console.log('saludos desde metodo static1');
    }
    static saludar2(persona){
        console.log(persona.nombre);
    }
}

class Empleado extends Persona{
    constructor(nombre, apellido, departamento){
        super(nombre, apellido);//llamar al constructor de la clase padre
        this._departamento = departamento;
    }
    get departamento(){
        return this._departamento
    }
    set departamento(departamento){
        this._departamento = departamento
    }
    //sobreescritura
    nombreCompleto(){
        return super.nombreCompleto() + ', ' + this._departamento
    }
}



let persona1 = new Persona('Daniel', 'Frias');
console.log(persona1.toString());

let empleado1 = new Empleado('Ruan', 'Nett', 'sistemas');
console.log(empleado1.toString());

console.log(Persona.contadorPersonas);

let persona2 = new Persona('Jaime', 'Juarez');
console.log(persona2.toString());
console.log(Persona.contadorPersonas);

console.log(Persona.MAX_OBJ);
Persona.MAX_OBJ = 10;//no cambia
console.log(Persona.MAX_OBJ);

let persona3 = new Persona('Mar', 'Azul');
let persona4 = new Persona('Mar', 'Azul');
let persona5 = new Persona('Mar', 'Azul');
