//en las clases no existe el hoisting, solo existe en funciones
class Persona{

    static contadorObjetosPersona = 0; //atributo de nuestra clase(plantilla)
    email = 'valor default'; //atributo de nuestro objeto
    constructor(nombre, apellido){
        this._nombre = nombre;
        this._apellido = apellido;
        Persona.contadorObjetosPersona++;
        console.log('se imcremento en:' + Persona.contadorObjetosPersona)
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
        return this._nombre + " " + this._apellido;
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
console.log(persona1.toString())
//
console.log(persona1);
console.log(persona1.nombre);
persona1.nombre = 'Daniel Frias';
console.log(persona1.nombre);
//
let empleado1 = new Empleado('Ruan', 'Nett', 'sistemas');
console.log(empleado1);
console.log(empleado1.nombre)
console.log(empleado1.nombreCompleto());
console.log(empleado1.toString())
//
//STATIC
//persona1.saludar(); no es posible llamar un metodo static desde un objeto
Persona.saludar();
Persona.saludar2(persona1);
Empleado.saludar();
Empleado.saludar2(empleado1);
//
console.log(persona1.contadorObjetosPersona);
console.log(Persona.contadorObjetosPersona)
console.log(Empleado.contadorObjetosPersona)
//
console.log(persona1.email);
console.log(empleado1.email);
console.log(Persona.email);
console.log(Empleado.email);