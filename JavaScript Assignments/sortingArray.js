const arr = [10,80,90,56,13,1,34]; 
  
function arrSort(arr) { 
    arr.sort((a,b)=>b-a); 
    return arr; 
} 
  
console.log(arrSort(arr));