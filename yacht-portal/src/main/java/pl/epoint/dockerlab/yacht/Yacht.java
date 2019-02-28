package pl.epoint.dockerlab.yacht;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author Kamil Murawski
 */
@Entity
@Getter
class Yacht {

    @Id
    @GeneratedValue(generator = "yachts_seq")
    @SequenceGenerator(name = "yachts_seq", initialValue = 1000, allocationSize = 1)
    private Long id;

    @NotNull
    @Size(min = 1, max = 100)
    @Setter
    private String name;

    @NotNull
    @Setter
    private Integer feet;

    @NotNull
    @Setter
    private Integer maxCrew;
}