package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Engineering_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" dir=\"ltr\" lang=\"en-US\">\n");
      out.write("<head>\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\" />\n");
      out.write("<meta charset=\"UTF-8\" />\n");
      out.write("<meta name=\"description\" content=\"Template designed by Smartik\" />\n");
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
      out.write("    <link rel=\"alternate stylesheet\" type=\"text/css\" href=\"css/themes/69.css\" title=\"69.css\" />    \n");
      out.write("    <script type=\"text/javascript\" src=\"js/styleswitcher.js\"></script>\t\n");
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
      out.write("<title>Engineering</title>\n");
      out.write("<style type=\"text/css\">\n");
      out.write("<!--\n");
      out.write(".style1 {font-size: 16px}\n");
      out.write(".style2 {\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\tfont-style: italic;\n");
      out.write("}\n");
      out.write(".style3 {\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tcolor: #000000;\n");
      out.write("}\n");
      out.write(".style7 {font-size: 12px}\n");
      out.write(".style9 {font-size: 18px; color: #000000; font-weight: bold; }\n");
      out.write(".style10 {font-size: 18px; color: #000000; font-weight: bold; font-style: italic; }\n");
      out.write(".style11 {\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tfont-family: \"Times New Roman\", Times, serif;\n");
      out.write("}\n");
      out.write("-->\n");
      out.write("</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\t</div>\n");
      out.write("</div>\n");
      out.write("<section id=\"smk_container_full\">\n");
      out.write("  <section class=\"smk_container\">\n");
      out.write("    <section class=\"wrap\">\n");
      out.write("      <section class=\"top_head_separator\">\n");
      out.write("        <!--============================================================= BEGIN top blocks -->\n");
      out.write("        <section class=\"container_12\">\n");
      out.write("          <div class=\"grid_4 logo\"><a href=\"22.png\"> &nbsp;&nbsp;<img src=\"images/logo.png\" alt=\"\" width=\"280\" height=\"150\"></a></div>\n");
      out.write("          <div class=\"grid_8 top_mod_right\">\n");
      out.write("            <!--================== BEGIN main menu -->\n");
      out.write("            <nav id=\"horizontal\">\n");
      out.write("              <ul id=\"nav\" class=\"nav_simple\">\n");
      out.write("                <li><a href=\"index.jsp\">Home</a>\n");
      out.write("                  \n");
      out.write("                <li><a href=\"sengg.html\">Engineering College</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("                    <li><a href=\"engnorth.jsp\">North</a></li>\n");
      out.write("                    <li><a href=\"engsouth.jsp\">South</a></li>\n");
      out.write("                    <li><a href=\"engeast.jsp\">East</a></li>\n");
      out.write("                    <li><a href=\"engwest.jsp\">West</a></li>\n");
      out.write("                    \n");
      out.write("                  </ul>\n");
      out.write("                 \n");
      out.write("                    \n");
      out.write("                </li>\n");
      out.write("\t\t\t\t\n");
      out.write("                <li><a href=\"#\">Top Government College</a>\n");
      out.write("\t\t\t\t<ul>\n");
      out.write("                    <li><a href=\"blog-meta-before.html\">North</a></li>\n");
      out.write("                    <li><a href=\"blog-meta-after.html\">South</a></li>\n");
      out.write("                    <li><a href=\"blog-meta-iconsright.html\">East</a></li>\n");
      out.write("                    <li><a href=\"blog-meta-iconsleft.html\">West</a></li>\n");
      out.write("                    \n");
      out.write("                  </ul>\n");
      out.write("\t\t\t\t\n");
      out.write("                 \n");
      out.write("                </li>\n");
      out.write("                    \n");
      out.write("                <span class=\"style11\"></span>\n");
      out.write("                <!--<li><a href=\"blog-meta-before.html\">test preparation</a>\n");
      out.write("                  <ul>\n");
      out.write("                    <li><a href=\"blog-meta-before.html\">Mock test paper AIEEE</a></li>\n");
      out.write("                    <li><a href=\"blog-meta-after.html\">Mock test paper IIT</a></li>\n");
      out.write("                    <li><a href=\"blog-meta-iconsright.html\">Basic apptitue</a></li>\n");
      out.write("                    <li><a href=\"blog-meta-iconsleft.html\">Gernal knowledge</a></li>\n");
      out.write("                    \n");
      out.write("                  </ul>\n");
      out.write("                </li>\n");
      out.write("               \n");
      out.write("                <li><a href=\"page-contact.html\">advisor cafe </a></li>\n");
      out.write("              </ul> --!>\n");
      out.write("              <!-- End of #nav-->\n");
      out.write("            </nav>\n");
      out.write("            <!-- End of menu nav#horizontal -->\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <!--/================= END main menu -->\n");
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
      out.write("            <h1>ENGINEERING </h1>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"grid_6\">\n");
      out.write("\t\t\t<form method=\"get\" id=\"searchform\" action=\"#\">\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"submit\" name=\"submit\" id=\"searchsubmit\" value=\"\" />\n");
      out.write("\t\t\t</form></div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <section id=\"smk_content\" class=\"smk_content\">\n");
      out.write("        <div class=\"container_12\">\n");
      out.write("          <!-- ===================================================== MAIN CONTENT[begin] -->\n");
      out.write("          <div class=\"grid_8\">\n");
      out.write("            <!-- ==== Blog article [begin] ==== -->\n");
      out.write("            <div class=\"blog_article blog_article_s1 clearfix\">\n");
      out.write("              <!-- Post image -->\n");
      out.write("              <div class=\"blog_post_image\"> <a href=\"#\"></a> </div>\n");
      out.write("              <!-- Post title and details -->\n");
      out.write("              <div class=\"clearfix\">\n");
      out.write("                <p align=\"justify\" class=\"style10\">What  is engineering all about?</p>\n");
      out.write("                <h1 align=\"justify\"><a href=\"#\"></a></h1>\n");
      out.write("              </div>\n");
      out.write("              <div align=\"justify\">\n");
      out.write("                <!-- Post content-->\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <p align=\"justify\">Engineering is the practical application of science and math to solve problems, and it is  everywhere in the world. From the start to the end of each day, engineering technologies improve the  ways that we communicate, work, travel, stay healthy, and entertain ourselves.</p>\n");
      out.write("                <p align=\"justify\">Engineers are problem-solvers who want to make things work more efficiently and quickly and less expensively. From computer  chips and satellites to medical devices and renewable energy  technology engineering makes our modern life possible. &nbsp;The  discipline of engineering is extremely broad, and encompasses a range of more  specialized&nbsp;field of engineering each with a more specific emphasis on particular areas  of technology and types of application. One who practices engineering is called an&nbsp;engineer. Engineering, much like other science, is a broad  discipline which is often broken down into several sub-disciplines. </p>\n");
      out.write("               </div>\n");
      out.write("              <div align=\"justify\">\n");
      out.write("                <!-- Post read more... -->\n");
      out.write("              </div>\n");
      out.write("              <div> </div>\n");
      out.write("            </div>\n");
      out.write("            <div align=\"justify\">\n");
      out.write("              <!-- ==== Blog article [end] ==== -->\n");
      out.write("              <!-- ==== Blog article [begin] ==== -->\n");
      out.write("            </div>\n");
      out.write("            <div class=\"blog_article blog_article_s1 clearfix\">\n");
      out.write("              <div align=\"justify\">\n");
      out.write("                <!-- Post slider -->\n");
      out.write("              </div>\n");
      out.write("              <div id=\"blogSlider1\" class=\"blog_slider flexslider\">\n");
      out.write("                    <div align=\"left\">\n");
      out.write("                      <ul class=\"slides\">\n");
      out.write("                          <li> \n");
      out.write("\t\t\t\t\t\t\t<img src=\"images/future-engineers-logo.jpg\" width=\"742\" height=\"301\" />                          </li>\n");
      out.write("                      </ul>\n");
      out.write("                    </div>\n");
      out.write("                <ul class=\"slides\"><li><p  class=\"flex-caption\">Captions - a image description.</p>\n");
      out.write("                  </li>\n");
      out.write("                  <li> \n");
      out.write("                    <div ><a href=\"#\"><img src=\"images/12.jpg\" width=\"800\" height=\"400\" /></a>                    </div>\n");
      out.write("                    <p  class=\"flex-caption\">This image is wrapped in a link!</p>\n");
      out.write("                  </li>\n");
      out.write("                  <li> \n");
      out.write("                    <div ><img src=\"images/qa.jpg\" width=\"500\" height=\"800\" /> </div>\n");
      out.write("                  </li>\n");
      out.write("                  <li> \n");
      out.write("                    <div ><img src=\"images/zs.jpg\" width=\"500\" height=\"800\" /> </div>\n");
      out.write("                  </li>\n");
      out.write("                </ul>\n");
      out.write("              </div>\n");
      out.write("              <div class=\"clear\"></div>\n");
      out.write("              <div align=\"justify\">\n");
      out.write("                <!-- Post title and details -->\n");
      out.write("              </div>\n");
      out.write("              <div class=\"\">\n");
      out.write("                <p align=\"justify\"class=\"style2\"><a href=\"#\" class=\"style3\"></a><strong><em><A NAME=\"What is Computer Engineering?\">What is Computer Engineering?</A></em></strong></h1>\n");
      out.write("                </p>\n");
      out.write("              <div align=\"justify\">\n");
      out.write("                <!-- Post content-->\n");
      out.write("              </div>\n");
      out.write("              <div>\n");
      out.write("                <p align=\"justify\" >Computer  Engineers analyze and evaluate computer systems, both hardware and software they  might work on systems such as a flexible manufacturing system or a &quot;smart&quot;  device or instrument. Computer engineers often find themselves focusing on  problems or challenges that result in new &quot;state-of-the-art&quot;  products, which integrate computer capabilities. They work on the design,  planning, development, testing, and even the supervision of manufacturing of  computer hardwareï¿½including everything from chips to device controllers.<br>\n");
      out.write("They  work on the interfaces between different pieces of hardware and strive to provide new  capabilities to existing and new systems or products. The work of a computer  engineer is grounded in hardwareï¿½from circuits to architectureï¿½but also focuses  on operating system and software. Computer engineers must understand logic design,  microprocessor system design, computer architecture, computer interfacing, and  continually focus on system requirements and design. It is primarily software  engineers who focus on creating the software systems used by individuals and  businesses, but computer engineers may also design and develop some software  applications.</p>\n");
      out.write("                <p align=\"justify\" class=\"style2\"><a href=\"#\" class=\"style3\"><A NAME=\"What  is Electrical Engineering?\">What  is Electrical Engineering?</A></p>\n");
      out.write("                <p align=\"justify\">Electrical  Engineers have made remarkable contributions to our world. They helped invent  the computer, DSL, cellular phones, microchips, and  solar panelsï¿½to name just a few examples. DVD players, cellular phones, radio,  television, computers, airplanes, space vehicles, cars, motorcycles, home  appliances, life-saving medical equipment, computer games, and Martian battles  fought with joysticks represent a mere sampling of the now familiar facets of  life made possible with the input of electrical engineers. </p>\n");
      out.write("                <p align=\"justify\" class=\"text-black style1\"><span class=\"style9\"><A NAME=\"What is chemical engineering?\">What is chemical engineering?</A></span></p>\n");
      out.write("                <p align=\"justify\" class=\"text-black style7\">A chemical Engineers conducting research and development may spend the majority of their time working  independently in a lab performing experiments and writing technical reports.</p>\n");
      out.write("                <p align=\"justify\" class=\"style9\"><A NAME=\"What is civil engineering?\">What is civil engineering?</A></p>\n");
      out.write("                <p align=\"justify\"><span class=\"style9\"><A NAME=\"What is mechanical engineering?\">What is mechanical engineering?</A></span><br>\n");
      out.write("                </p>\n");
      out.write("                <p align=\"justify\">The  Mechanical Engineers needs to acquire particular skills and knowledge. He/she  needs to understand the forces and the thermal environment that a product, its parts,  or its subsystems will encounter; to design them for functionality, aesthetics,  and the ability to withstand the forces and the thermal environment they will  be subjected to; and to determine the best way to manufacture them and ensure  they will operate without failure. Perhaps the one skill that is the mechanical  engineerï¿½s exclusive domain is the ability to analyze and design objects and  systems with motion.</p>\n");
      out.write("                <p class=\"text-black style7\">&nbsp;</p>\n");
      out.write("              </div>\n");
      out.write("              <!-- Post read more... -->\n");
      out.write("              <div>\n");
      out.write("                <div class=\"blog_post_category\"></div>\n");
      out.write("              </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- ==== Blog article [end] ==== -->\n");
      out.write("            <!-- ==== Blog article [begin] ==== -->\n");
      out.write("            <!-- ==== Blog article [end] ==== -->\n");
      out.write("            <!-- ==== Blog article [begin] ==== -->\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <!-- ==== Blog article [end] ==== -->\n");
      out.write("            <!-- ==== Blog article [begin] ==== --><!-- ==== Blog article [end] ==== -->\n");
      out.write("            <!-- ==== Blog article [begin] ==== -->\n");
      out.write("            <!-- ==== Blog article [end] ==== -->\n");
      out.write("            <!-- ==== Pagination [begin] ==== -->\n");
      out.write("<div class=\"clear\"></div>\n");
      out.write("            <!-- ==== Pagination [end] ==== -->\n");
      out.write("          </div>\n");
      out.write("          <!--END .grid_8-->\n");
      out.write("          <!-- === Sidebar[begin] === -->\n");
      out.write("          <div class=\"sidebar grid_4\">\n");
      out.write("            <!-- ==== WIDGET [begin] ==== -->\n");
      out.write("            <aside class=\"widget widget_categories\">\n");
      out.write("              <h3 class=\"widget-title\">Popular Categories of Engineering </h3>\n");
      out.write("              <ul>\n");
      out.write("                \n");
      out.write("                <li><a href=\"#Information technology\">Information Technology</a><div style=\"position: absolute; top: -1999px; left: -1988px;\" id=\"stcpDiv1\">\n");
      out.write("\t\t\t\t\t&lt;a href=&quot;#raptors&quot;&gt;Read more about raptors!&lt;/a&gt;</div>\n");
      out.write("\t\t\t\t<div style=\"position: absolute; top: -1999px; left: -1988px;\" id=\"stcpDiv0\">\n");
      out.write("\t\t\t\t\t&lt;a href=&quot;#raptors&quot;&gt;Read more about raptors!&lt;/a&gt;</div>\n");
      out.write("\t\t\t\t<div style=\"position: absolute; top: -1999px; left: -1988px;\" id=\"stcpDiv\">\n");
      out.write("\t\t\t\t\t&lt;a href=&quot;#raptors&quot;&gt;Read more about raptors!&lt;/a&gt;</div>\n");
      out.write("\t\t\t\t</li>\n");
      out.write("                <li><a href=\"#What is Computer Engineering?\">Computer Science </a></li>\n");
      out.write("                <li><a href=\"#What  is Electrical Engineering?\">Electronic and Electrical Engineering </a></li>\n");
      out.write("                <li><a href=\"#What is mechanical engineering?\">Mechanical Engineering </a></li>\n");
      out.write("                <li class=\"current-menu-item\"><a href=\"#What is civil engineering?\">Civil Engineering</a></li>\n");
      out.write("                <li><a href=\"#What is chemical engineering?\">Chemical Engineering </a></li>\n");
      out.write("                <!--<li><a href=\"#\">Galleries</a></li>\n");
      out.write("                <li><a href=\"#\">Video Experiments</a></li>\n");
      out.write("                --!>\n");
      out.write("              </ul>\n");
      out.write("            </aside>\n");
      out.write("            <div class=\"clear\"></div>\n");
      out.write("            <!-- ==== WIDGET [end] ==== -->\n");
      out.write("            <!-- ==== WIDGET [begin] ==== -->\n");
      out.write("            <aside class=\"widget\">\n");
      out.write("              <h3 class=\"widget-title\">Updated Admissions Forms </h3>\n");
      out.write("              <div class=\"recent_comments\">\n");
      out.write("                <div class=\"post_comm\"> <a href=\"#\"></a>\n");
      out.write("                  <p><a href=\"#\"><strong>PTU Entrance Form</strong>:</a> Stranguillio cum unde non coepit cenam veniebant est in fuerat est Apollonius mihi esse more defuncta ait...</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <div class=\"post_comm\"> <a href=\"#\"></a>\n");
      out.write("                  <p><a href=\"#\"><strong>MDU Entrance Form</strong>:</a> In lucem exempli paupers coniunx in fuerat. Toro frumento manu duas recitare...</p>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"clear\"></div>\n");
      out.write("                <div class=\"post_comm\"> <a href=\"#\"></a>\n");
      out.write("                  <p><a href=\"#\"><strong>Delhi University</strong>:</a> Tharsia adulescens longum deposita ad te in. Neptunalia festinare decenter ortam adipiscing enixa...</p>\n");
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
      out.write("              <ul>\n");
      out.write("                <li> <a href=\"#\"><img src=\"images/images (2).jpg\" alt=\"\" width=\"90\" height=\"95\" /></a> <a href=\"#\">AIEEE result will be out on 12 April 2014. .</a> <br />\n");
      out.write("                 \n");
      out.write("                  <div class=\"clear\"></div>\n");
      out.write("                </li>\n");
      out.write("                <li> <a href=\"#\"><img src=\"images/qw.png\" alt=\"\" width=\"90\" height=\"95\" /></a> <a href=\"#\">Delhi univesity forms are out and they providing scholorship of above 90% in PCM </a> <br />\n");
      out.write("                \n");
      out.write("                  <div class=\"clear\"></div>\n");
      out.write("                </li>\n");
      out.write("                <li><a href=\"#\"><img src=\"images/iit-jee.png\" width=\"90\" height=\"95\" longdesc=\"../../../Desktop/New folder/iit.png\"></a><a href=\"#\">IIT counselling starts from 24 april 2014.</a> <br />\n");
      out.write("                  \n");
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
      out.write("        <div class=\"grid_6 site_copyright\"> <a href=\"teammember.jsp\">Developer Team</a> </div>\n");
      out.write("        <div class=\"grid_6 footer2_right footer_social\"> <a href=\"#\" class=\"facebook\"></a> <a href=\"#\" class=\"twitter\"></a>  <a href=\"#\" class=\"youtube\"></a>  </div>\n");
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
      out.write("</div></div></body>\n");
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
