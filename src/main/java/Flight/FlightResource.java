package Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class FlightResource {

    @Autowired
    FlightService flightService;

    public FlightResource(FlightService flightService){
        super();
        this.flightService = flightService;
    }

    @RequestMapping("/")
    public String home(){
        return "Welcome to Flight Details API";
    }

    @RequestMapping("/all-flights")
    public List<Flight> retrieveAllFlights(){
        List<Flight> allFlights = flightService.retrieveAllFlights();
        return allFlights;
    }

    @RequestMapping("/all-flights/{source}/{destination}")
    public List<Flight> retrieveFlightsSourceAndDestination(@PathVariable String source, @PathVariable String destination) throws Exception{
        List<Flight> allFlightsSourceAndDestination = flightService.retrieveFlightsSourceAndDestination(source, destination);
        return allFlightsSourceAndDestination;
    }

    @RequestMapping("/all-flights/{source}/{destination}/economic")
    public Optional<Flight> retrieveEconomicFlight(@PathVariable String source, @PathVariable String destination) throws Exception{
        Optional<Flight> economicFlight = flightService.retrieveEconomicFlight(source, destination);
        return economicFlight;
    }
}
