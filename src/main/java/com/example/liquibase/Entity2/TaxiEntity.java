package com.example.liquibase.Entity2;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "mytaxi")
public class TaxiEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotBlank
    String brandName;
    @NotBlank
    String driverName;
    @Pattern(regexp = "^[0-9]{2}[A-Z]{2}[0-9]{3}$", message = "THIS_IS_NOT_VALID_VEHICLE_NUMBER")
    String vehicleNumber;

    @CreationTimestamp
    LocalDateTime createdAt;

    @UpdateTimestamp
    LocalDateTime updatedAt;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(
            name = "mytaxis_myroles",
            joinColumns = @JoinColumn(name = "mytaxi_id",referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "myrole_id",referencedColumnName = "id")
    )
    List<RoleEntity> roleEntityList;

}
