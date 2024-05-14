package service;

import com.example.demo.entity.Ground;
import com.example.demo.pojo.GroundPojo;
import com.example.demo.repository.GroundRepository;
import service.GroundService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class GroundServiceImpl implements GroundService {

    private final GroundRepository groundRepository;


    @Override
    public void saveData(GroundPojo groundPojo) {
        Ground ground = new Ground();
        ground.setId(groundPojo.getId());
        ground.setGround_name(groundPojo.getGroundName());

        groundRepository.save(ground);
    }

    @Override
    public List<Ground> getAll() {
        return groundRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        groundRepository.deleteById(id);
    }

    @Override
    public Optional<Ground> findById(Integer id) {
        return groundRepository.findById(id);
    }

    @Override
    public void deleteById(int id) {

    }
}

