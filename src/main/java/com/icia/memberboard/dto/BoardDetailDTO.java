package com.icia.memberboard.dto;

import com.icia.memberboard.entity.BoardEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BoardDetailDTO {
    private Long boardId;
    private String boardWriter;
    private String boardPassword;
    private String boardTitle;
    private String boardContents;
    private LocalDateTime boardDate;
    private int boardHits;
    private String boardFilename;

    public static BoardDetailDTO toBoardDetailDTO(BoardEntity boardEntity) {
        BoardDetailDTO boardDetailDTO = new BoardDetailDTO();
        boardDetailDTO.setBoardId(boardEntity.getId());
        boardDetailDTO.setBoardWriter(boardEntity.getBoardWriter());
        boardDetailDTO.setBoardPassword(boardEntity.getBoardPassword());
        boardDetailDTO.setBoardTitle(boardEntity.getBoardTitle());
        boardDetailDTO.setBoardContents(boardEntity.getBoardContents());
        boardDetailDTO.setBoardDate(boardEntity.getCreateTime());
        boardDetailDTO.setBoardHits(boardEntity.getBoardHits());
        boardDetailDTO.setBoardFilename(boardEntity.getBoardFileName());
        return boardDetailDTO;
    }

}
