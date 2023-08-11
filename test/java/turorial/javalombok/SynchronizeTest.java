package turorial.javalombok;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
public class SynchronizeTest {
    @Test
    void testCounterSynchronize() throws InterruptedException {
        //ini jika tidak menggunakan annotation @Synchronize kode nya tidak akan thread safe
        //hasil nya tidak sesuai yang kita inginkan
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
