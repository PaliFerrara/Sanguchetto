package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AltaIngrediente_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta charset=\"utf-8\">\r\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\t<title>Bootstrap Test</title>\r\n");
      out.write("\t<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("\t<script src=\"js/jquery-1.11.3.min.js\"></script>\r\n");
      out.write("\t<!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script><!-- Bootstrap -->\r\n");
      out.write("\t<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div class=\"container theme-showcase\" role=\"main\">\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Main jumbotron for a primary marketing message or call to action -->\r\n");
      out.write("\t\t<div class=\"jumbotron\">\r\n");
      out.write("\t\t\t<h1>Nuevo Ingrediente/Condimento</h1>\r\n");
      out.write("\t\t\t<span><a class=\"btn btn-primary btn-lg\" href=\"AltaIngrediente\" role=\"button\">Nuevo Ingrediente</a>\r\n");
      out.write(" \t\t\t<a class=\"btn btn-primary btn-lg\" href=\"MostrarStock\" role=\"button\">Mostrar Stock</a>\r\n");
      out.write(" \t\t\t<a class=\"btn btn-primary btn-lg\" href=\"AgregarStock\" role=\"button\">Agregar Stock</a>\r\n");
      out.write(" \t\t\t<a class=\"btn btn-primary btn-lg\" href=\"EliminarStock\" role=\"button\">Eliminar Stock</a></span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t<div class=\"page-header\">\r\n");
      out.write("\t\t\t<h1>Dar de Alta un nuevo Ingrediente</h1>\r\n");
      out.write("\t\t\t<form class=\"form-horizontal\">\r\n");
      out.write("\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t \t\t\t <label for=\"nombreIngrediente\" class=\"col-sm-2 control-label\">Nombre</label>\r\n");
      out.write("\t \t\t\t <div class=\"col-sm-10\">\r\n");
      out.write("\t \t\t\t \t<input type=\"text\" class=\"form-control\" id=\"nombreIngrediente\"/>\r\n");
      out.write("\t \t\t\t </div>\r\n");
      out.write("\t \t\t  </div>\r\n");
      out.write("\t \t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t   \t <label for=\"precioIngrediente\" class=\"col-sm-2 control-label\">Precio</label>\r\n");
      out.write("\t\t\t    <div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t      <input type=\"text\" class=\"form-control\" id=\"precioIngrediente\" />\r\n");
      out.write("\t\t\t    </div>\r\n");
      out.write("\t\t\t   </div>\r\n");
      out.write("\t\t\t   <div class=\"form-group\">\r\n");
      out.write("\t\t\t   \t <label for=\"tipoIngrediente\" class=\"col-sm-2 control-label\">Tipo</label>\r\n");
      out.write("\t\t\t\t    <div class=\"col-sm-10\">\r\n");
      out.write("\t\t\t\t\t<div class=\"radio\">\r\n");
      out.write("\t\t\t\t  \t\t<label><input type=\"radio\" name=\"optradio\">Ingrediente</label>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"radio\">\r\n");
      out.write("\t\t\t\t\t  <label><input type=\"radio\" name=\"optradio\">Condimento</label>\r\n");
      out.write("\t\t\t\t\t</div>\t\t\t  \r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t </form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
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
