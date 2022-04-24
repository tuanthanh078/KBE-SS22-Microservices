package kbe.project.product.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;

@Document
@AllArgsConstructor
@Data
public class SelectedHardware implements Serializable {

    private Long hardwareId;
    private int selectedAmount;
}
