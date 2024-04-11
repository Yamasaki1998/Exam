package chapter24;

import java.util.List;

import bean.Subject;
import dao.SubjectDAO;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import tool.Action;

public class SubjectListAction extends Action {
	public String execute(
		HttpServletRequest request, HttpServletResponse response
	) throws Exception {

		HttpSession session=request.getSession(); // セッションの開始

		StudentDAO dao=new SubjectDAO();
		List<Subject> list=dao.search(""); // 科目一覧を取得 

		session.setAttribute("list", list); // 科目一覧をlistという名前で保存

		return "subjectList.jsp"; // subjectList.jspに遷移

	}
}
