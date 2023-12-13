package com.ensim.Tp1info.Controller;
import com.ensim.Tp1info.Model.AddressApiResponse;
import com.ensim.Tp1info.Model.Feature;
import com.ensim.Tp1info.Model.MeteoConceptApiAdress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

@Controller

public class MeteoController {
	@Autowired
	RestTemplate rt;
	  @GetMapping("/adresse")
	  public String showmeteopage(Model model) {
	        return "Ajoutemeteo";
	    }
	    @PostMapping("/meteo")
	    public String handelMeteoform(@RequestParam("Address") String Address,Model model) {
	    	   		String Addr = Address.toLowerCase().replace(" ", "+");
	    	        String apiUrl = "https://api-adresse.data.gouv.fr/search/?q=" + Addr;

					AddressApiResponse response = rt.getForObject(apiUrl, AddressApiResponse.class);

					Feature feature = response.features.get(0);
					float longitude = feature.getGeometry().getCoordinates().get(0);
					float latitude = feature.getGeometry().getCoordinates().get(1);

					model.addAttribute("latitude",latitude);
					model.addAttribute("longitude",longitude);

					String weatherApiKey="9b932ec29584e43a29711279514fe9022e083b9788d9b221bfc19d1c6aeafbf0";
					String weatherApiUrl = "https://api.meteo-concept.com/api/forecast/nextHours?token=" + weatherApiKey +  "&latlon=" + latitude + ","+ longitude ;

					MeteoConceptApiAdress responset = rt.getForObject(weatherApiUrl, MeteoConceptApiAdress.class);
					int temp2m = responset.forecast.get(0).getTemp2m();
					model.addAttribute("temp2m",temp2m);
					return "meteo";
	    }

}
