window.onload = function() {
    var pokemonInfo = document.getElementById("pokemon-info");
    var btnRandom = document.getElementById("btn-random");
  
    
    function displayRandomPokemon() {
      fetch("https://pokeapi.co/api/v2/pokemon/" + getRandomPokemonId())
        .then(function(response) {
          return response.json();
        })
        .then(function(pokemon) {
          pokemonInfo.innerHTML = `
            <h2>${pokemon.name}</h2>
            <img src="${pokemon.sprites.front_default}" alt="${pokemon.name}">
            <p>Height: ${pokemon.height}</p>
            <p>Weight: ${pokemon.weight}</p>
          `;
        })
        .catch(function(error) {
          console.log(error);
        });
    }
  
    function getRandomPokemonId() {
      return Math.floor(Math.random() * 1000) + 1;
    }
  
    btnRandom.addEventListener("click", displayRandomPokemon);
    
  };