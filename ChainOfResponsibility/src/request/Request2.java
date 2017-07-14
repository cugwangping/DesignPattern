package request;

import cor.Levels;

/**
 * Created by 平 on 2017/6/12.
 */
//具体请求2
public class Request2 extends AbstractRequest{
    public Request2(String content) {
        super(content);
    }

    @Override
    public int getRequestLevel() {
        return Levels.LEVEL_2;
    }
}
