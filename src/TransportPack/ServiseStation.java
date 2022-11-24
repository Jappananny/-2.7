package TransportPack;

import java.util.ArrayDeque;
import java.util.Queue;

public class ServiseStation {
    private final Queue<Transport> allTransportsQueue = new ArrayDeque<>();
    public void addTransportQueue(Transport allTransportCar){
        allTransportsQueue.offer(allTransportCar);
    }
    public void service() {
        if (!allTransportsQueue.isEmpty()) {
            Transport transport = allTransportsQueue.poll();
            boolean result = transport.diagnistic();
            if (!result) {
                transport.repair();
            }
        }
    }
}
