package vn.edu.leading.uaa.services;

import vn.edu.leading.uaa.models.RoleModel;
import java.util.List;

public interface RoleService {

    List<RoleModel> findAll();

    List<RoleModel> search(String term);

    RoleModel findById(Long id);

    boolean update(RoleModel user);

    void save(RoleModel user);

    boolean delete(Long id);
}
