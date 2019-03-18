package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DecimalFormat;

public final class amortizacao_002dconstante_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jspf/menu.jspf");
  }

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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <title>Amortização Constante</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            div#form-sac{\n");
      out.write("                position: absolute;\n");
      out.write("                width: 300px;\n");
      out.write("                height: 400px;\n");
      out.write("                border: solid 0px;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                box-shadow: 1px 1px 15px black;\n");
      out.write("                left: 200px;\n");
      out.write("                padding: 50px;\n");
      out.write("                top: 180px;\n");
      out.write("            }\n");
      out.write("            div#form-sac:hover{\n");
      out.write("                background-color: rgb(219, 219, 219);\n");
      out.write("            }\n");
      out.write("            input{\n");
      out.write("                margin: 10px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("            input#botao{\n");
      out.write("                position: absolute;\n");
      out.write("                left: 50px;\n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                font-size: 18px;\n");
      out.write("                position: absolute;\n");
      out.write("                top: 30px;\n");
      out.write("                margin-bottom: 30px;\n");
      out.write("            }\n");
      out.write("            div#campos{\n");
      out.write("                position: absolute;\n");
      out.write("                top: 100px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!Doctype html>\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Amortização</title>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\"\n");
      out.write("              crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            div#menu {\n");
      out.write("                position: absolute;\n");
      out.write("                top: 70px;\n");
      out.write("                left: 420px;\n");
      out.write("                padding: 15px;\n");
      out.write("            }\n");
      out.write("            div#fundo-menu{\n");
      out.write("                width: 1100px;\n");
      out.write("                height: 100px;\n");
      out.write("                background-color: rgb(219, 219, 219);\n");
      out.write("                position: absolute;\n");
      out.write("                top: 50px;\n");
      out.write("                left: 130px;\n");
      out.write("                border: solid 0px;\n");
      out.write("                border-radius: 50px;\n");
      out.write("                box-shadow: 1px 1px 15px black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("        <div id=\"fundo-menu\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div id=\"menu\">\n");
      out.write("            <input type=\"submit\" value=\"Home\" name=\"menu-home\" class=\"btn btn-primary\" onclick=\"location.href = 'home.jsp'\">\n");
      out.write("            <input type=\"submit\" value=\"Amortização Constante\" name=\"menu-sac\" class=\"btn btn-primary\" onclick=\"location.href = 'amortizacao-constante.jsp'\">\n");
      out.write("            <input type=\"submit\" value=\"Amortização Americana\" name=\"menu-americana\" class=\"btn btn-primary\" onclick=\"location.href = 'amortizacao-americana.jsp'\">\n");
      out.write("            <input type=\"submit\" value=\"Price\" name=\"menu-price\" class=\"btn btn-primary\" onclick=\"location.href = 'tabela-price.jsp'\">\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <!-- JavaScript (Opcional) -->\n");
      out.write("            <!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"form-sac\">\n");
      out.write("            <p><b>Amortização Constante</b></p>\n");
      out.write("            <div id=\"campos\">\n");
      out.write("                <form>\n");
      out.write("                    <input type=\"number\" name=\"divida\" placeholder=\"Dívida\" required><br><br>\n");
      out.write("                    <input type=\"number\" name=\"meses\" placeholder=\"Meses\" required><br><br>\n");
      out.write("                    <input type=\"number\" name=\"juros\" placeholder=\"Juros(%)\" required><br><br>\n");
      out.write("                    <input type=\"submit\" name=\"calcular\" class=\"btn btn-primary\" value=\"Calcular\" id=\"botao\">\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        ");
if (request.getParameter("calcular") != null) {
      out.write("\n");
      out.write("        ");
try {
      out.write("\n");
      out.write("        ");
double divida = Double.parseDouble(request.getParameter("divida"));
      out.write("\n");
      out.write("        ");
int meses = Integer.parseInt(request.getParameter("meses"));
      out.write("\n");
      out.write("        ");
double taxa = Integer.parseInt(request.getParameter("juros"));
      out.write("\n");
      out.write("        <br><br>\n");
      out.write("        ");
double amortizacao = divida / meses;
      out.write("\n");
      out.write("        ");
double juros;
      out.write("\n");
      out.write("        ");
double parcela;
      out.write("\n");
      out.write("        ");
taxa = taxa / 100;
      out.write("\n");
      out.write("        ");
DecimalFormat df = new DecimalFormat("#,##0.00");
      out.write("\n");
      out.write("        <table style=\"position: absolute; top: 190px; left: 700px; margin-bottom: 50px; box-shadow: 1px 1px 5px black; \" border = \"1\">\n");
      out.write("            <tr><th>Mês</th><th>Parcela</th><th>Juros</th><th>Amortização</th><th>Dívida</th></tr>    \n");
      out.write("            ");
for (int i = 0; i <= meses; i++) {
      out.write("\n");
      out.write("                ");
if( i == 0){
      out.write("\n");
      out.write("                    <th> ");
      out.print(i);
      out.write(" </th>\n");
      out.write("                    <td></td>                       \n");
      out.write("                    <td></td>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td> ");
      out.print(divida);
      out.write(" </td>\n");
      out.write("                ");
};
      out.write("\n");
      out.write("                \n");
      out.write("                ");
if(i > 0){
      out.write("\n");
      out.write("                ");
juros = taxa * divida;
      out.write("\n");
      out.write("                ");
parcela = juros + amortizacao;
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th> ");
      out.print(i);
      out.write(" </th>\n");
      out.write("                    <td> ");
      out.print(df.format(parcela));
      out.write(" </td>                       \n");
      out.write("                    <td> ");
      out.print(df.format(juros));
      out.write(" </td>\n");
      out.write("                    <td> ");
      out.print(df.format(amortizacao));
      out.write(" </td>\n");
      out.write("                    ");
divida = divida - amortizacao;
      out.write("\n");
      out.write("                    <td> ");
      out.print(df.format(divida));
      out.write(" </td>\n");
      out.write("                </tr>\n");
      out.write("                ");
};
      out.write("\n");
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("        ");
} catch (Exception ex) {
      out.write("\n");
      out.write("        <h3 style = \"color: red\">Erro: ");
      out.print(ex.getMessage());
      out.write("</h3>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("            <!-- JavaScript (Opcional) -->\n");
      out.write("            <!-- jQuery primeiro, depois Popper.js, depois Bootstrap JS -->\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("            crossorigin=\"anonymous\"></script>\n");
      out.write("        </footer>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
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
