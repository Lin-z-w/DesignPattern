public class WeatherData implements Subject {
    WeatherData() {
        observers = new Observer[10];
    }
    
    Observer[] observers;

    public void registerObserver(Observer o) {

    }
    public void removeObserver(Observer o) {

    }
    public void notifyObserver() {

    }
}
