package org.copydays.rmliu.MVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletRequest;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/user/")
public class QueryUserController extends FlowerController {

    @Autowired
    OrderNoService orderNoService;

    @RequestMapping(value = "query")
    public void hello(String userid) {
        logger.info("收到请求： {}", userid);
        doProcess(userid);
    }

    public boolean handler(ServletRequest req, ServlertResponse res) {
        String uri = ((HttpServletRequest) req).getRequestURI();

        Object[] parameters = new Object[args.length];

        for (int i = 0; i < args.length; i++) {
            parameters[i] = req.getParameter(args[i]);
        }

        Object ctl = controller.newInstance(uri);
        Object response = method.invoke(ctl, parameters);
        res.getWriter().println(response.toString());

        return true;
    }
}
