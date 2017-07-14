import model.TemperatureModel;
import view.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("MVC thermometer");

        TemperatureModel model = new TemperatureModel();
        CelsiusView cView = new CelsiusView(100, 350, model);
        cView.init();

        FahrenheitView fView = new FahrenheitView(400, 350, model);
        fView.init();

        SliderView sView = new SliderView(250, 500, model);
        sView.init();
    }
}
