const prompt = require("prompt-sync")({siginit:true})

const number = prompt("enter a value to find its factorial  ");

if ( number == 0 ){
console.log(`1`);
}else{
let factorial = 1;
for (let i = 1; i <= number; i++){
factorial *= i;
}

console.log(`the factorial of ${number} is ${factorial}`);
}




