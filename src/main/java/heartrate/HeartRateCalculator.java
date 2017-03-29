package heartrate;

import heartrate.service.HeartRateCalculatorService;
import heartrate.service.HeartRateDisplayService;
import heartrate.service.impl.HeartRateCalculatorServiceImpl;
import heartrate.service.impl.HeartRateDisplayServiceImpl;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HeartRateCalculator {

    private HeartRateCalculatorService heartRateCalculatorService = new HeartRateCalculatorServiceImpl();
    private HeartRateDisplayService heartRateDisplayService = new HeartRateDisplayServiceImpl();

    public static void main(String[] args) {
        HeartRateCalculator calculator = new HeartRateCalculator();
        calculator.run();
    }

    private void run() {
        int restingHeartRate = 0;
        int age = 0;

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter resting heart rate: ");
             restingHeartRate = scanner.nextInt();
            System.out.print("Enter age: ");
            age = scanner.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("This is invalid.");
            return;
        } catch (Exception e){
            System.out.println("Unhandled exception, " + e.getMessage());
        }


        System.out.printf("Age: %s, Resting heart rate: %s\n", age, restingHeartRate);

        heartRateDisplayService.displayHeartRates(heartRateCalculatorService.calculateTargetHeartRates(restingHeartRate, age));

    }
}
