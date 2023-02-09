<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Usuario</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
	  <h2>Cadastro de Usuarios</h2>
	  <form action="/usuario/incluir" method="post">

	    <div class="form-group">
	      <label>Nome:</label>
	      <input value="Luan Ribeiro" type="text" class="form-control" placeholder="Entre com o seu nome" name="nome">
	    </div>

	    <div class="form-group">
	      <label>E-mail:</label>
	      <input value="luan.almeida@al.infnet.edu.br" type="email" class="form-control" placeholder="Entre com o seu e-mail" name="email">
	    </div>

        <div class="form-group">
            <label>Senha:</label>
            <input value="senha" type="password" class="form-control" placeholder="Entre sua senha" name="senha">
          </div>
		
	    <button type="submit" class="btn btn-default">Cadastrar</button>
	  </form>
	</div>

</body>
</html>