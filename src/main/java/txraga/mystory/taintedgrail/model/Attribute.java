package txraga.mystory.taintedgrail.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Attribute {

	private Id id;
	private int level;

	
	public enum Id {
		AGGRESSION,
		COURAGE,
		PRACTICALITY,
		EMPATHY,
		CAUTION,
		SPIRITUALITY
	}
	
}
