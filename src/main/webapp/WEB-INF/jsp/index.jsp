<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<html lang="en">
<head>



</head>
<body>

	<div>
		<div>
			<h1>Spring Boot JSP Example</h1>

	<form action="/ss">
		<input type="text" onkeydown="a(c)" maxlength="10" id="1">
		<input type="submit" value="save">
	</form>

			<script>
				function a(c) {
				    if(2<document.getElementById('1').value.length){
                        c.preventDefault();
					}


                }

			</script>
			

		</div>

	</div>
</body>
</html>
