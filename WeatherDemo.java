class Season {
    void showWeather() {
        System.out.println("Showing weather");
    }
}

class Summer extends Season {
    @Override
    void showWeather() {
        System.out.println("Hot and Sunny");
    }
}

class Rainy extends Season {
    @Override
    void showWeather() {
        System.out.println("Rain Expected");
    }
}

class Winter extends Season {
    @Override
    void showWeather() {
        System.out.println("Cold and Foggy");
    }
}

public class WeatherDemo {
    public static void main(String[] args) {

        Season season;

        season = new Summer();
        season.showWeather();

        season = new Rainy();
        season.showWeather();

        season = new Winter();
        season.showWeather();
    }
}