let a = 3, b = 4, c = "3";

let z = a == b; //se revisa el valor sin importar el tipo
console.log(z);
z = a == c;
console.log(z);

z = a === c;//se revisa los valores y tambien los tipos
console.log(z);

//-------//
z = a != c;//se revisa el valor sin importar el tipo
console.log(z);

z = a !== b; //se revisa los valores y tambien los tipos
console.log(z);
z = a !== c; //se revisa los valores y tambien los tipos
console.log(z);

//-----//
z = a < b;
console.log(z);
z = a <= b;
console.log(z);
z = a > b;
console.log(z);
z = a >= b;
console.log(z);

