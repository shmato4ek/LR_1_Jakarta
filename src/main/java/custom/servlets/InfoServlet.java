package custom.servlets;

import Models.UserInfo;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "infoServlet", value = "/info")
public class InfoServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("username");
        UserInfo userInfo = new UserInfo();
        switch (userName)
        {
            case "Helen":
                userInfo.setFirstName("Helen");
                userInfo.setLastName("Khilchuk");
                userInfo.setAge(21);
                userInfo.setGroup("IM-32mp");
                userInfo.setImgSrc("./assets/women.png");
                userInfo.setGitLink("https://github.com/khilchuk-ol");
                break;

            case "Max":
                userInfo.setFirstName("Max");
                userInfo.setLastName("Shmatko");
                userInfo.setAge(21);
                userInfo.setGroup("IS-32mp");
                userInfo.setImgSrc("./assets/man.png");
                userInfo.setGitLink("https://github.com/shmato4ek");
                break;

            case "Oleksandr":
                userInfo.setFirstName("Oleksandr");
                userInfo.setLastName("Steblyanko");
                userInfo.setAge(21);
                userInfo.setGroup("IS-32mp");
                userInfo.setImgSrc("./assets/man.png");
                userInfo.setGitLink("https://github.com/Alexander-Steblyanko");
                break;
        }

        request.setAttribute("userInfo", userInfo);

        getServletContext().getRequestDispatcher("/info.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
