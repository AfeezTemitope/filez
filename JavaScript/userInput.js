const prompt=require("prompt-sync")({sigint:true}); 

var num1,num2;
num1 = parseFloat(prompt("Enter the first number: "));

num2 = parseFloat(prompt("Enter the second number: "));


const sum = num1 + num2;

console.log(`The sum of ${num1} and ${num2} is ${sum}`);
