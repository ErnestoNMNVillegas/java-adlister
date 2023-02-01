import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "HelloWorldServlet", urlPatterns = "/hello")
public class HelloWorldServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
//        int count = Integer.parseInt(req.getParameter("count"));
        int count;


        try {
            count = Integer.parseInt(req.getParameter("count"));
        } catch (Exception e) {
            count = 1;
        }

        String name = req.getParameter("name");

        if (name == null){
            name = "World";
        }

        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>Hello, " + name + "!</h1>");
        for (int i = 1; i < count; i++){
        out.println("<h1>Hello, " + name + "!</h1>");
    }
    }
}
