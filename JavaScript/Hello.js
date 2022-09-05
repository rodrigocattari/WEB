let nome='rodrigo';
let  letra = 'o';
for(let index= 0;index <nome.length;index++){
    if(nome[index] === letra){
        nome.replace(letra,'*');
        console.log(nome[index]);
    }
    console.log(nome[index]);
}