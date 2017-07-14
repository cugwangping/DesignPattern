package view;

import model.TemperatureModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
 * Created by 平 on 2017/6/14.
 */
//摄氏温度
public class CelsiusView extends TemperatureView {
    public CelsiusView(int h, int v, TemperatureModel model) {
        super("Celsius Temperature", h, v, model);
    }

    @Override
    public void init() {
        super.init();
        setDisplay("" + getModel().getCelcius());
        addUpListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getModel().setCelcius(getModel().getCelcius() + 1.0);
            }
        });
        addDownListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getModel().setCelcius(getModel().getCelcius() - 1.0);
            }
        });
        addDisplayListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = getDisplay();
                getModel().setCelcius(value);
            }
        });
    }

    @Override
    public void update(Observable t, Object o) {
        setDisplay("" + getModel().getCelcius());
    }
}
