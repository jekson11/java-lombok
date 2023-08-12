package turorial.javalombok;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SynchronizeTest {
    @Test
    void testCounterSynchronize() throws InterruptedException {
    
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    System.out.println(Thread.currentThread().getName());
                    Counter.increment();
                }
            }).start();
        }

        Thread.sleep(5000L);
        log.info("{}", Counter.getData());
    }
}
