package mvc;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serial;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Arrays;

@WebServlet("/connection")
public class ConnectionHibernate extends HttpServlet {
    @Serial
    private static final long serialVersionUID = 1L;

    public ConnectionHibernate() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // super.doGet(request, response); // TODO: remove this line for fix error 405 (Method Not Allowed)
        String url = "jdbc:mysql://localhost:8889/hibernate?useSSL=false";
        String username = "root";
        String password = "root";
        String driver = "com.mysql.cj.jdbc.Driver";

        System.out.println(request.getServletPath());

        try {
            PrintWriter out = response.getWriter();
            out.println("[*] Connecting to database: " + url);
            System.out.println("[*] Driver loaded");
            Class.forName(driver);
            Connection connection = DriverManager.getConnection(url, username, password);
            out.println("[*] Database connected");
            connection.close();
        } catch (Exception e) {
            System.out.printf("[!] Error: %s\n", Arrays.toString(e.getStackTrace()));
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
