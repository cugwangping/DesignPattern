package request;

import cor.Levels;

/**
 * Created by 平 on 2017/6/12.
 */
//具体请求3
public class Request3 extends AbstractRequest{
    public Request3(String content) {
        super(content);
    }

    @Override
    public int getRequestLevel() {
        return Levels.LEVEL_3;
    }
}
