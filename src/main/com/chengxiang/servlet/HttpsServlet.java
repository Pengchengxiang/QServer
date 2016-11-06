package main.com.chengxiang.servlet;

import com.alibaba.fastjson.JSON;
import main.com.chengxiang.response.HttpsResponse;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;

/**
 * Created by chengxiang.peng on 2016/11/4.
 */
public class HttpsServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        doLoginRequest(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet");
        doLoginRequest(req, resp);
    }

    private void doLoginRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        PrintStream printStream = new PrintStream(resp.getOutputStream());
        HttpsResponse httpsResponse = new HttpsResponse();
        String userName = req.getParameter("userName");
        String passWord = req.getParameter("passWord");
        if ("123".equals(userName) && "123".equals(passWord)) {
            httpsResponse.setCode("000");
            httpsResponse.setMessage("login success!");
        } else {
            httpsResponse.setCode("004");
            httpsResponse.setMessage("login faild!");
        }
        printStream.println(JSON.toJSONString(httpsResponse));
    }
}
