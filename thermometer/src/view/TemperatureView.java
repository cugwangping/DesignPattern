package view;

import javafx.beans.Observable;
import model.TemperatureModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Observer;

/**
 * Created by 平 on 2017/6/14.
 */
//温度视图
public abstract class TemperatureView implements Observer{
    private int h;
    private int v;
    private String label;
    private TemperatureModel model;
    private JFrame temperatureFrame;
    private JTextField display = new JTextField();
    private JButton upButton = new JButton("Increase");
    private JButton downButton = new JButton("Decrease");

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public TemperatureModel getModel() {
        return model;
    }

    public void setModel(TemperatureModel model) {
        this.model = model;
    }


    public TemperatureView(String title, int h, int v, TemperatureModel m) {
        this.label = title;
        this.h = h;
        this.v = v;
        this.model = m;
    }

    public void init() {
        temperatureFrame = new JFrame(label);
        temperatureFrame.add("North", new Label(label));
        temperatureFrame.add("Center", display);
        JPanel buttons = new JPanel();
        buttons.add(upButton);
        buttons.add(downButton);
        temperatureFrame.add("South", buttons);
        temperatureFrame.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                System.exit(0);
            }
        });
        model.addObserver(this); // Connect the View to the Model
        temperatureFrame.setSize(200, 100);
        temperatureFrame.setLocation(h, v);
        temperatureFrame.setVisible(true);
        temperatureFrame.pack();
    }

    public void setDisplay(String s) {
        display.setText(s);
    }

    public double getDisplay() {
        double result = 0.0;
        try {
            result = Double.valueOf(display.getText()).doubleValue();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return result;
    }

    public void addDisplayListener(ActionListener a) {
        display.addActionListener(a);
    }

    public void addUpListener(ActionListener a) {
        upButton.addActionListener(a);
    }

    public void addDownListener(ActionListener a) {
        downButton.addActionListener(a);
    }
}
