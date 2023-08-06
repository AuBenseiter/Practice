class Computador{
    static contadorComputadora = 0;

    constructor(nombre, monitor, raton, teclado){
        this._idComputador = ++Computador.contadorComputadora;
        this._nombre = nombre;
        this._monitor = monitor;
        this._raton = raton;
        this._teclado = teclado;
    }
    toString(){
        return `Computadora ${this._idComputador}: \n ${this._nombre} \n ${this._monitor} \n ${this._raton} \n ${this._teclado} `
    }
}

let computador1 = new Computador('AlienWare', monitor1, raton1, teclado1);
let computador2 = new Computador('Asus', monitor2, raton2, teclado2);
console.log(`${computador2}`);