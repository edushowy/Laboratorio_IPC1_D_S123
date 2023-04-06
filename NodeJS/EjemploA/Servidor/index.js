/* 

    instalar los siguiente desde los links que se proporcionan

    NodeJS:
        https://nodejs.org/en

    Visual Studio Code:
        https://code.visualstudio.com/download

    >>> instalando las dependencias necesarias, abrir una nueva terminan en visual studio code
    
    expres:
        npm i express

    nodemon:
        npm i nodemon

    body-parser:
        npm i body-parser

    para ejecutar nodemon:
        nodemon index.js
    debemos estar en la misma ubicacion del archivo para que funcione

    si nos da error "la ejecución de scripts está deshabilitada en este sistema" ejecutar los siguientes comandos en powershell modo administrador

    revisar el esttus con:
        Get-ExecutionPolicy
    
    si es: 
        Restricted

    ejecute el comando:
        Set-ExecutionPolicy RemoteSigned



    
para ejecutar entramos a la ruta donde esta este archivo 'index.js' y aplicamos el siguiente comando node index.js */

// llamamos a las dependencias
const express = require('express');
const bodyParser = require('body-parser');
const app = express();

//para enviar parametros por la URL
//app.use(bodyParser.urlencoded({extended : true}));

//para enviar parametros por body
app.use(bodyParser.json());

// inicia el servidor en el puerto indicado
app.listen(3001, ()=>{
    console.log('Servidor corriendo en el puerto 3000');
});

app.get('/unString', function(req, res){
    // send envia una cadena de texto 
    res.send("Hola desde el servidor");    
});

app.get('/unJson', function(req, res){
    // json envia una estrucrtura json
    res.json({"Mensaje":"Hola desde el servidor :3"});
});

app.get('/conParametrosUrl/:nombre/:apellido', function(req, res){
    const nombre = req.params.nombre;
    const apellido = req.params.apellido;
    res.send("Bienvenido: "+apellido+", "+nombre);
});

app.get('/conParametrosBody/', function(req, res){
    const nombre = req.body.nombre;
    const apellido = req.body.apellido;
    res.send(`Bienvenido: ${apellido}, ${nombre}`);
});

app.get('/operacionesBasicas/', function(req, res){
    const numero1 = parseInt(req.body.numero1);
    const numero2 = parseInt(req.body.numero2);

    const suma = numero1+numero2;
    const resta = numero1-numero2;
    const multi = numero1*numero2;
    const divi = numero1/numero2;

    res.json({"Suma":suma,"Resta":resta,"Multiplicacion":multi,"Division":divi});
});



