import com.heiku.spi.api.Printer;

import java.util.ServiceLoader;

/**
 * @Author: Heiku
 * @Date: 2019/11/4
 */
public class Main {

    public static void main(String[] args) {

        ServiceLoader<Printer> loader = ServiceLoader.load(Printer.class);
        loader.forEach(Printer::print);
    }
}
