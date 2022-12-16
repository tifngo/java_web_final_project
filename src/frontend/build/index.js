const elem = document.getElementById("element");

elem.innerText = "dynamically added text";

async function getCat() {
    const catElem = document.getElementById("cat");
    try {
        const response = await fetch('http://localhost:8080/api/cats');
        const responseJSO = await response.json(); 
        catElem.innerText = "My favorite cat is named " + responseJSO[0].name + ". The breed of this cat is " + responseJSO[0].breed;
    } catch (e) {
        console.log(e);
    }
}

getCat(); 