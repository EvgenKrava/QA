import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletClass extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*PrintWriter writer = resp.getWriter();
        writer.write("<html> \n" +
                "<head> \n" +
                "\t<script> \n" +
                "\t\t//function that display value \n" +
                "\t\tfunction dis(val) \n" +
                "\t\t{ \n" +
                "\t\t\tdocument.getElementById(\"result\").value+=val \n" +
                "\t\t} \n" +
                "\t\t\n" +
                "\t\t//function that evaluates the digit and return result \n" +
                "\t\tfunction solve() \n" +
                "\t\t{ \n" +
                "\t\t\tlet x = document.getElementById(\"result\").value \n" +
                "\t\t\tlet y = eval(x) \n" +
                "\t\t\tdocument.getElementById(\"result\").value = y \n" +
                "\t\t} \n" +
                "\t\t\n" +
                "\t\t//function that clear the display \n" +
                "\t\tfunction clr() \n" +
                "\t\t{ \n" +
                "\t\t\tdocument.getElementById(\"result\").value = \"\" \n" +
                "\t\t} \n" +
                "\t</script> \n" +
                "\t<!-- for styling -->\n" +
                "\t<style> \n" +
                "\t\t.title{ \n" +
                "\t\tmargin-bottom: 10px; \n" +
                "\t\ttext-align:center; \n" +
                "\t\twidth: 210px; \n" +
                "\t\tcolor:blue; \n" +
                "\t\tborder: solid black 2px; \n" +
                "\t\t} \n" +
                "\n" +
                "\t\tinput[type=\"button\"] \n" +
                "\t\t{ \n" +
                "\t\tbackground-color:blue; \n" +
                "\t\tcolor: yellow; \n" +
                "\t\tborder: solid black 2px; \n" +
                "\t\twidth:100% \n" +
                "\t\t} \n" +
                "\n" +
                "\t\tinput[type=\"text\"] \n" +
                "\t\t{ \n" +
                "\t\tbackground-color:white; \n" +
                "\t\tborder: solid black 2px; \n" +
                "\t\twidth:100% \n" +
                "\t\t} \n" +
                "\t</style> \n" +
                "</head> \n" +
                "<!-- create table -->\n" +
                "<body> \n" +
                "\t<div class = title >Calculator</div> \n" +
                "\t<table border=\"1\"> \n" +
                "\t\t<tr> \n" +
                "\t\t\t<td colspan=\"3\"><input type=\"text\" id=\"result\"/></td> \n" +
                "\t\t\t<!-- clr() function will call clr to clear all value -->\n" +
                "\t\t\t<td><input type=\"button\" value=\"c\" onclick=\"clr()\"/> </td> \n" +
                "\t\t</tr> \n" +
                "\t\t<tr> \n" +
                "\t\t\t<!-- create button and assign value to each button -->\n" +
                "\t\t\t<!-- dis(\"1\") will call function dis to display value -->\n" +
                "\t\t\t<td><input type=\"button\" value=\"1\" onclick=\"dis('1')\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"2\" onclick=\"dis('2')\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"3\" onclick=\"dis('3')\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"/\" onclick=\"dis('/')\"/> </td> \n" +
                "\t\t</tr> \n" +
                "\t\t<tr> \n" +
                "\t\t\t<td><input type=\"button\" value=\"4\" onclick=\"dis('4')\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"5\" onclick=\"dis('5')\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"6\" onclick=\"dis('6')\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"-\" onclick=\"dis('-')\"/> </td> \n" +
                "\t\t</tr> \n" +
                "\t\t<tr> \n" +
                "\t\t\t<td><input type=\"button\" value=\"7\" onclick=\"dis('7')\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"8\" onclick=\"dis('8')\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"9\" onclick=\"dis('9')\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"+\" onclick=\"dis('+')\"/> </td> \n" +
                "\t\t</tr> \n" +
                "\t\t<tr> \n" +
                "\t\t\t<td><input type=\"button\" value=\".\" onclick=\"dis('.')\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"0\" onclick=\"dis('0')\"/> </td> \n" +
                "\t\t\t<!-- solve function call function solve to evaluate value -->\n" +
                "\t\t\t<td><input type=\"button\" value=\"=\" onclick=\"solve()\"/> </td> \n" +
                "\t\t\t<td><input type=\"button\" value=\"*\" onclick=\"dis('*')\"/> </td> \n" +
                "\t\t</tr> \n" +
                "\t</table> \n" +
                "</body> \n" +
                "</html> \n");*/

        req.setAttribute("name", "Eugene");
        req.getRequestDispatcher("index.jsp").forward(req, resp);


    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
