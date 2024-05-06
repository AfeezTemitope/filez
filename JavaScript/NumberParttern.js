const prompt = require("prompt-sync")({sigint:true})

const userInput = prompt(" Enter a value: " );

for (let i = userInput; i > 0; i--){
for (let j = i; j > 0; j--){
    console.log(j + " ");
}
console.log();
}


