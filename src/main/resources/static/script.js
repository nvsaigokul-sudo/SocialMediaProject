function createUser() {

    const user = {
        name: document.getElementById("name").value,
        email: document.getElementById("email").value
    };

    fetch("http://localhost:8080/users", {
        method: "POST",
        headers: {
            "Content-Type": "application/json"
        },
        body: JSON.stringify(user)
    })
    .then(response => response.json())
    .then(data => console.log(data));
}