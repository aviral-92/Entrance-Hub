package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.lang.String;
import java.sql.*;
import java.util.*;
import java.text.*;

public final class North_005fEng_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("<meta charset=\"UTF-8\" />\n");
      out.write("<meta name=\"keywords\" content=\"HTML5, Wordpress, Template, Design, Development\" />\n");
      out.write("<link rel=\"icon\" type=\"image/png\" href=\"favicon.ico\" />\n");
      out.write("<link rel=\"apple-touch-icon\" href=\"touch-icon.png\" />\n");
      out.write("<!--============================================= BEGIN STYLES ==-->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/config.css\" />\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/themes/40.css\" title=\"40.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/41.css\" title=\"41.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/42.css\" title=\"42.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/43.css\" title=\"43.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/44.css\" title=\"44.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/45.css\" title=\"45.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/46.css\" title=\"46.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/47.css\" title=\"47.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/48.css\" title=\"48.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/49.css\" title=\"49.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/50.css\" title=\"50.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/51.css\" title=\"51.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/52.css\" title=\"52.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/53.css\" title=\"53.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/54.css\" title=\"54.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/55.css\" title=\"55.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/56.css\" title=\"56.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/57.css\" title=\"57.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/58.css\" title=\"58.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/59.css\" title=\"59.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/60.css\" title=\"60.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/61.css\" title=\"61.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/62.css\" title=\"62.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/63.css\" title=\"63.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/64.css\" title=\"64.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/65.css\" title=\"65.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/66.css\" title=\"66.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/67.css\" title=\"67.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/68.css\" title=\"68.css\" />\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/69.css\" title=\"69.css\" />\n");
      out.write("    <script type=\"text/javascript\" src=\"js/styleswitcher.js\"></script>\n");
      out.write("\t<!--[if IE 7]> <link rel=\"stylesheet\" href=\"css/ie7.css\" /> <![endif]-->\n");
      out.write("\t<!--[if IE 8]> <link rel=\"stylesheet\" href=\"css/ie8.css\" /> <![endif]-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.js\"></script>\n");
      out.write("<!--JQuery Library-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.preloadify.js\"></script>\n");
      out.write("<!--Preloadify-->\n");
      out.write("<script type=\"text/javascript\" src=\"js/scripts-top.js\"></script>\n");
      out.write("<!--General scripts header-->\n");
      out.write("<!--[if IE]>\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/html5.js\"></script>\n");
      out.write("\t<style type=\"text/css\">.testimonial_arrow{display: none!important;}</style>\n");
      out.write("\t<![endif]-->\n");
      out.write("<title>Distance Home</title></head>\n");
      out.write("<body>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<section id=\"smk_container_full\">\n");
      out.write("  <section class=\"smk_container\">\n");
      out.write("    <section class=\"wrap\">\n");
      out.write("      <section class=\"top_head_separator\">\n");
      out.write("        <!--============================================================= BEGIN top blocks -->\n");
      out.write("        <section class=\"container_12\">\n");
      out.write("          <div class=\"grid_4 logo\"><a href=\"images/logo.png\"> &nbsp;&nbsp;<a href=\"#\"><a href=\"#\"><a href=\"images/logo.png\"></a><a href=\"images/logo.png\"></a><a href=\"images/logo.png\"><img src=\"images/logo.png\" alt=\"\" width=\"280\" height=\"150\" align=\"left\"></a></a></a></a></div>\n");
      out.write("          <div class=\"grid_8 top_mod_right\">\n");
      out.write("            <!--================== BEGIN main menu -->\n");
      out.write("            <nav id=\"horizontal\">\n");
      out.write("              <ul id=\"nav\" class=\"nav_simple\">\n");
      out.write("                <li><a href=\"index.jsp\">Home</a>\n");
      out.write("\n");
      out.write("                <li><a href=\"#\">distance university</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("                    <li><a href=\"blog-meta-before.html\">North Zone</a></li>\n");
      out.write("                    <li><a href=\"blog-meta-after.html\">South Zone</a></li>\n");
      out.write("                    <li><a href=\"blog-meta-iconsright.html\">East Zone</a></li>\n");
      out.write("                    <li><a href=\"blog-meta-iconsleft.html\">West Zone</a></li>\n");
      out.write("\t\t\t\t\t<li><a href=\"blog-meta-iconsleft.html\">Central Zone</a></li>\n");
      out.write("\n");
      out.write("                  </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </li>\n");
      out.write("\n");
      out.write("                <li><a href=\"#\">state open university</a></li>\n");
      out.write("                <li><a href=\"topinsititute.jsp\">top distance institutes</a></li>\n");
      out.write("              </ul>\n");
      out.write("              <!-- End of #nav-->\n");
      out.write("            </nav>\n");
      out.write("\n");
      out.write("          </div>\n");
      out.write("          <div class=\"clear\"></div>\n");
      out.write("        </section>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("      </section>\n");
      out.write("      <!-- End of .top_head_separator -->\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("      <!--/============================================================= END top blocks -->\n");
      out.write("      <!-- =============== HEADER [end] ================ -->\n");
      out.write("      <!--============================================================== BEGIN content [ .smk_content ] -->\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("      <div class=\"page_top_details clearfix\">\n");
      out.write("        <div class=\"page_title container_12\">\n");
      out.write("          <div class=\"grid_6\">\n");
      out.write("            <h1>Eng_Result Page DeMO </h1>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"grid_6\">\n");
      out.write("            <form method=\"get\" id=\"searchform\" action=\"#\">\n");
      out.write("              <input type=\"submit\" class=\"submit\" name=\"submit\" id=\"searchsubmit\" value=\"\" />\n");
      out.write("            </form>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <section id=\"smk_content\" class=\"smk_content\">\n");
      out.write("        <div class=\"container_12\">\n");
      out.write("          <!-- ===================================================== MAIN CONTENT[begin] -->\n");
      out.write("          <div class=\"grid_8\">\n");
      out.write("            <!-- ==== Blog article [begin] ==== -->\n");
      out.write("            <div class=\"blog_article blog_article_s1 clearfix\">\n");
      out.write("              <div align=\"justify\">\n");
      out.write("                <p>\n");
      out.write("                  <!-- Post slider -->\n");
      out.write("                </p>\n");
      out.write("                <!--Connectivity Code-->\n");
      out.write("\n");
      out.write("\n");
      out.write("<form method=\"post\" name=\"form\">\n");
      out.write("<table border=\"1\">\n");
      out.write("    <tr>\n");
      out.write("     <th>Name</th>\n");
      out.write("    <th>City</th>\n");
      out.write("    <th>State</th>\n");
      out.write("    <th>Zone</th>\n");
      out.write("    <th>URL</th>\n");
      out.write("    </tr>\n");

//Connection cn = null;
int sumcount=0;
Statement st;
try{
Class.forName("com.mysql.jdbc.Driver").newInstance();
Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/entrancehub", "root", "12345");
String sql="Select * from northcollegeuniversity where zone='North'";
st = cn.createStatement();
ResultSet rs = st.executeQuery(sql);

      out.write('\n');

while(rs.next()){

      out.write("\n");
      out.write("<tr><td>");
      out.print(rs.getString(2));
      out.write(" </td>\n");
      out.write("<td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("<td>");
      out.print(rs.getString(6));
      out.write("</td>\n");
      out.write("\n");
      out.write("\n");

          {
out.print("<td><a href=http://"+rs.getString(5)+">click here</a></tr>");
}

      out.write("\n");
      out.write("</tr>\n");

}

      out.write('\n');

}
catch(Exception e){
e.printStackTrace();
}

      out.write("\n");
      out.write("</table>\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("</tr>\n");
      out.write("</table>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;</p>\n");
      out.write("                <p>&nbsp;  </p>\n");
      out.write("              </div>\n");
      out.write("              <div align=\"justify\">\n");
      out.write("                <!-- Post content-->\n");
      out.write("              </div>\n");
      out.write("              <!-- Post read more... -->\n");
      out.write("<div>\n");
      out.write("                <div class=\"blog_post_category\"></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- ==== Blog article [end] ==== -->\n");
      out.write("            <!-- ==== Blog article [begin] ==== -->\n");
      out.write("            <!-- ==== Blog article [end] ==== -->\n");
      out.write("            <!-- ==== Blog article [begin] ==== -->\n");
      out.write("\n");
      out.write("            <!-- ==== Pagination [end] ==== -->\n");
      out.write("          </div>\n");
      out.write("          <!--END .grid_8-->\n");
      out.write("          <!-- === Sidebar[begin] === -->\n");
      out.write("          <div class=\"sidebar grid_4\">\n");
      out.write("            <!-- ==== WIDGET [begin] ==== -->\n");
      out.write("            <aside class=\"widget widget_categories\">\n");
      out.write("              <h3 class=\"widget-title\">Top 10's Open university in India</h3>\n");
      out.write("              <ul>\n");
      out.write("\n");
      out.write("                <li class=\"current-menu-item\"><a href=\"#\">Indira Gandhi National Open University</a></li>\n");
      out.write("                <li><a href=\"#\">Annamalai University</a></li>\n");
      out.write("                <li><a href=\"#\">Osmania University</a></li>\n");
      out.write("                <li><a href=\"#\">Sikkim Manipal University</a></li>\n");
      out.write("                <li><a href=\"#\">Panjab Technical University</a></li>\n");
      out.write("                <li><a href=\"#\">Symbiosis Center for Distance Learning</a></li>\n");
      out.write("                <li><a href=\"#\">University of Madras</a></li>\n");
      out.write("                <li><a href=\"#\">Mahatma Gandhi University</a></li>\n");
      out.write("\t\t\t\t<li><a href=\"#\">Karnataka State Open University</a></li>\n");
      out.write("                <li><a href=\"#\">Nalanda Open University</a></li>\n");
      out.write("              </ul>\n");
      out.write("            </aside>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <!-- ==== WIDGET [end] ==== -->\n");
      out.write("            <!-- ==== WIDGET [begin] ==== -->\n");
      out.write("            <aside class=\"widget\">\n");
      out.write("\n");
      out.write("              <h3 class=\"widget-title\">updated admissions forms </h3>\n");
      out.write("              <div class=\"recent_comments\">\n");
      out.write("                <div class=\"post_comm\"> <a href=\"#\"></a>\n");
      out.write("                  <p><a href=\"#\"><strong>PTU entrance form</strong>:</a> Stranguillio cum unde non coepit cenam veniebant est in fuerat est Apollonius mihi esse more defuncta ait...</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <div class=\"post_comm\"> <a href=\"#\"></a>\n");
      out.write("                  <p><a href=\"#\"><strong>MDU entrance form</strong>:</a> In lucem exempli paupers coniunx in fuerat. Toro frumento manu duas recitare...</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <div class=\"post_comm\"> <a href=\"#\"></a>\n");
      out.write("                  <p><a href=\"#\"><strong>Delhi university</strong>:</a> Tharsia adulescens longum deposita ad te in. Neptunalia festinare decenter ortam adipiscing enixa...</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"clear\"></div>\n");
      out.write("            </aside>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <!-- ==== WIDGET [end] ==== -->\n");
      out.write("            <!-- ==== WIDGET [begin] ==== -->\n");
      out.write("            <aside class=\"widget widget_latest_posts\">\n");
      out.write("              <h3 class=\"widget-title\">Latest news</h3>\n");
      out.write("              <marquee direction=\"up\" >\n");
      out.write("\t\t\t  <ul>\n");
      out.write("                <li> <a href=\"#\"><img src=\"images/images (2).jpg\" alt=\"\" width=\"90\" height=\"95\" /></a> <a href=\"#\">AIEEE result will be out on 12 April 2014. .</a> <br />\n");
      out.write("\n");
      out.write("                  <div class=\"clear\"></div>\n");
      out.write("                </li>\n");
      out.write("                <li> <a href=\"#\"><img src=\"images/qw.png\" alt=\"\" width=\"90\" height=\"95\" /></a> <a href=\"#\">Delhi univesity forms are out and they providing scholorship of above 90% in PCM </a> <br />\n");
      out.write("\n");
      out.write("                  <div class=\"clear\"></div>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\"><img src=\"images/iit-jee.png\" width=\"90\" height=\"95\" longdesc=\"../../../Desktop/New folder/iit.png\"></a><a href=\"#\">IIT counselling starts from 24 april 2014.</a> <br />\n");
      out.write("                  </marquee>\n");
      out.write("                  <div class=\"clear\"></div>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("              <div class=\"clear\"></div>\n");
      out.write("            </aside>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <!-- ==== WIDGET [end] ==== -->\n");
      out.write("            <!-- ==== WIDGET [begin] ==== -->\n");
      out.write("            <aside class=\"widget widget_twitter\">\n");
      out.write("              <form name=\"form1\" method=\"post\" action=\"\">\n");
      out.write("                <label>\n");
      out.write("                <div align=\"center\"></div>\n");
      out.write("                </label>\n");
      out.write("                <p align=\"center\">&nbsp;</p>\n");
      out.write("                <p align=\"center\">\n");
      out.write("                  <label></label>\n");
      out.write("                </p>\n");
      out.write("              </form>\n");
      out.write("              <div align=\"center\"><div align=\"left\"><p class=\"widget-title\">&nbsp;</p>\n");
      out.write("              </div>\n");
      out.write("              </div></aside>\n");
      out.write("            <div align=\"center\"><div align=\"left\"><!-- ==== WIDGET [end] ==== -->\n");
      out.write("            <!-- ==== WIDGET [begin] ==== -->\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <!-- ==== WIDGET [end] ==== -->\n");
      out.write("          </div></div></div>\n");
      out.write("          <div align=\"center\"><div align=\"left\"><!-- === Sidebar[end] === -->\n");
      out.write("          <!-- ===================================================== MAIN CONTENT[end] -->\n");
      out.write("        </div></div></div>\n");
      out.write("        <div align=\"center\"><div align=\"left\"><!-- END .container_12 -->\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("      </div></div></section>\n");
      out.write("      <div align=\"center\"><div align=\"left\"><!-- END of .smk_content -->\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("      <!--/============================================================= END content [ .smk_content ] -->\n");
      out.write("      <!-- =============== FOOTER [begin] ================ -->\n");
      out.write("    </div></div></section>\n");
      out.write("    <div align=\"center\"><div align=\"left\"><div class=\"clear\"></div>\n");
      out.write("    <section id=\"site_footer_second\">\n");
      out.write("      <section class=\"container_12 site_footer_inner\">\n");
      out.write("        <div class=\"grid_6 site_copyright\"> <a class=\"go_to_top scroll_top_infooter\" href=\"#\" onClick=\"return false\">top</a>   <a href=\"#\">Developer Team</a> </div>\n");
      out.write("        <div class=\"grid_6 footer2_right footer_social\"> <a href=\"#\" class=\"facebook\"></a> <a href=\"#\" class=\"twitter\"></a> <a href=\"#\" class=\"pinterest\"></a> <a href=\"#\" class=\"vimeo\"></a> <a href=\"#\" class=\"youtube\"></a> <a href=\"#\" class=\"digg\"></a> </div>\n");
      out.write("        <div class=\"clear\"></div>\n");
      out.write("      </section>\n");
      out.write("      <div class=\"clear\"></div>\n");
      out.write("    </section>\n");
      out.write("    <div class=\"clear\"></div>\n");
      out.write("  </div></div></section>\n");
      out.write("</section>\n");
      out.write("<div align=\"center\"><div align=\"left\"><script type=\"text/javascript\" src=\"js/iview.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/raphael-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/jquery.plugins-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/gmap3.min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/gmap.init.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/smk-framework-min.js\"></script>\n");
      out.write("<script type=\"text/javascript\" src=\"js/scripts-bottom-min.js\"></script>\n");
      out.write("</div></div>\n");
      out.write("</body>\n");
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
