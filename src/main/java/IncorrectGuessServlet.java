import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//NOTE:  All work below from Walk-thru

@WebServlet(name = "IncorrectGuessServlet", urlPatterns = "/incorrect")
public class IncorrectGuessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("result", false);
        req.getRequestDispatcher("/WEB-INF/results.jsp").forward(req, resp);
    }
}
