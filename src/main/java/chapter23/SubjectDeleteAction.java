package chapter23;

import java.util.List;

import bean.Subject;
import dao.SubjectDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectDeleteAction extends Action {
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception {

        String cd = request.getParameter("cd");
        
        SubjectDAO dao = new SubjectDAO();
        dao.delete(cd); // Assuming you have a delete method in your StudentDAO

        List<Subject> list = dao.search("");
        request.setAttribute("list", list);

        return "subject_delete_ok.jsp";
    }
}
