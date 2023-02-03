<%--
  Created by IntelliJ IDEA.
  User: ernie
  Date: 2/3/23
  Time: 12:10 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order Form JSP</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/pizza-order" method="post">
<label for="pizzaCrust">Choose a Crust:</label>
<select name="pizzaCrust" id="pizzaCrust">
    <option value="thin">Thin</option>
    <option value="pan">Pan</option>
</select>
<br>
<label for="pizzaSauceType">Choose a Sauce:</label>
<select name="pizzaSauceType" id="pizzaSauceType">
    <option value="marinara">Marinara</option>
    <option value="buffalo">Buffalo</option>
    <option value="bbq">BBQ</option>
</select>
<br>
<label for="pizzaSize">Choose a Size:</label>
<select name="pizzaSize" id="pizzaSize">
    <option value="small">Small</option>
    <option value="medium">Medium</option>
    <option value="large">Large</option>
</select>
<br>
<input type="checkbox" name="toppings" value="pepperoni">
<label>Pepperoni</label><br>
<input type="checkbox" name="toppings" value="spinach">
<label>Spinach</label><br>
<input type="checkbox" name="toppings" value="cheese">
<label>Cheese</label>
<br>
<label for="delAddress">Delivery Address</label>
<input type="text" id="delAddress" name="delAddress" required size="80">
<input type="submit" value="Submit">
</form>

</body>
</html>
