import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PickColorServlet", urlPatterns = "/pickcolor")
public class PickColorServlet extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/pickcolor.jsp").forward(req, resp);
        String pickedColor = req.getParameter("pickColor");

        System.out.println("pickedColor = " + pickedColor);

        if (pickedColor == null) {
            resp.sendRedirect("/pickcolor");
        } else {
            resp.sendRedirect("/viewcolor");
        }
        // pass the value of the name variable to the view, and send the request
        // forward to the hello.jsp file
        req.setAttribute("color", pickedColor);
        req.getRequestDispatcher("/viewcolor").forward(req, resp);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String pickedColor = request.getParameter("pickColor");
//
//        System.out.println("pickedColor = " + pickedColor);
//
//        request.setAttribute("colorToView", pickedColor);
//
//        RequestDispatcher dispatch = request.getRequestDispatcher("/viewcolor?color=" + {colorToView});
//        dispatch.forward(request, response);
    }

}
