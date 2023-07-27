package S5D1;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import S5D1.dao.PizzaDAO;
import S5D1.dao.PizzaRepository;
import S5D1.entities.Pizza;

@Component
public class AppRunner implements CommandLineRunner {

	@Autowired
	private PizzaDAO uDAO;

	@Autowired
	private PizzaRepository repo;

	@Override
	public void run(String... args) throws Exception {
		Pizza pizza = Pizza.builder().nome("Pizzamargherita").prezzo(5).infoNutrizionali("nutrizionali").build();

		repo.save(pizza);
		System.out.println((pizza.getNome() + " salvata!"));
		Optional<Pizza> pizzaOptional = repo.findByNome("Pizzamargherita");
		if (pizzaOptional.isPresent()) {
			Pizza pizzaTrovata = pizzaOptional.get();
			System.out.println("Pizza trovata: " + pizzaTrovata.getNome());
			System.out.println("Prezzo: " + pizzaTrovata.getPrezzo());
			System.out.println("Info Nutrizionali: " + pizzaTrovata.getInfoNutrizionali());
		} else {
			System.out.println("Nessuna pizza trovata per il nome: " + "Pizzamargherita");
		}

	}
}