package S5D1.dao;

import java.util.List;

import S5D1.entities.Pizza;

public interface PizzaDAO {
//	public void save(Pizza pizza);

	public void findByIdAndUpdate(String nome, Pizza pizza);

	public void findByIdAndDelete(String nome);

	public Pizza findById(String nome);

	public List<Pizza> findAll();

	public long count();

	public List<Pizza> findByPartialNameIgnoreCase(String nome);
}
