
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

		String school_cd=request.getParameter("school_cd");
		String cd=request.getParameter("cd");
		String name=request.getParameter("name");

		Subject s=new Subject();
		s.setSchool_cd(school_cd);
		s.setCd(cd);
		s.setName(name);
		SubjectDAO dao=new SubjectDAO();
		dao.insert(s);

		List<Subject> list=dao.search("");
		request.setAttribute("list", list);

		return "subjectlist.jsp";
	}
}
