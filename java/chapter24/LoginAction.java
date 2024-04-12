package chapter24;

import bean.Teacher;
import dao.TeacherDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class LoginAction extends Action {
	public String execute(
			HttpServletRequest request, HttpServletResponse response
		) throws Exception {
		
		HttpSession session=request.getSession();
		
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		
		TeacherDAO dao=new TeacherDAO();
		Teacher teacher=dao.search(password,name);
		
		if (teacher!=null) {
			session.setAttribute("teacher", teacher);
			return "login-out.jsp";
		}
		
		return "login-error.jsp";
		
	}
}
