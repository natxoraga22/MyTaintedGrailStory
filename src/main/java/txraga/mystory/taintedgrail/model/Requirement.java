package txraga.mystory.taintedgrail.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class Requirement {

	private Status status;
	private Secret secret;

}
