package aop;

import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class MeasurementService {
    public String getMeasurement() {
        System.out.println("MeasurementService.getMeasurement(): before sleep");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("MeasurementService.getMeasurement(): after sleep");
        return "Measurement";
    }
}
