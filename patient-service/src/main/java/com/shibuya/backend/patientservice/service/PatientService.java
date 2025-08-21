package com.shibuya.backend.patientservice.service;

import com.shibuya.backend.patientservice.dto.PatientRequestDTO;
import com.shibuya.backend.patientservice.dto.PatientResponseDTO;
import com.shibuya.backend.patientservice.mapper.PatientMapper;
import com.shibuya.backend.patientservice.model.Patient;
import com.shibuya.backend.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatient(){
        List<Patient> patients = patientRepository.findAll();
        return patients
                .stream()
                .map(PatientMapper::toDTO).toList();
    }

    public PatientResponseDTO createPatient(PatientRequestDTO patientRequestDTO){
        Patient patient = patientRepository.save(PatientMapper.toModel(patientRequestDTO));
        return PatientMapper.toDTO(patient);
    }
}
