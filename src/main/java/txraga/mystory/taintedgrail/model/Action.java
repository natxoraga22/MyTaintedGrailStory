package txraga.mystory.taintedgrail.model;

import java.util.ArrayList;
import java.util.List;

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
	private List<Requirement> requirements = new ArrayList<>();
	private String goToVerse;
	private String goToBosVerse;
	private boolean endExploration;

}
