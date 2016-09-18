package pe.com.ruta.distribucion.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import pe.com.ruta.distribucion.model.DistribuidoRq;
import pe.com.ruta.distribucion.model.DistribuidoRs;
import pe.com.ruta.distribucion.model.TransactionRs;
import pe.com.ruta.distribucion.service.DistributionService;
import pe.com.ruta.distribucion.web.util.UrlConstants;

@RestController
@RequestMapping(UrlConstants.URL_APP_BASE)
public class DistribucionController {

	private final Logger logger = LoggerFactory.getLogger(DistribucionController.class);

	@Autowired
	private DistributionService distributionService;

	@RequestMapping(value = UrlConstants.URL_DISTRIBUCION_ALL, method = RequestMethod.POST, produces = {
			"application/json" })
	public @ResponseBody TransactionRs<List<DistribuidoRs>> getAllDistributions(
			@RequestBody DistribuidoRq appVersionRq) {
		TransactionRs<List<DistribuidoRs>> respo = new TransactionRs<>();
		List<DistribuidoRs> distribuidoRs = null;
		try {
			distribuidoRs = distributionService.getAllDistributions();
			respo.setRespuesta(distribuidoRs);
		} catch (Exception e) {
			logger.error("Error al obtener todas las distribuciones.", e);
		}
		return respo;
	}
}
