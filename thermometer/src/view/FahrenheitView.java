package view;

import model.TemperatureModel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Observable;

/**
 * Created by 平 on 2017/6/14.
 */
//华氏温度
public class FahrenheitView extends TemperatureView{

    private MercurycolumnView mercurycolumnView;

    public FahrenheitView(int h, int v, TemperatureModel model) {
        super("Fahrenheit", h, v, model);
    }

    @Override
    public void init() {
        super.init();
        setDisplay("" + getModel().getFahrenheit());
        mercurycolumnView = new MercurycolumnView(getModel().getFahrenheit());
        addUpListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getModel().setFahrenheit(getModel().getFahrenheit() + 1.0);
            }
        });
        addDownListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getModel().setFahrenheit(getModel().getFahrenheit() - 1.0);
            }
        });
        addDisplayListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = getDisplay();
                getModel().setFahrenheit(value);
            }
        });
    }

    @Override
    public void update(Observable t, Object o) {
        setDisplay("" + getModel().getFahrenheit());
        mercurycolumnView.setTemperature(getModel().getFahrenheit());
    }
}
