



btnAgregar.addEventListener('click',function(){

    const numeroPokemon=document.querySelector("#numeroPokemon").value;
    const btnAgregar=document.querySelector('#btnAgregar');

    const container=document.querySelector("#container")
    const cardDiv=document.createElement("div");
    const imgBx=document.createElement("div");
    cardDiv.classList.add("card");
    imgBx.classList.add("imgBx");

    console.log(cardDiv);

console.log(imgBx);

const imgPokemon=document.createElement("img");



imgBx.append(imgPokemon);
cardDiv.append(imgBx);
imgPokemon.src= `./img/${numeroPokemon}.png`;
imgPokemon.alt="Pokemon"
console.log(imgPokemon);
container.append(cardDiv);




})






