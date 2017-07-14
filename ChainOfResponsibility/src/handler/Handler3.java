package handler;

import cor.Levels;
import request.AbstractRequest;

/**
 * Created by 平 on 2017/6/12.
 */
// 具体处理者3
public class Handler3 extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        return Levels.LEVEL_3;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("处理者-3 处理 " + request.getContent() + "\n");
    }
}