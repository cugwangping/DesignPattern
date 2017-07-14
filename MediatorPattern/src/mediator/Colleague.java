package mediator;

/**
 * Created by 平 on 2017/6/12.
 */
public class Colleague {
    protected String name;
    protected Mediator mediator;

    public Colleague(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}