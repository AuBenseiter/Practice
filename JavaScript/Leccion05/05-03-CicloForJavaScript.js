let contador = 0;

for (let contador = 0; contador < 3; contador++) {
    console.log(contador);
    
}
console.log("Fin ciclo for");
//PALABRA BREAK
for(let contador = 0; contador <= 10; contador++){
    if (contador % 2 == 0) {
        console.log(contador);
        break;
    }
}
console.log("Fin del ciclo for");
//PALABRA CONTINUE
for(let contador = 0; contador <= 10; contador++){
    if (contador % 2 !== 0) {
        //aqui imrimiria los impares
        continue;//ir a la siguiente iteracion
    }else{
        console.log(contador);
    }
}
//PALABRA ETIQUETA(LABEL)
//ES EL GO TO DE ASSAMBLER
inicio:
for(let contador = 0; contador <= 10; contador++){
    if (contador % 2 !== 0) {
        //aqui imrimiria los impares
        continue inicio;//ir a la siguiente iteracion
    }else{
        console.log(contador);
    }
}