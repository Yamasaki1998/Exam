package chapter23;

import java.util.List;

import bean.Subject;
import dao.SubjectDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import tool.Action;

public class SubjectInsertAction extends Action {
    public String execute(
        HttpServletRequest request, HttpServletResponse response
    ) throws Exception {

        String school_cd = request.getParameter("school_cd");
        String cd = request.getParameter("cd");
        String name = request.getParameter("name");

        Subject s = new Subject();
        s.setSchool_cd(school_cd);
        s.setCd(cd);
        s.setName(name);
        SubjectDAO dao = new SubjectDAO();
        try {
            dao.insert(s);
        } catch (Exception e) {
            // エラーが発生した場合に subject_insert_error.jsp に遷移
            return "subject-insert-error.jsp";
        }

        List<Subject> list = dao.search("");
        request.setAttribute("list", list);

        return "subject_insert_ok.jsp";
    }
}
