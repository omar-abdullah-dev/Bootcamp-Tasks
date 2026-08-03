<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <title>Profile Form</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/css/style.css">
</head>

<body>

<div class="page-shell">

    <div class="profile-card form-card">

        <p class="eyebrow">Profile Form</p>

        <h1>Enter Your Details</h1>

        <p class="profile-subtitle">
            Fill in the fields below to create your profile.
        </p>

        <f:form modelAttribute="profileModel"
                action="submitProfileForm"
                method="post"
                class="profile-form">

            <f:input
                    path="firstName"
                    type="text"
                    placeholder="First Name"
                    cssClass="profile-field"/>

            <f:input
                    path="lastName"
                    type="text"
                    placeholder="Last Name"
                    cssClass="profile-field"/>

            <f:input
                    path="email"
                    type="email"
                    placeholder="Email"
                    cssClass="profile-field"/>

            <f:input
                    path="dateOfBirth"
                    type="date"
                    cssClass="profile-field"/>

            <f:select
                    path="city"
                    cssClass="profile-field">

                <f:option value="" label="Select Governorate"/>

                <f:option value="Alexandria" label="Alexandria"/>
                <f:option value="Aswan" label="Aswan"/>
                <f:option value="Asyut" label="Asyut"/>
                <f:option value="Beheira" label="Beheira"/>
                <f:option value="Beni Suef" label="Beni Suef"/>
                <f:option value="Cairo" label="Cairo"/>
                <f:option value="Dakahlia" label="Dakahlia"/>
                <f:option value="Damietta" label="Damietta"/>
                <f:option value="Faiyum" label="Faiyum"/>
                <f:option value="Gharbia" label="Gharbia"/>
                <f:option value="Giza" label="Giza"/>
                <f:option value="Ismailia" label="Ismailia"/>
                <f:option value="Kafr El Sheikh" label="Kafr El Sheikh"/>
                <f:option value="Luxor" label="Luxor"/>
                <f:option value="Matrouh" label="Matrouh"/>
                <f:option value="Minya" label="Minya"/>
                <f:option value="Monufia" label="Monufia"/>
                <f:option value="New Valley" label="New Valley"/>
                <f:option value="North Sinai" label="North Sinai"/>
                <f:option value="Port Said" label="Port Said"/>
                <f:option value="Qalyubia" label="Qalyubia"/>
                <f:option value="Qena" label="Qena"/>
                <f:option value="Red Sea" label="Red Sea"/>
                <f:option value="Sharqia" label="Sharqia"/>
                <f:option value="Sohag" label="Sohag"/>
                <f:option value="South Sinai" label="South Sinai"/>
                <f:option value="Suez" label="Suez"/>

            </f:select>

            <div class="form-actions">
                <input
                        type="submit"
                        value="Submit"
                        class="custom-btn">
            </div>

        </f:form>

    </div>

</div>

</body>
</html>