package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"utf-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\t<title>Bootstrap Test</title>\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\n");
      out.write("\t<script src=\"js/jquery-1.11.3.min.js\"></script>\n");
      out.write("\t<!-- Include all compiled plugins (below), or include individual files as needed -->\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<!-- Bootstrap -->\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t<div class=\"container theme-showcase\" role=\"main\">\n");
      out.write("\n");
      out.write("\t\t<!-- Main jumbotron for a primary marketing message or call to action -->\n");
      out.write("\t\t<div class=\"jumbotron\">\n");
      out.write("\t\t\t<h1>Arm&aacute; tu Sanguchetto</h1>\n");
      out.write("\t\t\t<p></p>\n");
      out.write("\t\t</div>\n");
      out.write("\n");
      out.write("\t\t<div class=\"page-header\">\n");
      out.write("\t\t\t<h1>Eleg&iacute; Ingrediente</h1>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div>\n");
      out.write("\t<!--  \t\t<label>Eleg&iacute; Ingrediente</label>-->\n");
      out.write("\t\t\t<div class=\"checkbox\">\n");
      out.write("  \t\t\t\t<label><input type=\"checkbox\" value=\"queso\">Queso</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"checkbox\">\n");
      out.write("  \t\t\t\t<label><input type=\"checkbox\" value=\"Jamon\">Jam&oacute;n</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"checkbox\">\n");
      out.write("  \t\t\t\t<label><input type=\"checkbox\" value=\"Tomate\">Tomate</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"checkbox\">\n");
      out.write("  \t\t\t\t<label><input type=\"checkbox\" value=\"Lechuga\">Lechuga</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"checkbox\">\n");
      out.write("  \t\t\t\t<label><input type=\"checkbox\" value=\"Mayonesa\">Mayonesa</label>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<datalist></datalist>\n");
      out.write("\t\t\t<button>Agregar</button>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t </br>\n");
      out.write("\t\t<form class=\"form-inline\">\n");
      out.write("\t\t  <div class=\"form-group\">\n");
      out.write("\t\t  \t<label>TOTAL</label>\n");
      out.write("\t\t    <label class=\"sr-only\" for=\"exampleInputAmount\">Amount (in dollars)</label>\n");
      out.write("\t\t    <div class=\"input-group\">\n");
      out.write("\t\t      <div class=\"input-group-addon\">$</div>\n");
      out.write("\t\t      <input type=\"text\" class=\"form-control\" id=\"exampleInputAmount\" placeholder=\"Amount\">\n");
      out.write("\t\t      <div class=\"input-group-addon\">.00</div>\n");
      out.write("\t\t    </div>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t  </br>\n");
      out.write("\t\t  </br>\n");
      out.write("\t\t  <div>\n");
      out.write("\t\t  <button type=\"submit\" class=\"btn btn-lg btn-primary\">Confirmar</button>\n");
      out.write("\t\t  <button type=\"button\" class=\"btn btn-lg btn-warning\">Cancelar</button>\n");
      out.write("\t\t  </div>\n");
      out.write("\t\t</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else log(t.getMessage(), t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
