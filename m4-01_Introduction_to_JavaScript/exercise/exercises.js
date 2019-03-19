/*sumDouble Given two int values, return their sum. Unless the two values are the same, then return double their sum.

 sumDouble(1, 2) → 3
 sumDouble(3, 2) → 5
 sumDouble(2, 2) → 8

 function sumDouble(x, y) {
 	// do logic here
 	// return result;
 	return x + y;
 }
 */

 function sumDouble(x,y){
     if(x === y){
         return (x+y) *2;
     }
     return x + y;
 }

 function hasTeen(x, y, z){
     if(x >= 13 && x <= 19){
         return true;
     }else if(y >= 13 && y<= 19){
        return true;
     }else if (z >= 13 && z <= 19){
         return true;
     }else{
         return false;
     }
 }

 function lastDigit(x, y){
      x = x.toString();
      y = y.toString();

     if( x.substring(x.length - 1) === y.substring(y.length - 1)){
         return true;
     }
         return false;
 }
 
 function seeColor(word){
     if(word.substring(0, 3) === "red"){
         return "red";
     }else if(word.substring(0,4) === "blue"){
         return "blue";
     }
     return "";
 }

 function oddOnly(odds){
     odds2 = [];
     for(let i = 0; i < odds.length; i++){
         if(odds[i] % 2 == 1){
             odds2.push(odds[i]);
         }
     }
     return odds2;
 }

 function frontAgain(string){
     let stringLength = 2;
     let beginning = string.slice(0, 2);
     let end = string.slice(string.length - 2, string.length);
     if(beginning == end){
         return true;
     }
        return false;
 }

 function cigarParty(cigars, weekend){
     if((cigars >= 40 && cigars <= 61 && weekend == false) || (cigars > 39 && weekend == true)){
         return true;
     }
        return false;
 }

 function fizzBuzz(x){
     if(x % 15 == 0){
         return "FizzBuzz";
     }else if (x % 3 == 0){
         return "Fizz";
     }else if (x % 5 == 0){
         return "Buzz";
     }else{
         return x;
     }
 }

 function filterEvens(evens){
     evens2 = [];
     for(let i = 0; i < evens.length; i ++){
         if(evens[i] % 2 == 0){
             evens2.push(evens[i]);
         }
     }
        return evens2;
 }

 function filterBigNumbers(nums){
     numsArray = [];
    
     for(let i = 0 ; i < nums.length; i++){
         if(nums[i] >= 100){
            return numsArray.push(nums[i]);
         }
    }  
     return numsArray;
 }

function filterMultiplesOfX(){
    
}





function createObject() {
  const person = {
    firstName: "Leroy",
    lastName: "Jenkins",
    age: 42
  }
  return person;
}