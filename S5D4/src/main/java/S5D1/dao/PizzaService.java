package S5D1.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import S5D1.entities.Pizza;

@Service
public class PizzaService implements PizzaDAO {

	@Autowired
	private PizzaRepository pizzaRepo;

	public void save(Pizza pizza) {

		pizzaRepo.save(pizza);

	}

	@Override
	public void findByIdAndUpdate(String nome, Pizza pizza) {
		// TODO Auto-generated method stub

	}

	@Override
	public void findByIdAndDelete(String nome) {
		// TODO Auto-generated method stub

	}

	@Override
	public Pizza findById(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pizza> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Pizza> findByPartialNameIgnoreCase(String nome) {
		// TODO Auto-generated method stub
		return null;
	}

}
