package main.com.chengxiang.servlet;

import com.alibaba.fastjson.JSON;
import main.com.chengxiang.response.RenderResult;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by chengxiang.peng on 2016/12/9.
 */
public class RenderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("RenderServlet doPost");
        PrintStream printStream = new PrintStream(resp.getOutputStream());

        RenderResult renderResult = new RenderResult();
        List<RenderResult.RenderListItem> renderListItemList = new ArrayList<RenderResult.RenderListItem>(30);
        for (int i = 0; i < 30; i++) {
            RenderResult.RenderListItem renderListItem = renderResult.new RenderListItem();
            renderListItem.setImageUrl("https://localhost:8443/qserver/img/" + i % 6 + ".jpg");
            renderListItem.setItemTitle("Title " + i);
            renderListItem.setItemDescription("Description " + i);
            renderListItemList.add(renderListItem);
        }
        renderResult.setRenderListItemList(renderListItemList);
        System.out.println(JSON.toJSONString(renderResult));
        printStream.println(JSON.toJSONString(renderResult));
    }
}
