<%@page language="java" %>
<html>
    <head>
        <title>home</title>
        <link rel="stylesheet" href="index.css">
    </head>
<body>
    <!-- <h2>The result is: <%= session.getAttribute("result") %></h2> using session object -->
    <!-- <h2>The result is: ${result}</h2> using jstl -->
    <h2>The result is: ${student}</h2> <!-- using jstl -->
    <h2>Welcome to the ${course} world</h2>
</body>
</html>