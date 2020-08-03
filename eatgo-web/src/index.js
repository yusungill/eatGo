(async () => {
    const url = "http://localhost:8080/restaurants";
    const response = await fetch(url);
    const restaurants = await response.json();
    const element = document.querySelector("#app");
    console.log(element);
    console.log(restaurants);
       element.innerHTML =

       `${restaurants.map(restaurant =>{
        return(
            `<p>
            ${restaurant.id}
            ${restaurant.name}
            ${restaurant.address}
            </p>`)
            }).join(" ")}`
})();


