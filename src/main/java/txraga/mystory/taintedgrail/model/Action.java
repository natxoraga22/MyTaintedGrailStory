package txraga.mystory.taintedgrail.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Action {
	
	private String action;
	private String description;
	private String goToVerse;

}
