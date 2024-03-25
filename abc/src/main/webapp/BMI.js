var ratanmass=parseInt(prompt("enter ratan mass"));
var ratanheight=parseFloat(prompt("enter ratan height"));


var anumass=parseInt(prompt("enter anu mass"));
var anuheight=parseFloat(prompt("enter anu height"));


let BMIratan=(ratanmass/(ratanheight*ratanheight))
let BMIanu=(anumass/(anuheight*anuheight))


document.write("ratan BMI = "+BMIratan+"<br>");
document.write("anu BMI = "+BMIanu+"<br>");



document.writer("TOTAL ="+BMIratan+BMIanu+"<br>");



console.log("ratan BMI ="+BMIratan);
console.log("anu BMI ="+BMIanu);


