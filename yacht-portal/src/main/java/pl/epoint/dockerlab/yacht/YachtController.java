package pl.epoint.dockerlab.yacht;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Kamil Murawski
 */
@RestController
@RequestMapping("/yacht")
public class YachtController {

    private final YachtRepository yachtRepository;

    @Autowired
    public YachtController(YachtRepository yachtRepository) {
        this.yachtRepository = yachtRepository;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Yacht>> getYachts() {
        return new ResponseEntity<List<Yacht>>(yachtRepository.findAll(), HttpStatus.OK);
    }
}
