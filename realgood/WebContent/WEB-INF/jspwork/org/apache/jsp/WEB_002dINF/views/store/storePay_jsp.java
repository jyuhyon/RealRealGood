/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.56
 * Generated at: 2020-08-05 10:35:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.store;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class storePay_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://code.jquery.com/jquery-1.12.4.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\"\r\n");
      out.write("\tsrc=\"https://cdn.iamport.kr/js/iamport.payment-1.1.5.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\t<script>\r\n");
      out.write("        $(function () {\r\n");
      out.write("            var IMP = window.IMP; // 생략가능\r\n");
      out.write("            IMP.init('imp45865089'); // 'iamport' 대신 부여받은 \"가맹점 식별코드\"를 사용\r\n");
      out.write("            var msg;\r\n");
      out.write("\r\n");
      out.write("            IMP.request_pay({\r\n");
      out.write("                pg: 'kakaopay',\r\n");
      out.write("                pay_method: 'card',\r\n");
      out.write("                merchant_uid: 'merchant_' + new Date().getTime(),\r\n");
      out.write("                name: '(주)완전죠아 음식점 메뉴 결제',\r\n");
      out.write("                amount: opener.$(\"#totalSum\").text()\r\n");
      out.write("        }, function (rsp) {\r\n");
      out.write("            if (rsp.success) {\r\n");
      out.write("                        msg = '결제가 완료되었습니다.';\r\n");
      out.write("                        msg += '\\n고유ID : ' + rsp.imp_uid;\r\n");
      out.write("                        msg += '\\n상점 거래ID : ' + rsp.merchant_uid;\r\n");
      out.write("                        msg += '\\n결제 금액 : ' + rsp.paid_amount;\r\n");
      out.write("                        msg += '\\n카드 승인번호 : ' + rsp.apply_num;\r\n");
      out.write("                        var memberIdTmp = \"");
      out.print(request.getParameter("memberId"));
      out.write("\";\r\n");
      out.write("                            $.ajax({\r\n");
      out.write("                        \turl : \"../member/menuPay.do\",\r\n");
      out.write("                        \tdata : {\"input\" : opener.$(\"#menuCal > p\").text(), \"storeNum\" : ");
      out.print(request.getParameter("storeNum"));
      out.write(", \"memberId\" : memberIdTmp},\r\n");
      out.write("                        \ttype : \"get\",\r\n");
      out.write("                        \tsuccess : function(result) {\r\n");
      out.write("                        \t\tif(result > 0) {\r\n");
      out.write("                        \t\t\tmsg += '\\n\\n마이페이지에서 구매내역을 확인 후 사용하시기 바랍니다.';\r\n");
      out.write("                        \t\t\talert(msg);\r\n");
      out.write("                        \t\t\tself.close();\r\n");
      out.write("                        \t\t}\r\n");
      out.write("                        \t}, error : function() {\r\n");
      out.write("                        \t\tconsole.log(\"Ajax 통신 실패\");\r\n");
      out.write("                        \t\talert(msg);\r\n");
      out.write("                        \t}\r\n");
      out.write("                        \t});\r\n");
      out.write("            } else {\r\n");
      out.write("            \tmsg = '결제에 실패하였습니다.';\r\n");
      out.write("                msg += '에러내용 : ' + rsp.error_msg;\r\n");
      out.write("                //실패시 이동할 페이지 \r\n");
      out.write("\t\t\t\talert(msg);\r\n");
      out.write("                self.close();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
