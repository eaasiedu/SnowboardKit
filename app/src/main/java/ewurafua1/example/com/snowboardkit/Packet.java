package ewurafua1.example.com.snowboardkit;

/**
 * Created by ewurafua1 on 3/25/18.
 */



//Packet of encapsulated data
public class Packet {

    Double[] accelerometer = new Double[12];
    Double[] gyroscope = new Double[12];
    double temp = 50.5;


    public String type;

    public Packet(Double [] newAccel, Double [] newGyro, double newTemp) {

        newAccel = accelerometer;
        newGyro = gyroscope;
        newTemp = temp;

    }

    public Double[] getAccelerometer() {
        for (int i = 0; i < 11; i++) {
            accelerometer[i] = Math.random() * 10;
            System.out.println(i);
        }
        return accelerometer;
    }


    // Gets Gyroscope data
    public Double[] getGyroscope() {
        for (int i = 0; i < 11; i++) {
            gyroscope[i] = Math.random();
            System.out.println(i);
        }

        return gyroscope;
    }

    // Gets temperature sensor data
    public double getTemp() {
        temp = Math.random() * 10;
        System.out.println(temp);
        return temp;
    }


}
