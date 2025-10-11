package tugas2;

public class konversiSuhu {
    double C; // Celcius
    double F; // Fahrenheit
    double R; // Reamur

    // a. Celcius ke Fahrenheit dan sebaliknya
    public void celciusFahrenheit() {
        double f = (C * 9 / 5) + 32;
        double c = (F - 32) * 5 / 9;
        System.out.println("Celcius ke Fahrenheit : " + f);
        System.out.println("Fahrenheit ke Celcius : " + c);
    }

    // b. Celcius ke Reamur dan sebaliknya
    public void celciusReamur() {
        double r = C * 4 / 5;
        double c = R * 5 / 4;
        System.out.println("\nCelcius ke Reamur : " + r);
        System.out.println("Reamur ke Celcius : " + c);
    }

    // c. Fahrenheit ke Reamur dan sebaliknya
    public void fahrenheitReamur() {
        double r = (F - 32) * 4 / 9;
        double f = (R * 9 / 4) + 32;
        System.out.println("\nFahrenheit ke Reamur : " + r);
        System.out.println("Reamur ke Fahrenheit : " + f);
    }
}
