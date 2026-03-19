package fiap.com.br.watchlistapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class WatchListApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WatchListApiApplication.class, args);
    }

}
