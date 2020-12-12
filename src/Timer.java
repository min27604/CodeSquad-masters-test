import java.time.Duration;
import java.time.Instant;

public class Timer {
    static void printTimeElapsed(Instant start, Instant end) {
        long timeElapsed = Duration.between(start, end).toMillis();
        long minutes = (timeElapsed / 1000) / 60;
        long seconds = (timeElapsed / 1000) % 60;
        System.out.format("경과시간: %02d:%02d \n", minutes, seconds);
    }
}
