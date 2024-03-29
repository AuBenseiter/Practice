class Producto{
    static contadorProductos = 0;

    constructor(nombre, precio){
        this._idProducto = ++Producto.contadorProductos;
        this._nombre = nombre;
        this._precio = precio;
    }

    get idProducto(){
        return this._idProducto;
    }
    get nombre(){
        return this._nombre;
    }
    set nombre(nombre){
        this._nombre = nombre
    }
    get precio(){
        return this._precio
    }
    set precio(precio){
        this._precio = precio;
    }

    toString(){
        return `
            idProducto: ${this._idProducto}\n
            nombre: ${this._nombre}\n
            precio: $${this._precio}
        `
    }
}

let producto1 = new Producto('Jugo', 1000);
let producto2 = new Producto('Naranja', 20);

console.log(producto1.toString());
console.log(producto2.toString())