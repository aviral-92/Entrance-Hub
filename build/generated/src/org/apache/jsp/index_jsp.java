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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\r\n");
      out.write("\t<meta charset=\"UTF-8\" />\r\n");
      out.write("\t<meta name=\"description\" content=\"Template designed by Smartik\" />\r\n");
      out.write("\t<meta name=\"keywords\" content=\"HTML5, Wordpress, Template, Design, Development\" />\r\n");
      out.write("\t<link rel=\"icon\" type=\"image/png\" href=\"images/favicon.ico\" />\r\n");
      out.write("\t<link rel=\"apple-touch-icon\" href=\"images/touch-icon.png\" />\r\n");
      out.write("\t\t\r\n");
      out.write("\t<!--============================================= BEGIN STYLES ==-->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/config.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/themes/40.css\" title=\"40.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/41.css\" title=\"41.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/42.css\" title=\"42.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/43.css\" title=\"43.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/44.css\" title=\"44.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/45.css\" title=\"45.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/46.css\" title=\"46.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/47.css\" title=\"47.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/48.css\" title=\"48.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/49.css\" title=\"49.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/50.css\" title=\"50.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/51.css\" title=\"51.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/52.css\" title=\"52.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/53.css\" title=\"53.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/54.css\" title=\"54.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/55.css\" title=\"55.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/56.css\" title=\"56.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/57.css\" title=\"57.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/58.css\" title=\"58.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/59.css\" title=\"59.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/60.css\" title=\"60.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/61.css\" title=\"61.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/62.css\" title=\"62.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/63.css\" title=\"63.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/64.css\" title=\"64.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/65.css\" title=\"65.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/66.css\" title=\"66.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/67.css\" title=\"67.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/68.css\" title=\"68.css\" />\r\n");
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/69.css\" title=\"69.css\" />    \r\n");
      out.write("    <script type=\"text/javascript\" src=\"js/styleswitcher.js\"></script>\t\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t<!--============================================= BEGIN SCRIPTS ==-->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.js\"></script><!--JQuery Library-->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/jquery.preloadify.js\"></script><!--Preloadify-->\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/scripts-top.js\"></script><!--General scripts header-->\r\n");
      out.write("\t\r\n");
      out.write("\t<!--[if IE]>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"js/html5.js\"></script>\r\n");
      out.write("\t<style type=\"text/css\">.testimonial_arrow{display: none!important;}</style>\r\n");
      out.write("\t<![endif]-->\r\n");
      out.write("\t\r\n");
      out.write("\t<title>Entrance Hub</title>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("<!--\r\n");
      out.write(".style2 {font-size: 16px}\r\n");
      out.write("body,td,th {\r\n");
      out.write("\tfont-family: Helvetica,Arial,Times New Roman,Times,serif;\r\n");
      out.write("\tfont-size: 10px;\r\n");
      out.write("}\r\n");
      out.write("body {\r\n");
      out.write("\tbackground-color: #F0F0F0;\r\n");
      out.write("}\r\n");
      out.write(".style5 {\r\n");
      out.write("\tfont-size: 24px;\r\n");
      out.write("\tfont-weight: bold;\r\n");
      out.write("\tcolor: #FF0000;\r\n");
      out.write("}\r\n");
      out.write("-->\r\n");
      out.write("    </style>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\"></head>\r\n");
      out.write("<body>\r\n");
      out.write("<section id=\"smk_container_full\">\r\n");
      out.write("<section class=\"smk_container\">\r\n");
      out.write("<section class=\"wrap\">\r\n");
      out.write("<section class=\"top_head_separator\">\r\n");
      out.write("\t\t<!--============================================================= BEGIN top blocks -->\r\n");
      out.write("  <section class=\"container_12\">\r\n");
      out.write("\t\t  <div class=\"grid_8 logo\">\r\n");
      out.write("\t\t\t  <div align=\"left\"><a href=\"index.jsp\"><img src=\"images/logo.png\" alt=\"Logo\" width=\"280\" height=\"150\" /></a><div style=\"position: absolute; width: 1041px; height: 100px; z-index: 1; left: 277px; top: 17px\" id=\"layer1\">\r\n");
      out.write("&nbsp;<ul id=\"nav\" class=\"nav_simple\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<li><a href=\"Engineering.jsp\" class=\"style2\">ENGINEERING</a>\r\n");
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"managementhome.jsp\" class=\"style2\">MANAGEMENT</a>\r\n");
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t    \r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<li><a href=\"medicalhome.jsp\" class=\"style2\">MEDICAL</a>\r\n");
      out.write("\t\t\t\t      \r\n");
      out.write("</li>\r\n");
      out.write("\t\t\t\t\t  \r\n");
      out.write("\t\t\t\t\t<li><a href=\"gehome.jsp\" class=\"style2\">GENERAL EDUCATION</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t<li><a href=\"distancehome.jsp\" class=\"style2\">DISTANCE EDUCATION</a>&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t</li>\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\t\t<div align=\"left\">&nbsp;</div>\r\n");
      out.write("\t\t\t  </section>\r\n");
      out.write("</section>\r\n");
      out.write("<div class=\"clear\"></div>\r\n");
      out.write("\t\t<div class=\"header\" style=\"width: 1327px; height: 500px\">\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<nav id=\"vertical\">\r\n");
      out.write("\t\t\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<!-- End of #nav-->\r\n");
      out.write("\t\t\t</nav><!-- End of menu nav#vertical -->\r\n");
      out.write("\t\t\t<p>&nbsp;</p>\r\n");
      out.write("\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t<div class=\"clear\"></div>\r\n");
      out.write("<div id=\"onebyone_slider\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("                        <div class=\"oneByOne_item\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"ob1_title\">ENGINEERING</span><span class=\"ob1_description\">Engineering is the application of scientific, economic, social, and practical knowledge in order to design, build, maintain, and improve structures, machines, devices, systems, materials and processes.\r\n");
      out.write("\t\t\t\t\t\t</span><span class=\"ob1_button\"><a href=\"engineering.jsp\" class=\"default_button\">SEARCH</a></span>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/e1.jpg\" class=\"ob1_img_device1\" alt=\"\"/>\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"oneByOne_item\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"ob1_title\">MANAGEMENT</span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"ob1_description\">\r\n");
      out.write("\t\t\t\t\t\tManagement in business and organizations is the function that coordinates the efforts of people to accomplish goals and objectives using available resources efficiently and effectively. Management comprises planning, organizing, staffing, leading or directing, and controlling an organization or initiative to accomplish a goal.</span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"ob1_button\"><a href=\"managementhome.jsp\" class=\"default_button\">SEARCH</a></span><img src=\"images/c11.jpg\" class=\"ob1_img_device1\" alt=\"\" width=\"425\" height=\"325\"/></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"oneByOne_item\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"ob1_title\">MEDICAL</span>\r\n");
      out.write("\t\t\t\t\t\t<span class=\"ob1_description\">Medical education is education related to the practice of being a medical practitioner; either the initial training to become a physician (i.e., medical school and internship),  or training to become a Physician Assistant. Medical education and training varies considerably across the world.</span>\r\n");
      out.write("\t\t\t\t\t<span class=\"ob1_button\"><a href=\"medicalhome.jsp\" class=\"default_button\">SEARCH</a></span>  <img src=\"images/m11.jpg\" class=\"ob1_img_device1\" alt=\"\"/></div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t<div class=\"oneByOne_item\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"ob1_title\">GENERAL EDUCATION</span><span class=\"ob1_description\">General Education Outcomes are the goals for learning and development upon which higher education general education programs are based.They can be defined as the knowledge, skills, attitudes, and values that college students will need to be successful in work, family, and community. </span><span class=\"ob1_button\"><a href=\"gehome.jsp\" class=\"default_button\">SEARCH</a></span>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/ge11.jpg\" class=\"ob1_img_device1\" alt=\"\"/>\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"oneByOne_item\">\r\n");
      out.write("\t\t\t\t\t\t<span class=\"ob1_title\">DISTANCE EDUCATION</span><span class=\"ob1_description\">Distance education, distance learning, dlearning, or D-Learning is a mode of delivering education and instruction, often on an individual basis, to students who are not physically present in a traditional setting such as a classroom.</span><span class=\"ob1_button\"><a href=\"distancehome.jsp\" class=\"default_button\">SEARCH</a></span>\r\n");
      out.write("\t\t\t\t\t\t<img src=\"images/d11.jpg\" class=\"ob1_img_device1\" alt=\"\"/>\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("</div>\r\n");
      out.write("\t\t\t<!-- END OF: #onebyone_slider -->\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t</div><section id=\"smk_content\" class=\"smk_content\">\r\n");
      out.write("\t\t\t<div class=\"container_8\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- ===================================================== MAIN CONTENT[begin] -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- ============= HOME NOTICE[begin] -->\r\n");
      out.write("                <!-- ============= HOME NOTICE[end] -->\r\n");
      out.write("                <!-- ============= SERVICES -->\r\n");
      out.write("<div class=\"home_service clearfix\">\r\n");
      out.write("\t\t\t\t\t<div class=\"s_title s_color_1\">\r\n");
      out.write("\t\t\t\t\t  <div class=\"st_in\">\r\n");
      out.write("\t\t\t\t\t  <h2>Counseling</h2>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"service_text s_users\">\r\n");
      out.write("\t\t\t\t\t\t<p>Challenges and competition are the part of modern society and therfore,career counseling through expert of concerned feid can guide us to do want we want to do in our life rather than just aimlessly changing jobs.Ther are many students who after 12th don't know where to go,what to do.</p>\r\n");
      out.write("\t\t\t\t  </div>\r\n");
      out.write("</div><!-- End service -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t  <div class=\"home_service clearfix\">\r\n");
      out.write("\t\t\t\t\t<div class=\"s_title s_color_2\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"st_in\">\r\n");
      out.write("\t\t\t\t\t  <h2>Resources</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"service_text s_magic\">\r\n");
      out.write("\t\t\t\t\t\t<p>The type of activity you enjoy most may influence your decision about the type of work you choose to do.Think of the work hobby and leisure activities that give you greatest sense of satisfaction.Here we provides online and offline examination programs which help you to polish your skills.</p>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t<div class=\"clear\"></div>\r\n");
      out.write("</div><!-- End service -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<div class=\"home_service clearfix\">\r\n");
      out.write("\t\t\t\t\t<div class=\"s_title s_color_3\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"st_in\">\r\n");
      out.write("\t\t\t\t\t  <h2>Collaboration</h2>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div class=\"service_text s_mobile\">\r\n");
      out.write("\t\t\t\t\t\t<p>Collaboration relies on openness and knowledge sharing but also some level of focus and accountability on the part of the business organization. Governance should be established addressing the creation and closing of team workspaces with assignment of responsibility for capturing the emergent results of the collaborative effort for preservation in the repository. </p>\r\n");
      out.write("\t\t\t\t  </div></div>\r\n");
      out.write("\t\t\t\t    <!-- End service -->\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t<!-- ============= / SERVICES[end] -->\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<!-- ============= / PORTFOLIO[begin] --><!-- ============= / PORTFOLIO[end] --><!-- ============= / BLOG[begin] -->\r\n");
      out.write("\t\t\t\t<!-- ============= / BLOG[end] --><!-- ============= / CLIENTS[begin] -->\r\n");
      out.write("                <!-- ============= / CLIENTS[end] -->\r\n");
      out.write("                <!-- ===================================================== MAIN CONTENT[end] -->\r\n");
      out.write("                \r\n");
      out.write("\t\t\t\t<!-- END .container_12 -->\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</section><!--/============================================================= END content [ .smk_content ] -->\r\n");
      out.write("        <!-- =============== FOOTER [begin] ================ -->\r\n");
      out.write("\r\n");
      out.write("  </section> \r\n");
      out.write(" </section>\r\n");
      out.write("<section id=\"site_footer_second\"> <section class=\"container_12 site_footer_inner\"> <div class=\"grid_6 site_copyright\"> <a class=\"go_to_top scroll_top_infooter\" href=\"#\" onClick=\"return false\">top</a> <a href=\"teammember.jsp\" target=\"_blank\">DEVELOPER TEAM </a></div> \r\n");
      out.write("    <div class=\"grid_6 footer2_right footer_social\"> <a href=\"#\" class=\"facebook\"></a> <a href=\"#\" class=\"twitter\"></a> <a href=\"#\" class=\"youtube\"></a> </div> <div class=\"clear\"></div> </section>\r\n");
      out.write("</section> \r\n");
      out.write("<div class=\"clear\"></div> </section> </section> <script type=\"text/javascript\" src=\"js/iview.js\"></script> <script type=\"text/javascript\" src=\"js/raphael-min.js\"></script> <script type=\"text/javascript\" src=\"js/jquery.plugins-min.js\"></script> <script type=\"text/javascript\" src=\"http://maps.google.com/maps/api/js@sensor=false\"></script> <script type=\"text/javascript\" src=\"js/gmap3.min.js\"></script> <script type=\"text/javascript\" src=\"js/gmap.init.js\"></script> <script type=\"text/javascript\" src=\"js/smk-framework-min.js\"></script> <script type=\"text/javascript\" src=\"js/scripts-bottom-min.js\"></script> </body> </html>");
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