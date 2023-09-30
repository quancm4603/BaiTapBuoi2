
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Home page</title>

    <%@include file="../header.jsp" %>

    <style>
        .bd-placeholder-img {
            font-size: 1.125rem;
            text-anchor: middle;
            -webkit-user-select: none;
            -moz-user-select: none;
            user-select: none;
        }

        @media (min-width: 768px) {
            .bd-placeholder-img-lg {
                font-size: 3.5rem;
            }
        }
    </style>


    <!-- Custom styles for this template -->
    <link href="heroes.css" rel="stylesheet">
</head>
<body>

<main>
    <h1 class="visually-hidden">Heroes examples</h1>

    <div class="px-4 py-5 my-5 text-center">
        <h1 class="display-5 fw-bold">Hello Bài Tập Buổi 2</h1>
        <h2 class="display-5 fw-bold">${user}</h2>
        <div class="col-lg-6 mx-auto">
            <div class="d-grid gap-2 d-sm-flex justify-content-sm-center">
                <a href="/login">
                    <button type="button" class="btn btn-primary btn-lg px-4 gap-3">Login</button>
                </a>
                <a href="/check-login">
                    <button type="button" class="btn btn-outline-secondary btn-lg px-4">Check Login</button>
                </a>
                <a href="/logout">
                    <button type="button" class="btn btn-outline-secondary btn-lg px-4">Logout</button>
                </a>
            </div>
        </div>
    </div>

    <div class="b-example-divider mb-0"></div>
</main>


<script src="../assets/dist/js/bootstrap.bundle.min.js"></script>


</body>
</html>

