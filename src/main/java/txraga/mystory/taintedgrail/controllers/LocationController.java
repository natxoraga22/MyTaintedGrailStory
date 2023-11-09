package txraga.mystory.taintedgrail.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.XSlf4j;
import txraga.mystory.taintedgrail.TaintedGrail;
import txraga.mystory.taintedgrail.model.Location;


@XSlf4j
@RequiredArgsConstructor
@Controller
@RequestMapping("/location")
public class LocationController {
	
	private final TaintedGrail taintedGrail;
	

	@GetMapping("/{locationId}")
	public ModelAndView location(Model model, @PathVariable int locationId) {
		log.entry(locationId);
		Location location = taintedGrail.getLocation(locationId);
		model.addAttribute("location", location);
		return log.exit(new ModelAndView("location"));
	}

}
