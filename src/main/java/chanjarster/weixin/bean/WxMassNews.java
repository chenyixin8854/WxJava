package chanjarster.weixin.bean;

import java.util.ArrayList;
import java.util.List;

import chanjarster.weixin.util.json.WxGsonBuilder;

/**
 * 群发时用到的图文消息素材
 * @author chanjarster
 *
 */
public class WxMassNews {

  protected List<WxMassNewsArticle> articles = new ArrayList<WxMassNewsArticle>();
  
  public List<WxMassNewsArticle> getArticles() {
    return articles;
  }
  public void setArticles(List<WxMassNewsArticle> articles) {
    this.articles = articles;
  }
  
  public String toJson() {
    return WxGsonBuilder.INSTANCE.create().toJson(this);
  }
  
  public static class WxMassNewsArticle {
    /**
     * (必填) 图文消息缩略图的media_id，可以在基础支持-上传多媒体文件接口中获得
     */
    protected String thumb_media_id;
    /**
     * 图文消息的作者
     */
    protected String author;
    /**
     * (必填) 图文消息的标题
     */
    protected String title;
    /**
     * 在图文消息页面点击“阅读原文”后的页面
     */
    protected String content_source_url;
    /**
     * (必填) 图文消息页面的内容，支持HTML标签
     */
    protected String content;
    /**
     * 图文消息的描述
     */
    protected String digest;
    /**
     * 是否显示封面，1为显示，0为不显示
     */
    protected boolean show_cover_pic;
    
    public String getThumb_media_id() {
      return thumb_media_id;
    }
    public void setThumb_media_id(String thumb_media_id) {
      this.thumb_media_id = thumb_media_id;
    }
    public String getAuthor() {
      return author;
    }
    public void setAuthor(String author) {
      this.author = author;
    }
    public String getTitle() {
      return title;
    }
    public void setTitle(String title) {
      this.title = title;
    }
    public String getContent_source_url() {
      return content_source_url;
    }
    public void setContent_source_url(String content_source_url) {
      this.content_source_url = content_source_url;
    }
    public String getContent() {
      return content;
    }
    public void setContent(String content) {
      this.content = content;
    }
    public String getDigest() {
      return digest;
    }
    public void setDigest(String digest) {
      this.digest = digest;
    }
    public boolean isShow_cover_pic() {
      return show_cover_pic;
    }
    public void setShow_cover_pic(boolean show_cover_pic) {
      this.show_cover_pic = show_cover_pic;
    }
    
  }
}