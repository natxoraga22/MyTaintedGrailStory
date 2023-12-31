package txraga.mystory.taintedgrail.model;

import java.util.List;
import java.util.Map;

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
	private Map<String,TestResult> testResults;
	private List<Reward> rewards;
	private List<Action> actions;
	private boolean endExploration;

}
