/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.17
 * Generated at: 2022-09-22 20:02:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Guia_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1663876895275L));
    _jspx_dependants.put("jar:file:/C:/Users/Carlo/OneDrive/Escritorio/Aplicacion_Web/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/lp2_2022_Proyecto/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1652387232000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;


	if(request.getSession().getAttribute("LISTA")==null)
		response.sendRedirect("login.jsp");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\r\n");
      out.write("<link href=\"https://cdn.datatables.net/1.11.5/css/dataTables.bootstrap5.min.css\" rel=\"stylesheet\">??\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/stylePages.css\">\r\n");
      out.write("<style>\r\n");
      out.write("\tbody{\r\n");
      out.write("\t\tbackground-image:url(\"https://quiasma.com.mx/wp-content/uploads/2017/03/fondo-blanco.jpg\");\r\n");
      out.write("\t\tbackground-repeat: no-repeat;\r\n");
      out.write("\t\tbackground-attachment: fixed;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.bg{\r\n");
      out.write("\t\tbackground-position:center center;\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.modal-header{\r\n");
      out.write("\t\tcolor:#fff;\r\n");
      out.write("\t\tbackground: black;\r\n");
      out.write("\t\tdisplay: flex;\r\n");
      out.write("  \t\tjustify-content: center;  \t\t\r\n");
      out.write("  \t\t\r\n");
      out.write("\t}\r\n");
      out.write("\t.help-block {\r\n");
      out.write("\t  \t\tcolor: red;\r\n");
      out.write("\t}\r\n");
      out.write("\t.form-group.has-error .form-control-label {\r\n");
      out.write("\t  color: red;\r\n");
      out.write("\t}\r\n");
      out.write("\t.form-group.has-error .form-control {\r\n");
      out.write("\t  border: 1px solid red;\r\n");
      out.write("\t  box-shadow: 0 0 0 0.2rem rgba(250, 16, 0, 0.18);\r\n");
      out.write("\t}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "partialMenu.jsp", out, false);
      out.write("\r\n");
      out.write("\t<div class=\"container home\">\r\n");
      out.write("\r\n");
      out.write("\t\t<h1 class=\"text-center mt-5\">Listado de Guia</h1>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t<!-- Button trigger modal -->\r\n");
      out.write("\t\t<button type=\"button\" class=\"btn btn-dark\" data-bs-toggle=\"modal\" data-bs-target=\"#staticBackdrop\">\r\n");
      out.write("\t\t  Registrar\r\n");
      out.write("\t\t</button>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t<!-- Modal -->\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"staticBackdrop\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t  <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t        <h5 class=\"modal-title\" id=\"staticBackdropLabel\">GUIA</h5>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t      <div class=\"modal-body\">\t\t        \r\n");
      out.write("\t\t        <form id=\"idRegistrar\" method=\"post\" action=\"ServletGuia?tipo=REGISTRAR\">\r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <label for=\"exampleInputEmail1\" class=\"form-label\">C??digo</label>\r\n");
      out.write("\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"codigo\" id=\"idCodigo\" readonly value=\"0\">\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <label for=\"exampleInputEmail1\" class=\"form-label\">Proveedor</label>\r\n");
      out.write("\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"nombre\" id=\"idNombre\">\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <label for=\"exampleInputPassword1\" class=\"form-label\">Fecha Compra</label>\r\n");
      out.write("\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"fecha\" id=\"idFecha\">\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <label for=\"exampleInputPassword1\" class=\"form-label\">Descripcion</label>\r\n");
      out.write("\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"descripcion\" id=\"idDescripcion\">\r\n");
      out.write("\t\t\t\t  </div>\t\t\t\r\n");
      out.write("\t\t\t\t  \t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <label for=\"exampleInputPassword1\" class=\"form-label\">Cantidad</label>\r\n");
      out.write("\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"cantidad\" id=\"idCantidad\">\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"form-group\">\r\n");
      out.write("\t\t\t\t    <label for=\"exampleInputPassword1\" class=\"form-label\">Precio</label>\r\n");
      out.write("\t\t\t\t    <input type=\"text\" class=\"form-control\" name=\"precio\" id=\"idPrecio\">\r\n");
      out.write("\t\t\t\t  </div>\t\r\n");
      out.write("\t\t\t\t  \t\t  \t\t\t\t  \t\t\t\t  \r\n");
      out.write("\t\t\t\t  <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t  \t<button type=\"submit\" class=\"btn btn-success\">Grabar</button>\r\n");
      out.write("\t\t\t        <button type=\"button\" class=\"btn btn-danger\" data-bs-dismiss=\"modal\">Cerrar</button>\r\n");
      out.write("\t\t\t      </div>\t\t\t\t  \r\n");
      out.write("\t\t\t\t</form>\t\t       \t\t        \t\t        \r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<!-- modal para eliminar -->\r\n");
      out.write("\t\t<div class=\"modal fade\" id=\"modalEliminar\" data-bs-backdrop=\"static\" data-bs-keyboard=\"false\" tabindex=\"-1\" aria-labelledby=\"staticBackdropLabel\" aria-hidden=\"true\">\r\n");
      out.write("\t\t  <div class=\"modal-dialog modal-dialog-centered\">\r\n");
      out.write("\t\t    <div class=\"modal-content\">\r\n");
      out.write("\t\t      <div class=\"modal-header\">\r\n");
      out.write("\t\t        <h5 class=\"modal-title\" id=\"staticBackdropLabel\">Sistema</h5>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t      <div class=\"modal-body\">\r\n");
      out.write("\t\t        <form id=\"idRegistrar\" method=\"post\" action=\"ServletGuia?tipo=ELIMINAR\">\r\n");
      out.write("\t\t\t\t    <input type=\"hidden\" class=\"form-control\" name=\"codigoEliminar\" id=\"codigoEliminar\">\r\n");
      out.write("\t\t\t\t  <h4>Seguro de eliminar?</h4>\r\n");
      out.write("\t\t\t\t  <div class=\"modal-footer\">\r\n");
      out.write("\t\t\t\t  \t<button type=\"submit\" class=\"btn btn-primary\">SI</button>\r\n");
      out.write("\t\t\t        <button type=\"button\" class=\"btn btn-secondary\" data-bs-dismiss=\"modal\">NO</button>\r\n");
      out.write("\t\t\t      </div>\t\t\t  \r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t      </div>\r\n");
      out.write("\t\t    </div>\r\n");
      out.write("\t\t  </div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div class=\"mt-4\">\r\n");
      out.write("\t\t\t<table id=\"example\" class=\"table table-striped\" style=\"width:100%\">\r\n");
      out.write("\t\t        <thead>\r\n");
      out.write("\t\t            <tr>\r\n");
      out.write("\t\t                <th>C??DIGO</th>\r\n");
      out.write("\t\t                <th>PROVEEDOR</th>\r\n");
      out.write("\t\t                <th>FECHA COMPRA</th>\r\n");
      out.write("\t\t                <th>DESCRIPCION</th>\r\n");
      out.write("\t\t                <th>CANTIDAD</th>\r\n");
      out.write("\t\t                <th>PRECIO</th>\r\n");
      out.write("\t\t                <th></th>\r\n");
      out.write("\t\t                <th></th>\r\n");
      out.write("\t\t            </tr>\r\n");
      out.write("\t\t        </thead>\r\n");
      out.write("\t\t        <tbody>\r\n");
      out.write("\t\t        \t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("    \r\n");
      out.write("\t\t\t\t            \r\n");
      out.write("\t\t        </tbody>\r\n");
      out.write("\t\t    </table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.5.1.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://cdn.datatables.net/1.11.5/js/jquery.dataTables.min.js\"></script>\r\n");
      out.write("<script src=\"https://cdn.datatables.net/1.11.5/js/dataTables.bootstrap5.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<!-- JS para validaci??n-->\r\n");
      out.write("<script src=\"https://cdn.bootcdn.net/ajax/libs/bootstrap-validator/0.4.0/js/bootstrapValidator.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t    $('#example').DataTable();\r\n");
      out.write("\t} );\r\n");
      out.write("\t\r\n");
      out.write("\t//aisgnar evento click a todos los botones con nombre de clase \"btn-danger\"\r\n");
      out.write("\t$(document).on(\"click\",\".btn-danger\",function(){\r\n");
      out.write("\t\t//variable\r\n");
      out.write("\t\tlet cod;\r\n");
      out.write("\t\t//obtener el c??digo del docente seg??n el bot??n eliminar que se a pulsado\r\n");
      out.write("\t\tcod=$(this).parents(\"tr\").find(\"td\")[0].innerHTML;\r\n");
      out.write("\t\t//asignar a la caja con id \"codigoEliminar\" el valor de la variable \"cod\"\r\n");
      out.write("\t\t$(\"#codigoEliminar\").val(cod);\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\r\n");
      out.write("\t//aisgnar evento click a todos los botones con nombre de clase \"btn-success\"\r\n");
      out.write("\t$(document).on(\"click\",\".btn-success\",function(){\r\n");
      out.write("\t\t//variables\r\n");
      out.write("\t\tlet cod,nomprovee,fechacompra,descrip,cant,precio;\r\n");
      out.write("\t\t//obtener los datos de todas las columnas seg??n el bot??n editar que se a pulsado\r\n");
      out.write("\t\tcod=$(this).parents(\"tr\").find(\"td\")[0].innerHTML;\r\n");
      out.write("\t\tnomprovee=$(this).parents(\"tr\").find(\"td\")[1].innerHTML;\r\n");
      out.write("\t\tfechacompra=$(this).parents(\"tr\").find(\"td\")[2].innerHTML;\r\n");
      out.write("\t\tdescrip=$(this).parents(\"tr\").find(\"td\")[3].innerHTML;\r\n");
      out.write("\t\tcant=$(this).parents(\"tr\").find(\"td\")[4].innerHTML;\r\n");
      out.write("\t\tprecio=$(this).parents(\"tr\").find(\"td\")[5].innerHTML;\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.get(\"ServletGuiaJSON?codigo=\"+cod,function(response){\r\n");
      out.write("\t\t\t//console.log(response);\r\n");
      out.write("\t\t\t//asignar a los controles las claves del par??metro response\r\n");
      out.write("\t\t\t$(\"#idCodigo\").val(cod);\r\n");
      out.write("\t\t\t$(\"#idNombre\").val(response.nom_provee);\r\n");
      out.write("\t\t\t$(\"#idFecha\").val(response.fecha_compra);\r\n");
      out.write("\t\t\t$(\"#idDescripcion\").val(response.descripcionguiacompra);\r\n");
      out.write("\t\t\t$(\"#idCantidad\").val(response.cantidadguiacompra);\r\n");
      out.write("\t\t\t$(\"#idPrecio\").val(response.precioguiacompra);\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t})\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t})\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("</script>\r\n");
      out.write("<script type=\"text/javascript\">    \r\n");
      out.write("    $(document).ready(function(){     \r\n");
      out.write("        $('#idRegistrar').bootstrapValidator({\r\n");
      out.write("        \t fields:{\r\n");
      out.write("        \t\t     nombre:{\r\n");
      out.write("        \t\t \t\tvalidators:{\r\n");
      out.write("        \t\t \t\t\tnotEmpty:{\r\n");
      out.write("        \t\t \t\t\t\tmessage:'Campo proveedor es obligatorio'\r\n");
      out.write("        \t\t \t\t\t},\r\n");
      out.write("        \t\t \t\t\tregexp:{\r\n");
      out.write("        \t\t \t\t\t\tregexp:/^[a-zA-Z\\??\\??\\s\\??\\??\\??\\??\\??\\??\\??\\??\\??\\??]{4,20}$/,\r\n");
      out.write("        \t\t \t\t\t\tmessage:'Campo proveedor MIN:4 - MAX:20'\r\n");
      out.write("        \t\t \t\t\t}\r\n");
      out.write("        \t\t \t\t}\r\n");
      out.write("        \t\t \t},\r\n");
      out.write("        \t\t \t\r\n");
      out.write("        \t\t fecha:{\r\n");
      out.write("        \t\t \t\tvalidators:{\r\n");
      out.write("        \t\t \t\t\tnotEmpty:{\r\n");
      out.write("        \t\t \t\t\t\tmessage:'Campo fecha es obligatorio'\r\n");
      out.write("        \t\t \t\t\t},\r\n");
      out.write("        \t\t \t\t\tregexp:{\r\n");
      out.write("        \t\t \t\t\t\tregexp:/^([0-9]{4})-([0-9]{1,2})-([0-9]{1,2})$/,\r\n");
      out.write("        \t\t \t\t\t\tmessage:'Campo fecha es obligatorio yyyy-mm-dd'\r\n");
      out.write("        \t\t \t\t\t}\r\n");
      out.write("        \t\t \t\t\t\r\n");
      out.write("        \t\t \t\t}\r\n");
      out.write("        \t\t \t},\r\n");
      out.write("        \t\t \t\r\n");
      out.write("        \t\t \tdescripcion:{\r\n");
      out.write("        \t\t \t\tvalidators:{\r\n");
      out.write("        \t\t \t\t\tnotEmpty:{\r\n");
      out.write("        \t\t \t\t\t\tmessage:'Campo descripci??n es obligatorio'\r\n");
      out.write("        \t\t \t\t\t},\r\n");
      out.write("        \t\t \t\t\tregexp:{\r\n");
      out.write("        \t\t \t\t\t\tregexp:/^[a-zA-Z\\??\\??\\s\\??\\??\\??\\??\\??\\??\\??\\??\\??\\??]{4,20}$/,\r\n");
      out.write("        \t\t \t\t\t\tmessage:'Campo descripci??n solo letras MIN:4 - MAX:20'\r\n");
      out.write("        \t\t \t\t\t}\r\n");
      out.write("        \t\t \t\t}\r\n");
      out.write("        \t\t \t},\r\n");
      out.write("        \t\t \t\r\n");
      out.write("        \t\t \tcantidad:{\r\n");
      out.write("        \t\t \t\tvalidators:{\r\n");
      out.write("        \t\t \t\t\tnotEmpty:{\r\n");
      out.write("        \t\t \t\t\t\tmessage:'Campo cantidad es obligatorio'\r\n");
      out.write("        \t\t \t\t\t},\r\n");
      out.write("        \t\t \t\t\tregexp:{\r\n");
      out.write("        \t\t \t\t\t\tregexp:/^\\d+$/,\r\n");
      out.write("        \t\t \t\t\t\tmessage:'Campo cantidad debe ser #entero positivo'\r\n");
      out.write("        \t\t \t\t\t}\r\n");
      out.write("        \t\t \t\t}\r\n");
      out.write("        \t\t \t},\r\n");
      out.write("        \t\t \t\r\n");
      out.write("        \t\t \tprecio:{\r\n");
      out.write("        \t\t \t\tvalidators:{\r\n");
      out.write("        \t\t \t\t\tnotEmpty:{\r\n");
      out.write("        \t\t \t\t\t\tmessage:'Campo precio es obligatorio'\r\n");
      out.write("        \t\t \t\t\t},\r\n");
      out.write("        \t\t \t\t\tregexp:{\r\n");
      out.write("        \t\t \t\t\t\tregexp:/^\\d+$/,\r\n");
      out.write("        \t\t \t\t\t\tmessage:'Campo precio debe ser numerico'\r\n");
      out.write("        \t\t \t\t\t}\r\n");
      out.write("        \t\t \t\t}\r\n");
      out.write("        \t\t \t}\r\n");
      out.write("        \t\t \t\r\n");
      out.write("        \t }\r\n");
      out.write("        });   \t\t\t\r\n");
      out.write("    });    \r\n");
      out.write("</script> \r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /Guia.jsp(53,3) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.MENSAJE!=null}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<div class=\"alert alert-warning alert-dismissible fade show\" role=\"alert\">\r\n");
          out.write("\t\t\t\t  <strong>MENSAJE : </strong> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.MENSAJE}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" \r\n");
          out.write("\t\t\t\t  <button type=\"button\" class=\"btn-close\" data-bs-dismiss=\"alert\" aria-label=\"Close\"></button>\r\n");
          out.write("\t\t\t\t</div>\r\n");
          out.write("\t\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /Guia.jsp(149,12) name = items type = java.lang.Object reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.listarGuia}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      // /Guia.jsp(149,12) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("row");
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("\t\t\t\t            <tr>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.codigoguiacompra}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.nom_provee}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.fecha_compra}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.descripcionguiacompra}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.cantidadguiacompra}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${row.precioguiacompra}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("\t\t\t\t                <td><button type=\"button\" class=\"btn btn-success\" \r\n");
            out.write("\t\t\t\t                \t\t\tdata-bs-toggle=\"modal\" data-bs-target=\"#staticBackdrop\">Editar</button></td>\r\n");
            out.write("\t\t\t\t                <td><button type=\"button\" class=\"btn btn-danger\" \r\n");
            out.write("\t\t\t\t                \t\t\tdata-bs-toggle=\"modal\" data-bs-target=\"#modalEliminar\">Eliminar</button></td>\r\n");
            out.write("\t\t\t\t            </tr>\r\n");
            out.write("\t\t\t\t        ");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
