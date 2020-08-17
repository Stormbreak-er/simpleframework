package com.imooc;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j
@WebServlet("/")
public class HelloServlet extends HttpServlet {

//    private static final Logger log = LoggerFactory.getLogger(HelloServlet.class);

    @Override
    public void init() throws ServletException {
        System.out.println("init()……");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service()……");
        doGet(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = "my simple framework";
        
        log.debug("name is " + name);
        log.info("name is " + name);
        log.warn("name is " + name);
        log.error("name is " + name);
        
        req.setAttribute("name", name);
        req.getRequestDispatcher("/WEB-INF/jsp/hello.jsp").forward(req, resp);
    }

    //Tomcat关闭时，控制台不会打印出"destroy()……"，这是因为IDEA会清空控制台
    //如果想要看到效果，可以自己把项目打成war包，运行在本地的Tomcat上，并访问该servlet，手动调用shutdown.bat就能观察到了
    @Override
    public void destroy() {
        System.out.println("destroy()……");
    }
}
