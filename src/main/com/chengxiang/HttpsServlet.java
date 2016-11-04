package main.com.chengxiang;

import com.alibaba.fastjson.JSON;
import main.com.chengxiang.response.HttpsResponse;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by chengxiang.peng on 2016/11/4.
 */
@WebServlet(name = "HttpsServlet", urlPatterns = {"/HttpsServlet"})
public class HttpsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintStream printStream = new PrintStream(resp.getOutputStream());
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
        HttpsResponse httpsResponse = new HttpsResponse();
        if ("123".equals(userName) && passWord.equals("123")) {
            httpsResponse.setCode("000");
            httpsResponse.setMessage("login success!");
        } else {
            httpsResponse.setCode("004");
            httpsResponse.setMessage("login faild!");
        }
        printStream.println(JSON.toJSONString(httpsResponse));
    }
}
