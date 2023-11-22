package txraga.mystory.taintedgrail.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class TestResult {

	private String result;
	private String text;
	private boolean endExploration;

}
