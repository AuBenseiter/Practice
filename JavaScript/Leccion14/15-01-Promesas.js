let miPromesa = new Promise((resolver, rechazar) => {
    let expresion = true;
    if(expresion){
        resolver('Resolvio correcto');
    }else{
        rechazar('Se producjo un error');
    }
});

//opcion 1
miPromesa.then(valor => console.log(valor),error => console.log(error));
//opcion 2
miPromesa.then(valor => console.log(valor)).catch(error => console.log(error));
