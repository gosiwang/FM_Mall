package com.sesac.fmmall.Controller;

import com.sesac.fmmall.DTO.Inquiry.InquiryRequestDTO;
import com.sesac.fmmall.DTO.Inquiry.InquiryResponseDTO;
import com.sesac.fmmall.Repository.InquiryRepository;
import com.sesac.fmmall.Service.InquiryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inquiries")
@RequiredArgsConstructor
public class InquiryController {

    private final InquiryRepository inquiryRepository;
    private final InquiryService inquiryService;

    /* 1. 특정 아이디로 조회 */
    @GetMapping("/{inquiryId}")
    public ResponseEntity<InquiryResponseDTO> findMenuById(@PathVariable int inquiryId) {
        InquiryResponseDTO resultMenu = inquiryService.findInquiryByInquiryId(inquiryId);
        // 상태 코드 200(ok)와 함께 JSON 반환
        return ResponseEntity.ok(resultMenu);
    }

    /* 2. 문의 등록 */
    @PostMapping
    public ResponseEntity<InquiryResponseDTO> registMenu(@RequestBody InquiryRequestDTO requestDTO) {
        InquiryResponseDTO newInquiry = inquiryService.registInquiry(requestDTO);
        // 신규 리소스 생성 시 201 Created 상태 코드 반환
        return ResponseEntity.status(HttpStatus.CREATED).body(newInquiry);
    }
}
