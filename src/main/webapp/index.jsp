<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>This is the todolist html</title>
    <link rel=stylesheet type="text/css" href="homepage.css">


</head>
<body>
<div id="myDIV" class="header">
    <h2>My To Do List</h2>
    <input type="text" id="myInput" placeholder="Title...">
    <span onclick="newElement()" class="addBtn">Add</span>
</div>

<ul id="myUL">
    <li>Hit the gym</li>
    <li class="checked">Pay bills</li>
    <li>Meet George</li>
    <li>Buy eggs</li>
    <li>Read a book</li>
    <li>Organize office</li>
</ul>
<script type="text/javascript" src="homepage.js"></script>
</body>
</html>