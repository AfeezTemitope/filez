const prompt = require("prompt-sync")({sigint:true});


const figure = 1200;
const annualInterestRate = parseInt(prompt("input value of annual interesr rate "));
const balance = parseInt(prompt("input value of balance "));
const interest = balance * (annualInterestRate /figure);

console.log(`the interest rate is ${interest.toFixed(2)}`); 