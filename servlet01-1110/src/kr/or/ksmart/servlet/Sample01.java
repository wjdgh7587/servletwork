package kr.or.ksmart.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sample01
 */
@WebServlet(description = "서블릿 샘플", urlPatterns = { "/Sample01" }, initParams = {
		@WebInitParam(name = "servletName", value = "Sample01", description = "init param test") })
public class Sample01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 * @see HttpServlet#HttpServlet()
	 */
	public Sample01() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * 객체화 되어 최초 1회 실행하였을 때 실행되는 메소드
	 * 
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("init : 객체화되어 실행될때 최초 1회 실행되는 메소드");
		// @webInitParam에 설정된 값 가지고 올 수 있다.
		String servletName = config.getInitParameter("servletName");
		System.out.println(servletName + " : servletName");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("destroy : 객체가 제거될시 실행되는 메소드 ");
	}

	/**
	 * @see Servlet#getServletConfig()
	 */

	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 요청방식에 따라 분기하는 메소드 service 실행
	 * 
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	/*
	 * protected void service(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { // TODO Auto-generated
	 * method stub System.out.println("service << 요청방식에 따라 분기하는 메소드 service 실행");
	 * 
	 * }
	 */

	/**
	 * service 메소드에서 분기된 doGet 메소드 : 요청방식 get
	 * 
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at: ").append(request.getContextPath());

		// request 요청에 관련된 정보를 담은 객체 -> 요청 정보(요청os, 클라이언트, 파라미터, 헤더 등)
		// response 응답에 관련된 정보를 담은 객체 -> 응답 정보(헤더, 응답코드, 응답타입등)
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.append("<html>");
		out.append("<head>");
		out.append("<meta charset=\"UTF-8\">");
		out.append("</head>");
		out.append("<body>");
		out.append("<h1>안녕하세요</h1>");
		out.append("</body>");
		out.append("</html>");
		out.flush(); // 비우고
		out.close(); // 객체 닫기
	}

	/**
	 * service 메소드에서 분기된 doGet 메소드 : 요청방식 post(form을 만들거나, 다른 방식으로 선택했을경우 발동)
	 * 
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
