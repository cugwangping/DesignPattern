package request;

/**
 * Created by 平 on 2017/6/12.
 */
public abstract class AbstractRequest {
    private String content = null;

    public AbstractRequest(String content) {
        this.content = content;
    }

    public String getContent() {
        return this.content;
    }

    // 获得请求的级别
    public abstract int getRequestLevel();
}
