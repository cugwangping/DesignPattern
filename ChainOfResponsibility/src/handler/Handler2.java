package handler;

import cor.Levels;
import request.AbstractRequest;

/**
 * Created by 平 on 2017/6/12.
 */
// 具体处理者2
public class Handler2 extends AbstractHandler {
    @Override
    protected int getHandlerLevel() {
        return Levels.LEVEL_2;
    }

    @Override
    protected void handle(AbstractRequest request) {
        System.out.println("处理者-2 处理 " + request.getContent() + "\n");
    }
}