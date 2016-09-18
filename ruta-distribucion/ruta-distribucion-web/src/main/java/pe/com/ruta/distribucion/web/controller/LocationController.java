package pe.com.ruta.distribucion.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.ruta.distribucion.model.Location;
import pe.com.ruta.distribucion.model.TransactionRs;
import pe.com.ruta.distribucion.service.LocationService;
import pe.com.ruta.distribucion.web.util.UrlConstants;

@RestController
@RequestMapping(UrlConstants.URL_APP_BASE)
public class LocationController {

	private final Logger logger = LoggerFactory.getLogger(LocationController.class);

	@Autowired
	private LocationService locationService;

	public @ResponseBody TransactionRs<List<Location>> listLocations() {
		TransactionRs<List<Location>> respo = new TransactionRs<>();
		List<Location> locations = null;
		try {
			locations = locationService.listLocations();
			respo.setRespuesta(locations);
		} catch (Exception e) {
			logger.error("Error al obtener las locaciones.", e);
		}
		return respo;
	}
}
