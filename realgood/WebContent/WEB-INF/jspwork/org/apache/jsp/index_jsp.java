/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-08-05 12:09:01 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.realgood.member.model.dto.Member;
import com.kh.realgood.store.model.dto.Store;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1596518241681L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1596158276252L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1596158276408L));
    _jspx_dependants.put("jar:file:/C:/Users/user1/git/RealRealGood/realgood/WebContent/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153352682000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.realgood.store.model.dto.Store");
    _jspx_imports_classes.add("com.kh.realgood.member.model.dto.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>main page</title>\r\n");
      out.write("<style>\r\n");
      out.write("/* navi */\r\n");
      out.write(".menu-img {\r\n");
      out.write("\twidth: 320px;\r\n");
      out.write("\theight: 300px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h2, p {\r\n");
      out.write("\tfont-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-md-4 {\r\n");
      out.write("\t/* border: 1px solid black; */\r\n");
      out.write("\tmargin: 15px 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-md-4>h2 {\r\n");
      out.write("\tcolor: black;\r\n");
      out.write("\tmargin: 10px;\r\n");
      out.write("\t/* writing-mode: vertical-lr; */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#jumbotron-back {\r\n");
      out.write("\tbackground-color: pink;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".jumbotron p, .display-3 {\r\n");
      out.write("\tcolor: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("main {\r\n");
      out.write("\theight: 100%;\r\n");
      out.write("\tbackground-color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-secondary, .btn-primary {\r\n");
      out.write("\tbackground-color: #007bff;\r\n");
      out.write("\tborder-color: #007bff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-lg {\r\n");
      out.write("\tbackground-color: rgb(255, 128, 65);\r\n");
      out.write("\tborder-color: rgb(255, 128, 65)\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-md-4 {\r\n");
      out.write("\tposition: relative;\r\n");
      out.write("\twidth: 100%; /* for IE 6 */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".col-md-4 h2 {\r\n");
      out.write("\tposition: absolute;\r\n");
      out.write("\t/* top: 200px; \r\n");
      out.write("            left: 0; \r\n");
      out.write("            width: 100%;  */\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".search-input {\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn-primary {\r\n");
      out.write("\twidth: 100px;\r\n");
      out.write("\theight: 50px;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

	Member loginMember = (Member) session.getAttribute("loginMember");
	Store loginStore = (Store)session.getAttribute("loginStore");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\"\r\n");
      out.write("\tintegrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\"\r\n");
      out.write("\tcrossorigin=\"anonymous\">\r\n");
      out.write("<!-- sweetalert : alert창을 꾸밀 수 있게 해주는 라이브러리 https://sweetalert.js.org/ -->\r\n");
      out.write("<script src=\"https://unpkg.com/sweetalert/dist/sweetalert.min.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("  \t/*** 이전 페이지에서 전달받은 내용을 alert 창으로 표시하기 ***/\r\n");
      out.write("  \t");
String msg = (String) (request.getSession().getAttribute("msg"));
			String status = (String) (request.getSession().getAttribute("status"));
			String text = (String) (request.getSession().getAttribute("text"));
      out.write("\r\n");
      out.write("  \t");
if (msg != null) {
      out.write("\r\n");
      out.write("  \t\tswal({\r\n");
      out.write("  \t\t\ticon : \"");
      out.print(status);
      out.write("\",\r\n");
      out.write("  \t\t\ttitle : \"");
      out.print(msg);
      out.write("\",\r\n");
      out.write("  \t\t\ttext : \"");
      out.print(text);
      out.write("\"\r\n");
      out.write("\t});\r\n");
// Session에 존재하는 특정 키값의 속성 제거
				session.removeAttribute("msg");
				session.removeAttribute("status");
				session.removeAttribute("text");
			}
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("#nav-1 {\r\n");
      out.write("\tbackground-color: rgb(230,167,177);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( min-width : 769px) {\r\n");
      out.write("\t.dropdown-menu .dropdown-toggle:after {\r\n");
      out.write("\t\tborder-top: .3em solid transparent;\r\n");
      out.write("\t\tborder-right: 0;\r\n");
      out.write("\t\tborder-bottom: .3em solid transparent;\r\n");
      out.write("\t\tborder-left: .3em solid;\r\n");
      out.write("\t}\r\n");
      out.write("\t.dropdown-menu .dropdown-menu {\r\n");
      out.write("\t\tmargin-left: 0;\r\n");
      out.write("\t\tmargin-right: 0;\r\n");
      out.write("\t}\r\n");
      out.write("\t.dropdown-menu li {\r\n");
      out.write("\t\tposition: relative;\r\n");
      out.write("\t}\r\n");
      out.write("\t.nav-item .submenu {\r\n");
      out.write("\t\tdisplay: none;\r\n");
      out.write("\t\tposition: absolute;\r\n");
      out.write("\t\tleft: 100%;\r\n");
      out.write("\t\ttop: -7px;\r\n");
      out.write("\t}\r\n");
      out.write("\t.nav-item .submenu-left {\r\n");
      out.write("\t\tright: 100%;\r\n");
      out.write("\t\tleft: auto;\r\n");
      out.write("\t}\r\n");
      out.write("\t.dropdown-menu>li:hover {\r\n");
      out.write("\t\tbackground-color: #f1f1f1\r\n");
      out.write("\t}\r\n");
      out.write("\t.dropdown-menu>li:hover>.submenu {\r\n");
      out.write("\t\tdisplay: block;\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* .dropdown-toggle:visited>.dropdown-menu>li>.submenu {\r\n");
      out.write("      display: block;\r\n");
      out.write("    } */\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<nav class=\"navbar navbar-expand-md navbar-dark\" id=\"nav-1\">\r\n");
      out.write("\t\t<a class=\"navbar-brand\" href=\"");
      out.print(request.getContextPath());
      out.write("\"><img\r\n");
      out.write("\t\t\tsrc=\"");
      out.print(request.getContextPath());
      out.write("/resources/images/title.png\"\r\n");
      out.write("\t\t\talt=\"이미지 없음\"></a>\r\n");
      out.write("\t\t<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\tdata-target=\"#navbarsExample03\" aria-controls=\"navbarsExample03\"\r\n");
      out.write("\t\t\taria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("\t\t\t<span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"collapse navbar-collapse\" id=\"navbarsExample03\">\r\n");
      out.write("\t\t\t<ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("\t\t\t\t<li class=\"nav-item active\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("\"> 메인 </a></li>\r\n");
      out.write("\t\t\t\t");

					if (loginMember == null) {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/member/login.do\"> 로그인 </a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\" href=\"");
      out.print(request.getContextPath());
      out.write("/member/signupTerms.do\"> 회원가입 </a></li>\r\n");
      out.write("\t\t\t\t");

					} else {
				
      out.write("\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link disabled\"><strong>");
      out.print(loginMember.getNickName());
      out.write("님</strong></a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/member/logout.do\">로그아웃</a></li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item\"><a class=\"nav-link\"\r\n");
      out.write("\t\t\t\t\thref=\"");
      out.print(request.getContextPath());
      out.write("/member/selectBookmark.do\">즐겨찾기</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"nav-item dropdown\"><a\r\n");
      out.write("\t\t\t\t\tclass=\"nav-link dropdown-toggle\" href=\"#\" data-toggle=\"dropdown\">\r\n");
      out.write("\t\t\t\t\t\t마이페이지 </a>\r\n");
      out.write("\t\t\t\t\t<ul class=\"dropdown-menu\">\r\n");
      out.write("\t\t\t\t\t\t<!-- <li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("\"/member/myPage.do\" >회원정보수정&raquo</a> -->\r\n");
      out.write("\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/member/myPage.do\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-target=\"#navbarsExample04\" aria-controls=\"navbarsExample04\">회원정보수정</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"submenu dropdown-menu\" id=\"navbarsExample04\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/member/myPage.do\"> 내정보수정</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/member/changePwd.do\"> 비밀번호 변경</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/member/myBoadrCk.do\"> 작성 게시글 확인</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/member/purchase.do\"> 구매내역</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/member/removeMember.do\"> 회원탈퇴</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t");
 if(loginMember.getGradeName().equals("사장회원") || loginMember.getGradeName().equals("관리자")) {
      out.write("\t\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\t\tdata-target=\"#navbarsExample05\" aria-controls=\"navbarsExample05\">점주페이지</a>\r\n");
      out.write("\t\t\t\t\t\t\t<ul class=\"submenu dropdown-menu\" id=\"navbarsExample05\">\r\n");
      out.write("\t\t\t\t\t\t\t\t");
if(loginStore == null){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/store/storeInsert.do\"> 가게정보등록</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
}else{ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/store/storeModify.do\"> 가게정보수정</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t");
} 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t");
 } if(loginMember.getGradeName().equals("관리자")){ 
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t<!-- <li><a class=\"dropdown-item\" href=\"#\"> 관리자정보수정&raquo </a> -->\r\n");
      out.write("\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"#\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\t\t\t\tdata-target=\"#navbarsExample06\" aria-controls=\"navbarsExample06\">관리자정보수정</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t<ul class=\"submenu dropdown-menu\" id=\"navbarsExample06\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/store/adminApprove.do\"> 관리자 승인/대기</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<li><a class=\"dropdown-item\" href=\"");
      out.print(request.getContextPath());
      out.write("/member/memberManage.do\"> 회원관리 페이지</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t");
 } 
      out.write("\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul></li>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t\t<form class=\"form-inline my-2 my-md-0\" action=\"");
      out.print(request.getContextPath());
      out.write("/store/search.do\" method=\"post\">\r\n");
      out.write("\t\t\t\t<input class=\"form-control\" type=\"text\" id=\"address\" name=\"address\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"위치검색\"> <input type=\"button\"\r\n");
      out.write("\t\t\t\t\tclass=\"btn btn-secondary\" onclick=\"sample5_execDaumPostcode()\"\r\n");
      out.write("\t\t\t\t\tvalue=\"위치검색\"> &nbsp;\r\n");
      out.write("\t\t\t\t<button class=\"btn btn-primary\">검색</button>\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</nav>\r\n");
      out.write("\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js\"></script>\r\n");
      out.write("\t<script>\r\n");
      out.write("\r\n");
      out.write("\t\tfunction sample5_execDaumPostcode() {\r\n");
      out.write("\t\t\tnew daum.Postcode({\r\n");
      out.write("\t\t\t\toncomplete : function(data) {\r\n");
      out.write("\t\t\t\t\tvar addr = data.address; // 최종 주소 변수\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t// 주소 정보를 해당 필드에 넣는다.\r\n");
      out.write("\t\t\t\t\tdocument.getElementById(\"address\").value = addr;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t}).open();\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("\t<script src=\"https://code.jquery.com/jquery-3.5.1.min.js\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("\t<script\r\n");
      out.write("\t\tsrc=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\"\r\n");
      out.write("\t\tintegrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\"\r\n");
      out.write("\t\tcrossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<main role=\"main\"> <!-- Main jumbotron for a primary marketing message or call to action -->\r\n");
      out.write("\t<div class=\"jumbotron\" id=\"jumbotron-back\"\r\n");
      out.write("\t\tstyle=\"background-image: url(resources/images/뒷배경.jpg); background-size: 100%;\">\r\n");
      out.write("\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t<h1 class=\"display-3\">\r\n");
      out.write("\t\t\t\t솔직한 리뷰, 믿을 수 있는 평점! <br>맛집어때?\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("\t\t\t<p>Honest reviews, reliable Rating! How about a restaurant?</p>\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<div class=\"container\">\r\n");
      out.write("\t\t<!-- Example row of columns -->\r\n");
      out.write("\t\t<div class=\"row\">\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/store/search.do?group=한식\"><img class=\"menu-img\" src=\"resources/images/한식.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"이미지 없음\"></a><br>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/store/search.do?group=중식\"><img class=\"menu-img\" src=\"resources/images/중식.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"이미지 없음\"></a><br>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/store/search.do?group=일식\"><img class=\"menu-img\" src=\"resources/images/일식.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"이미지 없음\"></a><br>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/store/search.do?group=분식\"><img class=\"menu-img\" src=\"resources/images/분식.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"이미지 없음\"></a><br>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/store/search.do?group=치킨\"><img class=\"menu-img\" src=\"resources/images/치킨.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"이미지 없음\"></a><br>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/store/search.do?group=족발\"><img class=\"menu-img\" src=\"resources/images/족발.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"이미지 없음\"></a><br>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<div></div>\r\n");
      out.write("\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/store/search.do?group=피자\"><img class=\"menu-img\" src=\"resources/images/피자.png\"\r\n");
      out.write("\t\t\t\t\talt=\"이미지 없음\"></a><br>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/store/search.do?group=디저트\"><img class=\"menu-img\"\r\n");
      out.write("\t\t\t\t\t\tsrc=\"resources/images/디저트.png\" alt=\"이미지 없음\"></a><br>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"col-md-4\">\r\n");
      out.write("\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t<a href=\"");
      out.print(request.getContextPath());
      out.write("/store/search.do?group=야식\"><img class=\"menu-img\" src=\"resources/images/야식.png\"\r\n");
      out.write("\t\t\t\t\t\talt=\"이미지 없음\"></a><br>\r\n");
      out.write("\t\t\t\t</p>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t<hr>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<!-- /container --> </main>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("\t<footer class=\"page-footer font-small teal pt-4\">\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"container-fluid text-center text-md-left\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 mt-md-0 mt-3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t<h4 class=\"text-uppercase font-weight-bold\">\r\n");
      out.write("\t\t\t\t\t\t<strong>© 2020 Copyright: (주)완전죠아</strong>\r\n");
      out.write("\t\t\t\t\t</h4>\r\n");
      out.write("\t\t\t\t\t<h6>서울시 종로구 어딘가 kh정보교육원 A Class | 팀장 : 최지은 | 팀원 : 한기성,김성연,장영인,정환균</h6>\r\n");
      out.write("\t\t\t\t\t<em>고객 센터</em>&nbsp;&nbsp;&nbsp;<strong>02-0000-9999</strong>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<hr class=\"clearfix w-100 d-md-none pb-3\">\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"col-md-6 mb-md-0 mb-3\">\r\n");
      out.write("\t\t\t\t\t<h5 class=\"text-uppercase font-weight-bold\">Copyright 완전죠아. All Rights Reserved.</h5>\r\n");
      out.write("\t\t\t\t\t<p>\r\n");
      out.write("\t\t\t\t\t\t(주)완전죠아는 통신판매중개자이며 통신판매의 당사자가 아닙니다. <br> 따라서 상품/ 거래정보 및 거래와\r\n");
      out.write("\t\t\t\t\t\t관련하여 완전죠아에 등록된 판매자의 고의 또는 과실로<br> 소비자에게 발생하는 손해에 대해 완전죠아는 책임을\r\n");
      out.write("\t\t\t\t\t\t지지 않습니다. <br> 상품 및 거래에 관하여 보다 정확한 정보는 해당 판매자에게 직접 확인하여 주시기\r\n");
      out.write("\t\t\t\t\t\t바랍니다. <br> Copyright 완전죠아. All Rights Reserved.\r\n");
      out.write("\t\t\t\t\t</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div class=\"footer-copyright text-center py-3\">\r\n");
      out.write("\t\t\t© 2020 Copyright: <a href=\"");
      out.print(request.getContextPath());
      out.write("\">realgood.com</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
