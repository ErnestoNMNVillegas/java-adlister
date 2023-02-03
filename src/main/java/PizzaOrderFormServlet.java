import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet(name = "PizzaOrderFormServlet", urlPatterns = "/pizza-order")
public class PizzaOrderFormServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("pizzaOrderForm.jsp").forward(req, resp);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String pizzaCrust = request.getParameter("pizzaCrust");
        String pizzaSauceType = request.getParameter("pizzaSauceType");
        String pizzaSize = request.getParameter("pizzaSize");
//        String toppings = request.getParameter("toppings");
        String[] toppings = request.getParameterValues("toppings");

        String delAddress = request.getParameter("delAddress");

//        System.out.println()
        System.out.println("pizzaCrust = " + pizzaCrust);
        System.out.println("pizzaSauceType = " + pizzaSauceType);
        System.out.println("pizzaSize = " + pizzaSize);
        System.out.println("toppings = " + Arrays.toString(toppings));
        System.out.println("delAddress = " + delAddress);

    }
}
