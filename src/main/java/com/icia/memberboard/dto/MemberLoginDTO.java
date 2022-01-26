package com.icia.memberboard.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotBlank;

@Data
@NoArgsConstructor // 기본생정자
@AllArgsConstructor // 매개변수 있는 생성자
public class MemberLoginDTO {
    @NotBlank(message = "로그인시 이메일은 필숭비니다")
    private String memberEmail;
    @NotBlank
    @Length(min = 2, max = 8, message = "비밀번호는 2~8자로 입력해주세요")
    private String memberPassword;
}
