package main.com.chengxiang.response;

import java.io.Serializable;
import java.util.List;

/**
 * Render图片列表请求结果类
 * Created by chengxiang.peng on 2016/12/9.
 */
public class RenderResult implements Serializable {
    private List<RenderListItem> renderListItemList;

    public RenderResult(){}

    public List<RenderListItem> getRenderListItemList() {
        return renderListItemList;
    }

    public void setRenderListItemList(List<RenderListItem> renderListItemList) {
        this.renderListItemList = renderListItemList;
    }

    /**
     * Render列表列表项
     */
    public class RenderListItem implements Serializable{
        private String imageUrl;
        private String itemTitle;
        private String itemDescription;

        public String getImageUrl() {
            return imageUrl;
        }

        public void setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
        }

        public String getItemTitle() {
            return itemTitle;
        }

        public void setItemTitle(String itemTitle) {
            this.itemTitle = itemTitle;
        }

        public String getItemDescription() {
            return itemDescription;
        }

        public void setItemDescription(String itemDescription) {
            this.itemDescription = itemDescription;
        }
    }
}
