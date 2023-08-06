class DispositivoEntrada{
    constructor(tipoEntrada, marca){
        this._tipoEntrada = tipoEntrada;
        this._marca = marca;
    }

    get tiposEntrada(){
        return this._tipoEntrada;
    }
    set tiposEntrada(tipoEntrada){
        this._tipoEntrada = tipoEntrada;
    }
    get marca(){
        return this._marca;
    }
    set marca(marca){
        this._marca = marca;
    }
}

class Raton extends DispositivoEntrada{
    static contadorRatones = 0;

    constructor(tipoEntrada, marca){
        super(tipoEntrada, marca);
        this._idRaton = ++Raton.contadorRatones;
    }
    get idRaton(){
        return this.idRaton;
    }
    toString(){
        return `Raton: [idRaton: ${this._idRaton}, tipoEntrada: ${this._tipoEntrada}, marca: ${this._marca}]` 
    }
}

class Teclado extends DispositivoEntrada{
    static contadorTeclados = 0;
    constructor(tipoEntrada, marca){
        super(tipoEntrada, marca);
        this._idTeclado = ++Teclado.contadorTeclados;
    }

    get idTeclado(){
        return this._idTeclado;
    }
    toString(){
        return `Teclado: [idTeclado: ${this._idTeclado}, tipoEntrada: ${this._tipoEntrada}, marca: ${this._marca}]`
    }
}

class Monitor{
    static contadorMonitores = 0;

    constructor(marca,tamanho){
        this._marca = marca;
        this._tamanho = tamanho;
        this._idMonitor = ++Monitor.contadorMonitores;
    }

    get idMonitor(){
        return this._idMonitor;
    }
    get tamanho(){
        return this._tamanho;
    }
    set tamanho(tamanho){
        this._tamanho = tamanho;
    }
    get marca (){
        return this._marca;
    }
    set marca(marca){
        this._marca = marca;
    }
    toString(){
        return`Monitor: [idMonitor: ${this._idMonitor}, marca: ${this._marca}, tamanho: ${this._tamanho}]`
    }
}

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
        this._computadoras.push(computadora);
    }

    mostrarOrden(){
        let computadorasOrden = '';
        for(let computadora of this._computadoras){
            computadorasOrden += `\n${computadora}`;
        }
        console.log(`Orden: ${this._idOrden}, computadoras: ${computadorasOrden}`)
    }
}

let raton1 = new Raton('USB', 'HP');
let raton2 = new Raton('Bluetoho', 'Acer');
raton2.marca = 'asus';
console.log(raton1.toString());
console.log(raton2.toString());
//
let teclado1 = new Teclado('wireless', 'asus');
let teclado2 = new Teclado('usb', 'Dragon');
console.log(teclado1.toString());
console.log(teclado2.toString());
//
let monitor1 = new Monitor('Gamer', '27"');
let monitor2 = new Monitor('DELL', '27"');
console.log(monitor1.toString());
console.log(monitor2.toString());
//
let computador1 = new Computador('AlienWare', monitor1, raton1, teclado1);
let computador2 = new Computador('Asus', monitor2, raton2, teclado2);
console.log(`${computador2}`);
//
let orden1 = new Orden();
orden1.agregarComputadora(computador1);
orden1.agregarComputadora(computador2);
orden1.agregarComputadora(computador1);
orden1.mostrarOrden();

let orden2 = new Orden();
orden2.agregarComputadora(computador1);
orden2.agregarComputadora(computador2);
orden2.mostrarOrden();