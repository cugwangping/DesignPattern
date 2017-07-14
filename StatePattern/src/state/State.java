package state;

/**
 * Created by 平 on 2017/6/12.
 */
public interface State {
    /**
     * 状态对应的处理
     */
    void handle(String sampleParameter);
}
