import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/calc")
public class Calculator extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        try {


            String ex = req.getParameter("exp");
            Expression e = new ExpressionBuilder(ex).build();


//        PrintWriter printWriter = resp.getWriter();
//        printWriter.write("<a href=\"/\">"+ex+" = "+e.evaluate()+"</a>");
//        resp.setCharacterEncoding("utf-8");
            req.setCharacterEncoding("utf-8");
            req.setAttribute("result", e.evaluate());
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }catch (Exception e){
            req.setCharacterEncoding("utf-8");
            req.setAttribute("result", "Не могу решить!");
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doPost(req, resp);
    }
}
