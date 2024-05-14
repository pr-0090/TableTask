package service;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;

import java.util.List;
import java.util.Optional;

public interface GroundService {

    void saveData(GroundPojo groundPojo);

    List<Ground> getAll();

    Optional<Ground> findById(Integer id);

    void deleteById(int id);
}
