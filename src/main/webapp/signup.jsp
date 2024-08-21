<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="login.css">
</head>
<body>
<div class="flex-container">


<img src="https://th.bing.com/th/id/OIP.FHtPitpZOf9yuck3ev7m5wAAAA?pid=ImgDet&rs=1" alt="bank logo" >
<h1>Krishi Bank</h1>
</div>
	<div class="signup">
		<form id="signup" action="Signup" method="post">
			<div class="box">
				<h1>Sign Up</h1>

				<div class="name">
					<label>First Name</label> <input type="text" name="first_name"
						placeholder="First Name" required>
				</div>
				<div class="name">
					<label>Last Name</label> <input type="text" name="last_name"
						placeholder="Last Name" required>
				</div>
				<div class="name">
					<label>Email</label> <input type="Email Id" name="email"
						placeholder="xyz@abc" required>
				</div>
				<div class="name">
					<label>Password</label> <input type="text" placeholder="password"
						required>
				</div>
				<div class="name">
					<label>Confirm Password</label> <input type="password"
						name="password" placeholder="password" required>
				</div>
				<button type="submit">Signup</button>
				</a>
				<p>
					By clicking the sign up button you agree to our<br> <a
						href="#">Terms and Conditions</a>
				</p>
			</div>
		</form>
</body>
<script>
	var signup = document.getElementById("signup")
	form.addEventListener("submit",
			function(event) {
				event.preventDefault();
				var firstName = document.getElementById("firstName").value
				console.log(firstName);
				var lastName = document.getElementById("lastName").value
				console.log(lastName);
				function validateEmail() {
					var email = document.getElementById("email").value;
					var emailRegex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

					if (!emailRegex.test(email)) {
						alert("Please enter a valid email address.");
						return false;
					}

					return true;
				}
				;
				function validatePassword() {
					var password = document.getElementById("password").value;
					var confirmPassword = document
							.getElementById("confirmPassword").value;

					if (password !== confirmPassword) {
						alert("Passwords do not match.");
						return false;
					}

					return true;
				}

			})
</script>
</html>