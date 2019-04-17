package vn.edu.leading.uaa.services;

import org.springframework.stereotype.Service;
import vn.edu.leading.uaa.models.UserModel;
import vn.edu.leading.uaa.repositories.RoleRepository;
import vn.edu.leading.uaa.repositories.UserRepository;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final RoleRepository roleRepository;


    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }

    @Override
    public List<UserModel> findAll() {
        return userRepository.findAll();
    }

    @Override
    public List<UserModel> search(String term) {
        return userRepository.findAllByUsernameContaining(term);
    }

    @Override
    public UserModel findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public boolean update(UserModel userModel) {
        UserModel userModel1 = userRepository.findById(userModel.getId()).orElse(null);
        if (userModel1 == null)
            return false;
        userRepository.save(userModel);
        return true;
    }

    @Override
    public void save(UserModel userModel) {
        userRepository.save(userModel);
    }

    @Override
    public boolean delete(Long id) {
        UserModel userModel = userRepository.findById(id).orElse(null);
        if (userModel == null)
            return false;
        userRepository.delete(userModel);
        return true;
    }
}
