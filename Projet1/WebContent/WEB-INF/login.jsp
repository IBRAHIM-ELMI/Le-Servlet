<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Convertisseur </title>
    <meta name = "viewport" content = "width = largeur du périphérique, initial-scale = 1.0" >  
    <!-- Bootstrap -->
    <link href = "./assets/css/bootstrap.min.css" rel = "stylesheet" media = "screen" >   
  <style>
      body {
        padding-top: 60px; /* 60px to make the container go all the way to the bottom of the topbar */
      }
    </style>
      <style type="text/css">
      body {
        padding-top: 60px;
        padding-bottom: 40px;
        background-color: #f5f5f5;
      }

      .form-signin {
        max-width: 300px;
        padding: 19px 29px 29px;
        margin: 0 auto 20px;
        background-color: #fff;
        border: 1px solid #e5e5e5;
        -webkit-border-radius: 5px;
           -moz-border-radius: 5px;
                border-radius: 5px;
        -webkit-box-shadow: 0 1px 2px rgba(0,0,0,.05);
           -moz-box-shadow: 0 1px 2px rgba(0,0,0,.05);
                box-shadow: 0 1px 2px rgba(0,0,0,.05);
      }
      .form-signin .form-signin-heading,
      .form-signin .checkbox {
        margin-bottom: 10px;
      }
      .form-signin input[type="text"],
      .form-signin input[type="password"] {
        font-size: 16px;
        height: auto;
        margin-bottom: 15px;
        padding: 7px 9px;
      }

    </style>
  </head>
  <body>
   
    <div class="navbar navbar-inverse navbar-fixed-top">
      <div class="navbar-inner">
        <div class="container">
          <button type="button" class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse">
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="brand" href="#">Convertisseur</a>
          <div class="nav-collapse collapse">
            <ul class="nav">
              
            </ul>
          </div><!--/.nav-collapse -->
        </div>
      </div>
    </div>

    <div class="container">
 <form class="form-signin" method = "post" >
        <h2 class="form-signin-heading">Veuillez vous connecter</h2>
        <input type="text" class="input-block-level" placeholder="Email address" name="email">
        <input type="password" class="input-block-level" placeholder="Password" name ="password">
        <label class="checkbox">
          <input type="checkbox" value="remember-me"> Souviens-toi de moi
        </label>
        <button class="btn btn-large btn-primary" type="submit">Sign in</button>
      </form>
    </div> <!-- /container -->
   
    <script src = "https://code.jquery.com/jquery.js" > </script> 
    <script src = "./asstes/js/bootstrap.min.js" > </script> 
  </body>
</html>