package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Shopping cart</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>Shopping Cart</h1>\n");
      out.write("        <form action=\"CartController\" method=\"post\">\n");
      out.write("            Choose your favourite book:\n");
      out.write("            <br>\n");
      out.write("            <select name=\"cboBook\" size=\"20\">\n");
      out.write("                <option value=\"Common Gateway Interface - CGI\">Common Gateway Interface - CGI</option>\n");
      out.write("                <option value=\"Servlet\">Servlet</option>\n");
      out.write("                <option value=\"JavaServer Page - JSP\">JavaServer Page - JSP</option>\n");
      out.write("                <option value=\"Tomcat Server\">Tomcat Server</option>\n");
      out.write("                <option value=\"Struts\">Struts</option>\n");
      out.write("                <option value=\"JavaServer Face - JSF\">JavaServer Face - JSF</option>\n");
      out.write("                <option value=\"Integrating Java with XML - IXJ\">Integrating Java with XML - IXJ</option>\n");
      out.write("                <option value=\"Java Web Services - JWS\">Java Web Services - JWS</option>\n");
      out.write("                <option value=\"Enterprice Java Beans - EJB\">Enterprice Java Beans - EJB</option>\n");
      out.write("                <option value=\"JBoss Server\">JBoss Server</option>\n");
      out.write("                <option value=\"Glassfish Server\">Glassfish Server</option>\n");
      out.write("            </select>\n");
      out.write("            <br>\n");
      out.write("            <input type=\"submit\" value=\"AddToCart\" name=\"action\">\n");
      out.write("            <input type=\"submit\" value=\"ViewCart\" name=\"action\">\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
