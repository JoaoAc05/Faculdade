window.onload = function() {
  var pokemonInfo = document.getElementById("pokemon-info");
  var btnRandom = document.getElementById("btn-random");

 
  function displayPokemon(pokemon) {
    pokemonInfo.innerHTML += `
      <div class="pokemon">
        <h2>${pokemon.name}</h2>
        <img src="${pokemon.sprites.front_default}" alt="${pokemon.name}">
        <p>Height: ${pokemon.height}</p>
        <p>Weight: ${pokemon.weight}</p>
      </div>
    `;
  }


  function getRandomPokemon() {
    pokemonInfo.innerHTML = ""; 
    for (var i = 0; i < 3; i++) {
      var randomId = Math.floor(Math.random() * 1000) + 1;
      var url = `https://pokeapi.co/api/v2/pokemon/${randomId}`;

      fetch(url)
        .then(function(response) {
          return response.json();
        })
        .then(function(pokemon) {
          displayPokemon(pokemon);
        })
        .catch(function(error) {
          console.log(error);
        });
    }
  }

 
  btnRandom.addEventListener("click", getRandomPokemon);

  
  getRandomPokemon();
};