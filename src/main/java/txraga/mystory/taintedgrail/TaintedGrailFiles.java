package txraga.mystory.taintedgrail;

import java.io.IOException;
import java.io.InputStream;

import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.XSlf4j;
import txraga.mystory.taintedgrail.model.Location;


@XSlf4j
public class TaintedGrailFiles {

	private final static String LOCATIONS_FOLDER_PATH = "static/json/locations";


	/**
	 * Gets a location from its file based on location id
	 */
	public static Location getLocation(int locationId) {
		log.entry(locationId);
		String locationFilePath = LOCATIONS_FOLDER_PATH + "/" + locationId + ".json";
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			InputStream locationInputStream = new ClassPathResource(locationFilePath).getInputStream();
			Location location = objectMapper.readValue(locationInputStream, Location.class);
			return log.exit(location);
		}
		catch (IOException e) {
			log.warn("Error reading and parsing file '" + locationFilePath + "'", e);
			return log.exit(null);
		}
	}
	
}
