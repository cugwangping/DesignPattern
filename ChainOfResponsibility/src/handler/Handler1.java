package handler;

import cor.Levels;
import request.AbstractRequest;

/**
 * Created by 平 on 2017/6/12.
 */
// 具体处理者1
public class Handler1 extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        return Levels.LEVEL_1;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("处理者-1 处理 " + request.getContent() + "\n");
    }
}