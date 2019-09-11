<%@page import="kr.co.itcen.emaillist.dao.EmaillistDao"%>
<%@page import="kr.co.itcen.emaillist.vo.EmaillistVo"%>
<%
	request.setCharacterEncoding("UTF-8");
	
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	String email = request.getParameter("email");
	// TODO Auto-generated method stub
	EmaillistVo vo = new EmaillistVo();
	vo.setFirstName(firstName);
	vo.setLastName(lastName);
	vo.setEmail(email);

	new EmaillistDao().insert(vo);
	

	response.sendRedirect(request.getContextPath() + "/index.jsp");
%>
