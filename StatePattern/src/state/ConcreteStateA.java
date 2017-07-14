package state;

/**
 * Created by 平 on 2017/6/12.
 */
public class ConcreteStateA implements State {

    @Override
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }

}