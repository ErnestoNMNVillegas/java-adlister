import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



@WebServlet(name = "ViewColorServlet", urlPatterns = "/viewcolor")
public class ViewColorServlet extends HttpServlet {


    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("WEB-INF/pickcolor.jsp").forward(req, resp);


//        req.setAttribute("color", pickedColor);
        req.getRequestDispatcher("/viewcolor.jsp").forward(req, resp);

//        String pickedColor = req.getParameter("colorToView");
//
//
//        if (pickedColor != null) {
//            resp.sendRedirect("WEB-INF/viewcolor.jsp");
//        } else {
//            resp.sendRedirect("WEB-INF/pickcolor.jsp?error");
//        }

    }

}
