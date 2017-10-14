const express = require('express')
const app = express()
var http = require('http');
var pgp = require('pg-promise')(/*options*/)
var db = pgp('postgres://postgres:dhruvil14@34.229.103.137:5432/register')





app.get('/:id', function(req, res){
	/*
  //res.send('id: ' + req.params.id);
  db.one('select * from registration limit $1', req.params.id)
	.then(function (data) {
        console.log(data)
        res.send(data)
   })
  .catch(function (error) {
    console.log('ERROR:', error)
  })
  */

});

app.get('/reg/', function(req, res){
	console.log(req.query())
	console.log(req.query.user)
	console.log(req.query.pas)
  //res.send('id: ' + req.params.id);
   /*db.one('insert into registration values ($1, $2)', req.query.user,req.query.pas)
	.then(function (data) {
        console.log(data)
        res.send(data)
   })
  .catch(function (error) {
    console.log('ERROR:', error)
  })*/


});


app.post('/:user', function(req, res){
   var username = req.query("user")
   //var password = req.query("password")
   alert(username)

  //res.send('id: ' + req.params.id);
  db.one('insert into advisor values ($1, $2)', username,password)
	.then(function (data) {
        console.log(data)
        res.send(data)
   })
  .catch(function (error) {
    console.log('ERROR:', error)
  })

});



app.listen(3000, function () {
  console.log('Example app listening on port 3000!')
})


