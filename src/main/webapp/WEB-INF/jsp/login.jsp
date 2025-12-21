<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Login</title>
    <style>
      body {
        font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", Roboto, Helvetica, Arial, sans-serif;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        margin: 0;
        background-color: #f4f7f6;
      }
      .login-card {
        background: #fff;
        padding: 2rem;
        border-radius: 8px;
        box-shadow: 0 4px 12px rgba(0, 0, 0, 0.1);
        width: 100%;
        max-width: 360px;
      }
      .login-card h2 {
        margin-top: 0;
        color: #333;
        text-align: center;
      }
      .form-group {
        margin-bottom: 1.25rem;
      }
      .form-group label {
        display: block;
        margin-bottom: 0.5rem;
        color: #666;
        font-size: 0.9rem;
      }
      .form-group input {
        width: 100%;
        padding: 0.75rem;
        border: 1px solid #ddd;
        border-radius: 4px;
        box-sizing: border-box;
        font-size: 1rem;
      }
      .form-group input:focus {
        outline: none;
        border-color: #007bff;
        box-shadow: 0 0 0 2px rgba(0, 123, 255, 0.25);
      }
      .btn-login {
        width: 100%;
        padding: 0.75rem;
        background-color: #007bff;
        color: white;
        border: none;
        border-radius: 4px;
        font-size: 1rem;
        font-weight: 600;
        cursor: pointer;
        transition: background-color 0.2s;
      }
      .btn-login:hover {
        background-color: #0056b3;
      }
      .error-message {
        color: #d9534f;
        background-color: #f2dede;
        border: 1px solid #ebccd1;
        padding: 0.75rem;
        border-radius: 4px;
        margin-bottom: 1rem;
        font-size: 0.875rem;
        text-align: center;
      }
      .user-card {
        background: linear-gradient(135deg, #667eea 0%, #764ba2 100%);
        color: white;
        padding: 1.5rem;
        border-radius: 8px;
        box-shadow: 0 10px 20px rgba(0, 0, 0, 0.1);
        width: 100%;
        max-width: 360px;
        margin-bottom: 1.5rem;
        text-align: center;
        animation: fadeIn 0.5s ease-out;
      }
      @keyframes fadeIn {
        from {
          opacity: 0;
          transform: translateY(-10px);
        }
        to {
          opacity: 1;
          transform: translateY(0);
        }
      }
      .user-card h3 {
        margin: 0 0 1rem 0;
        font-size: 1.5rem;
        font-weight: 600;
        text-shadow: 0 1px 2px rgba(0, 0, 0, 0.1);
      }
      .user-details {
        display: flex;
        flex-direction: column;
        gap: 0.5rem;
      }
      .user-info-row {
        background: rgba(255, 255, 255, 0.2);
        padding: 0.5rem 1rem;
        border-radius: 20px;
        font-size: 0.95rem;
      }
    </style>
  </head>
  <body>
    <div style="display: flex; flex-direction: column; align-items: center; width: 100%">
      <% if (request.getAttribute("name") != null && !((String)request.getAttribute("name")).isEmpty()) { %>
      <div class="user-card">
        <h3>Hello, <%= request.getAttribute("name") %>!</h3>
        <div class="user-details">
          <% if (request.getAttribute("age") != null) { %>
          <div class="user-info-row">Age: <strong><%= request.getAttribute("age") %></strong></div>
          <% } %> <% if (request.getAttribute("birthday") != null) { %>
          <div class="user-info-row">Birthday: <strong><%= request.getAttribute("birthday") %></strong></div>
          <% } %>
        </div>
      </div>
      <% } %>

      <div class="login-card">
        <h2>Sign In</h2>

        <% if (request.getAttribute("errorMessage") != null) { %>
        <div class="error-message"><%= request.getAttribute("errorMessage") %></div>
        <% } %>

        <form action="${pageContext.request.contextPath}/login" method="post">
          <div class="form-group">
            <label for="username">Username</label>
            <input type="text" id="username" name="username" required autofocus />
          </div>
          <div class="form-group">
            <label for="password">Password</label>
            <input type="password" id="password" name="password" required />
          </div>
          <button type="submit" class="btn-login">Login</button>
        </form>
      </div>
    </div>
  </body>
</html>
