
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {

    // Common method for processing both GET and POST requests
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Set the content type for the response
        response.setContentType("text/html;charset=UTF-8");
    }

    // HTTP POST request handling method
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Call the common processing method
        processRequest(request, response);

        try (PrintWriter out = response.getWriter()) {
            // Generate HTML response for POST request
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Post Response</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome to J2EE tutorial</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // HTTP GET request handling method
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Call the common processing method
        processRequest(request, response);

        try (PrintWriter out = response.getWriter()) {
            // Generate HTML response for GET request
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Get Response</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Welcome to Servlet tutorial</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
}
