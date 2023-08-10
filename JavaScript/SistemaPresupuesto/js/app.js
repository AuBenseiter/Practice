const ingresos = [
    new Ingreso('Sueldo', 2100),
    new Ingreso('Venta', 1500)
];

const egresos = [
    new Egreso('Renta', 1000),
    new Egreso('Comida', 500)
]

let cargarApp = ()=>{
    cargarCabecero();
    cargarIngresos();
    cargarEgresos();
}
let totalIngresos = () => {
    let totalIngreso = 0;
    for (let ingreso of ingresos){
        totalIngreso += (ingreso.valor);
    }
    return totalIngreso;
}

let totalEgresos = ()=> {
    let totalEgreso = 0;
    for(let egreso of egresos){
        totalEgreso += (egreso.valor);
    }
    
    return totalEgreso;
}
let cargarCabecero = ()=> {
    let presupuesto = totalIngresos() - totalEgresos();
    let porcentajeEgreso = totalEgresos()/totalIngresos();
    document.getElementById('presupuesto').innerHTML = formatoMoneda(presupuesto);
    document.getElementById('porcentaje').innerHTML = formatoPortcentaje(porcentajeEgreso);
    document.getElementById('ingresos').innerHTML = formatoMoneda(totalIngresos());
    document.getElementById('egresos').innerHTML = formatoMoneda(totalEgresos());
}

const formatoMoneda = (valor)=> {
    return valor.toLocaleString('es-ES', {style:'currency', currency: 'EUR', minimumFractionDigits:2});
}

const formatoPortcentaje = (valor) => {
    return valor.toLocaleString('en-US',{style: 'percent', minimumFractionDigits: 2});
}

const cargarIngresos = () =>{
    let ingresosHTML = '';
    for(let ingreso of ingresos){
        ingresosHTML += crearIngresoHTML(ingreso);
    }
    document.getElementById('lista-ingresos').innerHTML = ingresosHTML;

}

const cargarEgresos = ()=>{
    let egresoHTML = '';
    for(let egreso of egresos){
        egresoHTML  += crearEgresoHTML(egreso);
    }
    document.getElementById('lista-egreso').innerHTML = egresoHTML;
}
const crearIngresoHTML = (ingreso)=>{
    let ingresoHTML = `
    <div class="elemento limpiarEstilos">
        <div class="elemento_descripcion">${ingreso.descripcion}</div>
        <div class="derecha limpiarEstilos">
        <div class="elemento_valor">${formatoMoneda(ingreso.valor)}</div>
        <div class="elemento_eliminar">
            <button class="elemento_eliminar--btn">
            <ion-icon name="close-circle-outline"
                onclick='eliminarIngreso(${ingreso.id})'></ion-icon>
            </button>
        </div>
        </div>
    </div>`;
    return ingresoHTML;
}

const eliminarIngreso = (id) => {
    //recupero el id (ingreso.id)
    //por cada objeto que tenga nuestro arreglo estamos ocmparando con el id
    //si coninside regresa el id
    let indiceElimnar =ingresos.findIndex((ingreso)=>{ingreso.id === id});
    ingresos.splice(indiceElimnar, 1);
    cargarCabecero();
    cargarIngresos();
}

const crearEgresoHTML = (egreso) => {
    let egresoHTML = `
    <div class="elemento limpiarEstilos">
            <div class="elemento_descripcion">${egreso.descripcion}</div>
            <div class="derecha limpiarEstilos">
              <div class="elemento_valor">-${formatoMoneda(egreso.valor)}</div>
              <div class="elemento_porcentaje">${formatoPortcentaje(egreso.valor/totalEgresos())}</div>
              <button class="elemento_eliminar--btn">
                <ion-icon name="close-circle-outline"
                onclick='eliminarEgreso(${egreso.id})'></ion-icon>
              </button>
            </div>
          </div>
    `;
    return egresoHTML;
}

const eliminarEgreso = (id) => {
    let indiceElimnar = egresos.findIndex((ingreso=>{ingreso.id === id}));
    egresos.splice(indiceElimnar, 1);
    cargarCabecero();
    cargarEgresos();
}

let agregarDato = () => {
    let forma = document.forms['forma'];
    let tipo = forma['tipo'];
    let descripcion = forma['descripcion'];
    let valor = forma['valor'];

    if(descripcion.value !== '' && valor.value !== ''){
        if(tipo.value === 'ingreso'){
            //el + transforma a numero en este caso
            ingresos.push(new Ingreso(descripcion.value, +(valor.value)));
            cargarCabecero();
            cargarIngresos();
        }
        else if(tipo.value === 'egreso'){
            egresos.push(new Egreso(descripcion.value, +(valor.value)));
            cargarCabecero();
            cargarEgresos();
        }
    }
}