package com.sesac.fmmall.Service;

import com.sesac.fmmall.DTO.Inquiry.InquiryRequestDTO;
import com.sesac.fmmall.DTO.Inquiry.InquiryResponseDTO;
import com.sesac.fmmall.Entity.Inquiry;
import com.sesac.fmmall.Repository.InquiryRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InquiryService {
    private final InquiryRepository inquiryRepository;

    /* 1. 메뉴 코드로 상세 조회 */
    public InquiryResponseDTO findInquiryByInquiryId(int inquiryId) {
        Inquiry foundInquiry = inquiryRepository.findById(inquiryId).orElseThrow(
                () -> new IllegalArgumentException("해당 ID를 가진 문의가 존재하지 않습니다."));

        return new InquiryResponseDTO(foundInquiry);
//        return modelMapper.map(foundInquiry, InquiryResponseDTO.class);
    }

    /* 2. 문의 등록 */
    @Transactional
    public InquiryResponseDTO registInquiry(InquiryRequestDTO requestDTO) {
//        User user = userRepository.findById(requestDTO.getUserId())
//                .orElseThrow(() -> new IllegalArgumentException("존재하지 않는 유저입니다."));

        // DTO -> Entity 변환 (builder 패턴 사용)
        Inquiry newInquiry = Inquiry.builder()
                .inquiryContent(requestDTO.getInquiryContent())
                .userId(requestDTO.getUserId())
                .productId(requestDTO.getProductId())
                .build();

        System.out.println(requestDTO.getInquiryContent());

        // 내부적으로 EntityManager.persist() 호출되어 영속성 컨텍스트로 들어간다.
        Inquiry savedInquiry = inquiryRepository.save(newInquiry);

        // 저장 후, 생성된 Entity를 다시 DTO로 변환하여 반환
//        return modelMapper.map(savedMenu, MenuResponseDTO.class);
        return  new InquiryResponseDTO(savedInquiry);
    }


}
