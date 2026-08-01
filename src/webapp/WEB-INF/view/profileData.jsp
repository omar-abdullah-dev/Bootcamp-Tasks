<%--
  Created by IntelliJ IDEA.
  User: moham
  Date: 8/1/2026
  Time: 2:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Profile Data</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
<div class="page-shell">
    <div class="profile-card">
        <p class="eyebrow">Data submitted successfully</p>
        <h1>${profileModel.firstName} ${profileModel.lastName}</h1>
        <p class="profile-subtitle">Your submitted details are displayed below.</p>

        <div class="table-wrap">
            <table class="profile-table">
                <thead>
                <tr>
                    <th>First Name</th>
                    <th>Last Name</th>
                    <th>Email</th>
                    <th>City</th>
                    <th>Date of Birth</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td>${profileModel.firstName}</td>
                    <td>${profileModel.lastName}</td>
                    <td>${profileModel.email}</td>
                    <td>${profileModel.city}</td>
                    <td><fmt:formatDate value="${profileModel.dateOfBirth}" pattern="yyyy-MM-dd"/></td>
                </tr>
                </tbody>
            </table>
        </div>

        <div class="profile-actions">
            <button
                    type="button"
                    class="custom-btn"
                    onclick="window.location.href='${pageContext.request.contextPath}/';">
                Back to Home
            </button>
        </div>
    </div>
</div>
</body>
</html>
