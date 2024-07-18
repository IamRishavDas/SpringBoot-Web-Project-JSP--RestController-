<%@page language="java" %>
<html>
    <head>
        <title>home</title>
        <link rel="stylesheet" href="index.css">
    </head>
<body>
    <div class="container">
        <form action="addStudent" method="GET" class="form">
            <h2>Submit Your Text</h2>
            <div class="input-group">
                <input type="text" name="id" id="id" placeholder="Enter the Alien id: " required>
                <input type="text" name="name" id="name" placeholder="Enter the Alien name: " required>
            </div>
            <button type="submit" value="submit">Submit</button>
        </form>
    </div>
</body>
</html>