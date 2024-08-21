<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Login page</title>
<link rel="stylesheet" href="login.css">

</head>

<body>
<div class="flex-container">


<img src="https://th.bing.com/th/id/OIP.FHtPitpZOf9yuck3ev7m5wAAAA?pid=ImgDet&rs=1" alt="bank logo" >
<h1>Krishi Bank</h1>
</div>
	<div class="container">
	
		<h2>Login into your account</h2>
		<form id="loginform" action="Login" method="post">
			<div class="form-group">
				<label>Username</label> <input type="text" id="username"
					name="name" placeholder="Enter your name" required>
			</div>
			<div class="form-group">
				<label>Password</label> <input type="text" id="password"
					name="password" placeholder="Enter your password" required>
			</div>

			<div class="pass">
				Forgot password?

				<button type="submit">Login</button>
			<div class="Signup-link">
					Don't have an account? <a href="signup.jsp">Sign up</a>
					</div></div>
		</form>
		</div>
</body>
</html>