package chapter23;

import java.io.IOException;
import java.io.PrintWriter;

import bean.Student;
import dao.StudentDAO;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Page;

@WebServlet(urlPatterns = { "/chapter23/insert" })
public class Insert extends HttpServlet {

    public void doPost(
            HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Page.header(out);
        try {
            String no = request.getParameter("no");
            String name = request.getParameter("name");
            String ent_year = request.getParameter("ent_year");
            String class_num = request.getParameter("class_num");
            Boolean isattend = Boolean.parseBoolean(request.getParameter("isattend"));
            String school_cd = request.getParameter("school_cd");

            Student s = new Student();
            s.setNo(no);
            s.setName(name);
            s.setEnt_year(ent_year);
            s.setClass_num(class_num);
            s.setIsattend(isattend);
            s.setSchool_cd(school_cd);

            StudentDAO dao = new StudentDAO();
            int line = dao.insert(s);

            if (line > 0) {
            	 response.sendRedirect("../chapter24/insert_out.jsp");
            } else {
                // エラーが発生した場合に同じページにリダイレクト
                response.sendRedirect("../chapter24/insert-error.jsp");
            }
        } catch (Exception e) {
            // エラーが発生した場合に同じページにリダイレクト
            response.sendRedirect("../chapter24/insert-error.jsp");
        }
        Page.footer(out);
    }
}
