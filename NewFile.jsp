
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link rel="stylesheet "type="text/css" href="style.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>

<body>
	<div class="container  mt-10">
		<div class="form text-center">
			<h1>
				<b> Forgot Password</b>
			</h1>
			<div />

			<form id="loginForm" modelAttribute="login" action="loginProcess"
				method="post">
				<div align="center">
					<div class="container">
						<label for="uname"><b>Employee ID</b></label> <input type="text"
							placeholder="Enter Username" name="uname" required> <br/>
						<label for="psw"><b>Mobile Number</b></label> <input type="password"
							placeholder="Enter Password" name="psw" required> <br/>
						<button type="submit">Login</button>
						
						</label>
					</div>

					<div class="container1" style="background-color:#f1f1f1">
						<button type="button" class="cancelbtn"><a href="login.jsp">Cancel</a></button>
						<button type="button" class="cancelbtnn">SEND OTP</button>
                    </tr>
					</div>

			</div>   
			</form>  
				
</body>
</html>