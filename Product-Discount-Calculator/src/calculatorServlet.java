import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "calculator-Servlet", urlPatterns ="/convert")
public class calculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String description = request.getParameter("Description");
        float price = Float.parseFloat(request.getParameter("Price"));
        float percent = Float.parseFloat(request.getParameter("Percent"));

        float discountAmount = price * percent/100;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>description: " + description+ "</h1>");
        writer.println("<h1>price: " + price+ "</h1>");
        writer.println("<h1>percent: " + percent+ "</h1>");
        writer.println("<h1>Discount Amount: " + discountAmount + "</h1>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
