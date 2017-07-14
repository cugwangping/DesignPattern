package controller;

import model.TemperatureModel;

import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

/**
 * Created by 平 on 2017/6/14.
 */
public class SliderController implements AdjustmentListener{

    private TemperatureModel model;
    private Scrollbar tempControl;

    public SliderController(TemperatureModel model, Scrollbar tempControl) {
        this.model = model;
        this.tempControl = tempControl;
    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent e) {
        model.setCelcius(tempControl.getValue());
    }
}
