<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/index.css"/>
    <title>Main</title>
</head>
<body>
    <div class="main-page-container">
        <div class="header-container">
            <button id="helen-button" class="header-button">
                Khilchuk Helen
            </button>

            <button id="max-button" class="header-button">
                Shmatko Max
            </button>

            <button id="oleksandr-button" class="header-button">
                Oleksandr Steblyanko
            </button>
        </div>

        <div class="image-container">
            <img class="image" src="./assets/jakarta.png">

            <p class="image-text">Jakarta EE LR1</p>
        </div>
    </div>
</body>

    <script type="text/javascript">
        document.getElementById("helen-button").onclick = function () {
            location.href = "info?username=Helen";
        };

        document.getElementById("max-button").onclick = function () {
            location.href = "info?username=Max";
        };

        document.getElementById("oleksandr-button").onclick = function () {
            location.href = "info?username=Oleksandr";
        };
    </script>
</html>