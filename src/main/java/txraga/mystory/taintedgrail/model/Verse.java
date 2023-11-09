package txraga.mystory.taintedgrail.model;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Verse {
	
	private String id;
	private String text;
	private boolean endExploration;

	private List<Action> actions;

}
