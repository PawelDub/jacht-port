package pl.epoint.dockerlab.yacht;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Kamil Murawski
 */
public interface YachtRepository extends JpaRepository<Yacht, Long> {
}

//public class YachtRepository {
//
//    private static final List<Yacht> yachts;
//
//    static {
//        yachts = new ArrayList<>();
//
//        Yacht yacht1 = new Yacht();
//        yacht1.setName("Yacht 1");
//        yacht1.setFeet(41);
//        yacht1.setMaxCrew(10);
//
//        Yacht yacht2 = new Yacht();
//        yacht2.setName("Yacht 2");
//        yacht2.setFeet(32);
//        yacht2.setMaxCrew(6);
//
//        yachts.add(yacht1);
//        yachts.add(yacht2);
//    }
//
//    public List<Yacht> findAll() {
//        return yachts;
//    }
//}