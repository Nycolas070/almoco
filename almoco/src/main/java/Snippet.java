import java.util.UUID;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Snippet {
		
	@Id
	@GeneratedValue(strategy = GenerationType.UUID)
	private UUID idalimento ;
	private String proteina, carboidrato, fibra, gordura, bebida, sobremesa;
}