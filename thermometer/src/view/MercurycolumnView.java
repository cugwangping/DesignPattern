package view;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by 平 on 2017/6/20.
 */
public class MercurycolumnView extends Frame implements ActionListener {

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    private double temperature; //温度
    private Button fahrenheitButton;   //   华氏温度按钮

    private int h;
    private int v;

    //private Scrollbar tempControl = new Scrollbar(Scrollbar.VERTICAL, 0, 10, -50, 160);
    //private TemperatureModel model;

    public MercurycolumnView(double temperature){
        this.temperature = temperature;
        setSize(350,750);
        setVisible(true);
        setLayout(null);

        //华氏度
        fahrenheitButton = new Button("fahrenheit");
        fahrenheitButton.addActionListener(this);
        fahrenheitButton.setBounds(230,620,60,20);
        fahrenheitButton.setBackground(Color.lightGray);
        fahrenheitButton.setForeground(Color.black);
        add(fahrenheitButton);
    }

    @Override
    public boolean handleEvent(Event event){
        try {
            addWindowListener(new WindowAdapter() {

                @Override
                public void windowClosing(WindowEvent e) {
                    e.getWindow().setVisible(false);
                    System.exit(0);
                }
            });
            return true;
        }catch (Exception e){
            return false;
        }

    }

    public void paint(Graphics graphics){
        int sum = 95;
        super.paint(graphics);      //定义画图方法
        setBackground(Color.white);
        if(temperature < -20) {
            Font fnt20 = new Font("宋体", Font.PLAIN, 20);
            graphics.setFont(fnt20);
            graphics.setColor(Color.green);
            graphics.drawString("Too cold", 70, 130);
        }else if(temperature > 100){
            Font fnt20 = new Font("宋体",Font.PLAIN,20);
            graphics.setFont(fnt20);
            graphics.setColor(Color.red);
            graphics.drawString("Too hot",70,130);
        }else{
            graphics.setColor(new Color(255,0,0));
            graphics.fillRect(172,(int)(570-(temperature+20)*4),8,(int)(temperature+20)*4);
        }
        graphics.setColor(Color.black);
        graphics.drawRect(175,90,8,480);
        for(int i=0;i<480;i+=80){
            graphics.setColor(Color.black);
            graphics.drawRect(172,90+i,14,1);
        }

        setTitle("Fahrenheit Gauge");
        Font fnt12 = new Font("宋体",Font.PLAIN,12);
        graphics.setFont(fnt12);
        graphics.setColor(Color.black);
        for(int i=100;i>=-20;i-=20){
            graphics.drawString(String.valueOf(i),200,sum);
            sum+=80;
        }
        graphics.drawString(String.valueOf(temperature),100,150);
        graphics.drawString("   ℉",127,150);
        Font fnt20 = new Font("宋体",Font.PLAIN,20);
        graphics.setFont(fnt20);
        graphics.setColor(Color.black);
        graphics.drawString("℉",150,100);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent){

        if(actionEvent.getSource() == fahrenheitButton){
            repaint();
        }
    }
}




