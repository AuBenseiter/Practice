class Orden {
    static contadorOrdenes = 0;

    constructor(){
        this._idOrden = ++Orden.contadorOrdenes;
        this._computadoras = [];
    }
    get idOrden(){
        return this._idOrden;
    }
    agregarComputadora(computadora){
        this._computadoras.push(computadora)
    }

    mostrarOrden(){
        let computadorasOrden = ' ';
        for(let computadora of this._computadoras){
            computadorasOrden += `\n${computadora}`;
        }
        console.log(`Orden: ${this._idOrden}, computadoras: ${this.computadorasOrden}`)
    }
}

let orden1 = new Orden();
orden1.agregarComputadora(computador1);
orden1.agregarComputadora(computador1);
orden1.agregarComputadora(computador1);
orden1.mostrarOrden();