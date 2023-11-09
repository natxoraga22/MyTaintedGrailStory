package txraga.mystory.taintedgrail;

import java.util.Map;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import lombok.extern.slf4j.XSlf4j;
import txraga.mystory.taintedgrail.model.Action;
import txraga.mystory.taintedgrail.model.Location;
import txraga.mystory.taintedgrail.model.Requirement;
import txraga.mystory.taintedgrail.model.Secret;


@XSlf4j
@Component
public class TaintedGrail {
	
	private Map<Integer,Secret> secrets;

	
	@PostConstruct
	private void init() {
		log.entry();
		secrets = TaintedGrailFiles.getSecrets();
		log.exit();
	}

	public Location getLocation(int locationId) {
		log.entry(locationId);
		Location location = TaintedGrailFiles.getLocation(locationId);
		for (Action redirect : location.getRedirects()) {
			for (Requirement requirement : redirect.getRequirements()) {
				if (requirement.getSecret() != null) requirement.setSecret(secrets.get(requirement.getSecret().getId()));
			}
		}
		for (Action action : location.getActions()) {
			for (Requirement requirement : action.getRequirements()) {
				if (requirement.getSecret() != null) requirement.setSecret(secrets.get(requirement.getSecret().getId()));
			}
		}
		return log.exit(location);
	}

}
