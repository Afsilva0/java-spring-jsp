<html>
	<head>
		<title> My first HTML Page - JSP</title>
	</head>
	<body>
 <h3> Login</h3>
   <div>
   <form method="post">
   <label for="name">Name: </label>
   <input  type="text" id="name" name="name" />
   <br>
   <label for="password">Password: </label>
   <input  type="password" id="password"  name="password" />
      <br>
      <input  type="submit" value="login" />
   </form>
   <pre>${errorMessage}</pre>
   </div>
	</body>
</html>