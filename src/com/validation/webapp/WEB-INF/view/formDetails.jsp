<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration Details</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div class="page-shell">
    <div class="profile-card">
        <p class="eyebrow">Success</p>
        <h1>Registration Successful!</h1>
        <p class="profile-subtitle">Employee details have been saved successfully.</p>

        <div class="table-wrap">
            <table class="profile-table">
                <thead>
                <tr>
                    <th>Field</th>
                    <th>Value</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>Username</td>
                    <td>${employee.username}</td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>${employee.email}</td>
                </tr>
                </tbody>
            </table>
        </div>

        <div class="profile-actions">
            <a href="${pageContext.request.contextPath}/" class="custom-btn" style="text-decoration: none; display: inline-block;">Register Another</a>
        </div>
    </div>
</div>
</body>
</html>
