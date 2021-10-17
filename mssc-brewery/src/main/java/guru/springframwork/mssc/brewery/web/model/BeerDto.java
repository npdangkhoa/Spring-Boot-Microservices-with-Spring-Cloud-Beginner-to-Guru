package guru.springframwork.mssc.brewery.web.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class BeerDto {

    private UUID id;
    private String beerName;
    private String beerStyle;
    private Long upc;

}
