package S5D1.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import S5D1.entities.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, String> {

//	// "SELECT u FROM User WHERE name= :name"
	Optional<Pizza> findByNome(String nome);

//
//	// "SELECT u FROM User WHERE name= :name AND surname = :surname"
//	List<Pizza> findByNameAndSurname(String name, String surname);
//
////
////	// "SELECT u FROM User WHERE LOWER(u.name) LIKE CONCAT(LOWER(:name), '%')
//	List<Pizza> findByNameStartingWithIgnoreCase(String name);

}
