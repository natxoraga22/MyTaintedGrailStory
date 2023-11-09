package txraga.mystory.taintedgrail;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Map.Entry;

import org.springframework.core.io.ClassPathResource;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.XSlf4j;
import txraga.mystory.taintedgrail.model.Location;
import txraga.mystory.taintedgrail.model.Secret;


@XSlf4j
public class TaintedGrailFiles {

	private final static String SECRETS_FILE_PATH = "static/json/secrets.json";
	private final static String LOCATIONS_FOLDER_PATH = "static/json/locations";


	/**
	 * Gets all secrets from "secrets.json" file.
	 */
	public static Map<Integer,Secret> getSecrets() {
		log.entry();
		try {
			ObjectMapper objectMapper = new ObjectMapper();
			InputStream secretsInputStream = new ClassPathResource(SECRETS_FILE_PATH).getInputStream();
			Map<Integer,Secret> secrets = objectMapper.readValue(secretsInputStream, new TypeReference<Map<Integer,Secret>>(){});

			// Set secrets ids
			for (Entry<Integer,Secret> secretEntry : secrets.entrySet()) {
				secretEntry.getValue().setId(secretEntry.getKey());
			}
			return log.exit(secrets);
		}
		catch (IOException e) {
			log.warn("Error reading and parsing file '" + SECRETS_FILE_PATH + "'", e);
			return log.exit(null);
		}
	}

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
