import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {

//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.getRequestDispatcher("WEB-INF/pickcolor.jsp").forward(req, resp);
//
//        String pickedColor = req.getParameter("colorToView");
//
//        if (pickedColor != null) {
//            resp.sendRedirect("WEB-INF/viewcolor.jsp");
//        } else {
//            resp.sendRedirect("WEB-INF/pickcolor.jsp?error");
//        }
//    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String pickedColor = request.getParameter("pickColor");

        System.out.println("pickedColor = " + pickedColor);

        request.setAttribute("colorToView", pickedColor);

        RequestDispatcher dispatch = request.getRequestDispatcher("/viewcolor");
        dispatch.forward(request, response);
    }

}
