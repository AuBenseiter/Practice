class Motinor{
    static contadorMonitores = 0;

    constructor(marca,tamanho){
        this._marca = marca;
        this._tamanho = tamanho;
        this._idMonitor = ++Motinor.contadorMonitores;
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