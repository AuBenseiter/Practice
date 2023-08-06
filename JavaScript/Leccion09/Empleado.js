
class Empleado extends Persona{
    static contadoeEmpleados = 0.0;
    //contructor
    contructos(nombre, apellido, email, edad, sueldo){
        super(nombre, apellido, email, edad);
        this._idEmpleado = ++Empleado.contadoeEmpleados;
        this._sueldo = sueldo;
        if(Empleado.idEmpleado < Persona.maxPersonas){
            Empleado.idEmpleado = ++Empleado.idEmpleado;
        }else{
            console.log('El limite de empleados se a superdado')
        }
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
