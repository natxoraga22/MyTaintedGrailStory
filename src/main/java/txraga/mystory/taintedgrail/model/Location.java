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
public class Location {
	
	private int id;
	private String name;
	private String introduction;

	private List<Action> redirects;
	private List<Action> actions;

	private Map<String,Verse> verses;
	private Verse dream;
	private Verse nightmare;

}
