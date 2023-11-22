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
	private List<Reward> rewards;
	private List<Action> actions;
	private boolean endExploration;

}
