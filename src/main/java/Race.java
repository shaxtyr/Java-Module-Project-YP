public class Race {
    int distance = 0;
    String currentWinner = "";
    public void getNewWinner (Car car) {
        if (car.speed * 24 > distance) {
            distance = car.speed * 24;
            currentWinner = car.brand;
        }
    }
}
