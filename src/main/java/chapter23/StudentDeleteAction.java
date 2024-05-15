//package chapter23;
//
//import java.util.List;
//
//import bean.Student;
//import dao.StudentDAO;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import tool.Action;
//
//public class StudentDeleteAction extends Action {
//    public String execute(
//        HttpServletRequest request, HttpServletResponse response
//    ) throws Exception {
//
//        String no = request.getParameter("no");
//        
//        StudentDAO dao = new StudentDAO();
//        dao.delete(no); // Assuming you have a delete method in your StudentDAO
//
//        List<Student> list = dao.search("");
//        request.setAttribute("list", list);
//
//        return "student_delete_ok.jsp";
//    }
//}
