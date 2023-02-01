import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet(name = "PageHitCounter", urlPatterns = "/count")

public class PageHitCounter extends HttpServlet {
    private int hitCount;

    public void init()
    {
        // Reset hit counter.
        hitCount = 0;
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        hitCount++;
        PrintWriter out = response.getWriter();
        String title = "Count";
        out.println("<h1>This is the count: " + hitCount + "!</h1>");


    }



}

