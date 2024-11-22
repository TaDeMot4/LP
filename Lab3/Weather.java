public class Weather
{
    int humidity;
    int wind;
    double temperature;
    boolean rain;
    int uv;
    
    public Weather(double temperature, boolean rain) {
        this.temperature = temperature;
        this.rain = rain;
        this.humidity = 50; 
        this.wind = 2; 
        this.uv = 5; 
    }
    
    public Weather(int humidity, int wind, double temperature, boolean rain, int uv) {
        this.humidity = (humidity >= 0 && humidity <= 100) ? humidity : 0;
        this.wind = (wind >= 1 && wind <= 3) ? wind : 1;
        this.temperature = temperature;
        this.rain = rain;
        this.uv = (uv >= 1 && uv <= 11) ? uv : 1;
    }
    
    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = (humidity >= 0 && humidity <= 100) ? humidity : 50;
    }

    public int getWind() {
        return wind;
    }

    public void setWind(int wind) {
        this.wind = (wind >= 1 && wind <= 3) ? wind : 2;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public boolean isRain() {
        return rain;
    }

    public void setRain(boolean rain) {
        this.rain = rain;
    }

    public int getUv() {
        return uv;
    }

    public void setUv(int uv) {
        this.uv = (uv >= 1 && uv <= 11) ? uv : 5;
    }

    public void displayWeather() {
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Rain: " + (rain ? "Yes" : "No"));
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Wind: " + (wind == 1 ? "Weak" : (wind == 2 ? "Moderate" : "Strong")));
        System.out.println("UV Index: " + uv);
    }
}



