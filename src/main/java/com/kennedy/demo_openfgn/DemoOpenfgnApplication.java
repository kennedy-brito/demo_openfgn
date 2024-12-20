package com.kennedy.demo_openfgn;

import com.kennedy.demo_openfgn.clients.ViaCepClient;
import com.kennedy.demo_openfgn.entities.CpfResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.util.List;

@SpringBootApplication
@EnableFeignClients
public class DemoOpenfgnApplication implements CommandLineRunner {

	@Autowired
	private ViaCepClient viaCepConsumer;

	public static void main(String[] args) {
		SpringApplication.run(DemoOpenfgnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("\n\n\n\n\n");
		System.out.println("Consuming a cep search query");
		CpfResponse cdb = viaCepConsumer.searchLocationByCep("64890000");
		System.out.println(cdb);
		System.out.println("\n");
		System.out.println("Consuming a search address query");
		List<CpfResponse> locations = viaCepConsumer.searchCepByAddress("PI", "Canto do Buriti", "Piauí");
		locations.forEach(
                System.out::println
		);

		System.out.println("End query's");
	}
}
