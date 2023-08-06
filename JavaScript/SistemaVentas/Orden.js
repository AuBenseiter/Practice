class Orden{
    static contadorOrdenes = 0;
    static get MAX_PRODUCTOS(){
        return 5;
    }

    constructor(){
        this.idOrden = ++Orden.contadorOrdenes;
        this._productos = [];
        this._contadorProductosAgregados = 0;
    }

    get idOrden(){
        return this._idOrden;
    }

    agregarProducto(producto){
        if(this._productos.length < Orden.MAX_PRODUCTOS){
            //Dos formas de agregar
            this._productos.push(producto);//agrego un 'producto' al arreglo producto
            //this._productos[this._contadorProductosAgregados++] = producto;
        }else{
            console.log('No se pueden agregar mas productos');
        }
    }

    calcularTotal(){
        let totalVenta = 0;
        for(let producto of this._productos){
            totalVenta += producto.precio; //totalVenta = totalVenta + producto.precio
        }
        return totalVenta;
    }
    
    mostrarOrden(){
        let productosOrden = '';
        for(let producto of this._productos){
            productosOrden += producto.toString() + ' ';
        }
        console.log(`Orden: ${this._idOrden} Total: ${this.calcularTotal}, Productos: ${productosOrden}`);
    }
}

