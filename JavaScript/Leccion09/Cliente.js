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
