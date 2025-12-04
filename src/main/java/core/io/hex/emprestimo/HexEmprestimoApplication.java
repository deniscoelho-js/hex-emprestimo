package core.io.hex.emprestimo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages = "core.io.hex.emprestimo.adapters.out.client")
public class HexEmprestimoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HexEmprestimoApplication.class, args);
	}

}
