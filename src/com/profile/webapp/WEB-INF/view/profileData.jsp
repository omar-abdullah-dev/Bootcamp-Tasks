<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html>
<head>
    <title>Profile Details</title>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div class="page-shell">
    <div class="profile-card">
        <p class="eyebrow">Submission Summary</p>
        <h1>Submitted Profile</h1>
        <p class="profile-subtitle">Here are the details received from the registration form.</p>

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
                    <td>First Name</td>
                    <td>${profileModel.firstName}</td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td>${profileModel.lastName}</td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td>${profileModel.email}</td>
                </tr>
                <tr>
                    <td>City</td>
                    <td>${profileModel.city}</td>
                </tr>
                <tr>
                    <td>Date of Birth</td>
                    <td><fmt:formatDate value="${profileModel.dateOfBirth}" pattern="yyyy-MM-dd" /></td>
                </tr>
                </tbody>
            </table>
        </div>

        <div class="profile-actions">
            <a href="${pageContext.request.contextPath}/" class="custom-btn" style="text-decoration: none; display: inline-block;">Back to Form</a>
        </div>
    </div>
</div>
</body>
</html>
