package edu.icet.ecom.service;

import edu.icet.ecom.dto.TrainingProgram;
import java.util.*;

public interface TrainingProgramsService {

    void add(TrainingProgram trainingProgram);
    void delete(Long id);
    void update(TrainingProgram trainingProgram);
    TrainingProgram search(Long id);
    List<TrainingProgram> findByName(String name);
    List<TrainingProgram> getAll();
}
