package splitmindq.caloriecounter;

 import org.springframework.boot.SpringApplication;
 import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalorieCounterApplication {
    public static void main(String[] args) {
        System.out.println("Hello from Calorie Counter Application!");
         SpringApplication.run(CalorieCounterApplication.class, args);
    }
}