<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>
    <style>
        body { font-family: Arial, sans-serif; text-align: center; margin-top: 50px; }
    </style>
</head>
<body>
    <h1>Welcome to the Application</h1>
    <p>You have successfully logged in.</p>
    <p>Name: ${name}</p>
    <div><a href="/list-todos">Manage</a> your todos.</div>
</body>
</html>
