<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/styles/info.css"/>
        <title>Info</title>
    </head>
    <body>
        <div class="info-container">
            <img id="return" class="return-icon" src="./assets/return.png">

            <div class="image-container">
                <img src="${userInfo.getImgSrc()}" class="user-icon">

                <p class="img-text">${userInfo.getLastName()} ${userInfo.getFirstName()}</p>
            </div>

            <div class="info">
                <p class="info-text">Group: ${userInfo.getGroup()}</p>
                <p class="info-text">Age: ${userInfo.getAge()}</p>
            </div>

            <div class="button-container">
                <button id="git" class="git-button">
                    <img src="./assets/github.png" class="git-img">
                    <p class="git-text">GitHub</p>
                </button>
            </div>
        </div>
    </body>

    <script type="text/javascript">
        document.getElementById("return").onclick = function () {
            location.href = "main";
        };

        document.getElementById("git").onclick = function () {
            location.href = "${userInfo.getGitLink()}";
        };
    </script>
</html>
