package dk.kea.dat19c.resttemplatecatfatct.service;

import dk.kea.dat19c.resttemplatecatfatct.model.CatFact;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

@Service
public class RestConsumeService {

    final RestTemplate restTemplate;
    private String url;


    public RestConsumeService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
        this.url = "http://cat-fact.herokuapp.com/facts/random";
    }

    public CatFact fetchSingleCatFact(){

        String queryUrl = UriComponentsBuilder
                .fromUriString(url)
                .toUriString();
                // ekstra parametre kan tilføjes som .queryParam(<name>, <values>) før .toUriString()

        CatFact catFact = restTemplate.getForObject(queryUrl, CatFact.class);

        return CatFact;

    }

}
