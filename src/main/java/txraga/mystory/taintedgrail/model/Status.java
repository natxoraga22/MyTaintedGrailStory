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
public class Status {
	
	private String name;
	private List<Integer> parts;

}
