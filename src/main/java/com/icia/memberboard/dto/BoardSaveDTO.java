package com.icia.memberboard.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardSaveDTO {
    private String boardWriter;
    private String boardPassword;
    private String boardTitle;
    private String boardContents;
    // 이미지 업로드
    private MultipartFile boardFile;
    // 파일 자체
    private String boardFilename;

}
