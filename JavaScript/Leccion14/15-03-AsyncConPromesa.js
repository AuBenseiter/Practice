let miPromesa = new Promise((resolver, rechazar) => {
    let expresion = true;
    if(expresion){
        resolver('Resolvio correcto');
    }else{
        rechazar('Se producjo un error');
    }
});

//opcion 1
//miPromesa.then(valor => console.log(valor),error => console.log(error));
//opcion 2
//miPromesa.then(valor => console.log(valor)).catch(error => console.log(error));

let promesa = new Promise((resolver) => {
    //console.log('Inicio promesa');
    setTimeout( () => resolver('Saludos con promesa y timeout'), 3000);
    //console.log('Fin promesa');
});

//promesa.then(valor => console.log(valor));

//Azybc indica que una funcion regresa una promesa
async function miFuncionConPromesa(){
    return 'salucod con promesa y async';
}

miFuncionConPromesa().then(valor => console.log(valor));