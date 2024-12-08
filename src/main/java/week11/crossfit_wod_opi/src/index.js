// In src/index.js
const express = require("express");
//we instantiated and have whole application below
const app = express();
const PORT = process.env.PORT || 3000; // accessing specific port on my comp, default port number is -3000

// For testing purposes
app.get("/", (req, res) => { //the 1st url to open
    res.send("<h2>It's Working!</h2>"); //if we accessed then this message
});

app.listen(PORT, () => {
    console.log(`API is listening on port ${PORT}`); //yes we are listening
});

//nodemon make sure app starts with index.js