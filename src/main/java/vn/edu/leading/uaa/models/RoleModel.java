package vn.edu.leading.uaa.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "uaa_roles")
public class RoleModel extends BaseModel<RoleModel> {

    @NotEmpty
    @Column(nullable = false)
    private String name;
}
