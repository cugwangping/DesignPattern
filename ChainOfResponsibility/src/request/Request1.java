package request;

import cor.Levels;

/**
 * Created by 平 on 2017/6/12.
 */
//具体请求1
public class Request1 extends AbstractRequest{
    public Request1(String content) {
        super(content);
    }

    @Override
    public int getRequestLevel() {
        return Levels.LEVEL_1;
    }
}
