package com.example.achat.services;

import com.example.achat.dto.AchatDTO;
import com.example.achat.dto.AchatReq;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AchatService {
    AchatDTO createAchat(AchatReq achatReq);
    AchatDTO updateAchat(Long id, AchatDTO achatDTO);
    AchatDTO getAchatById(Long id);
    List<AchatDTO> getAllAchats();
    void deleteAchat(Long id);
}
