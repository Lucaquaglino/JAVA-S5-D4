package S5D1.entities;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Pizza {
	@jakarta.persistence.Id
	private String nome;
	private double prezzo;
	private String infoNutrizionali;

}
