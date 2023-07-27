package S5D1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import S5D1.entities.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, String> {
//
//	// "SELECT u FROM User WHERE name= :name"
//	Optional<Pizza> findByNome(String nome);

}
