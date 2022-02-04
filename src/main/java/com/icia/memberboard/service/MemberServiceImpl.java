package com.icia.memberboard.service;

import com.icia.memberboard.dto.BoardSaveDTO;
import com.icia.memberboard.dto.MemberDetailDTO;
import com.icia.memberboard.dto.MemberLoginDTO;
import com.icia.memberboard.dto.MemberSaveDTO;
import com.icia.memberboard.entity.MemberEntity;
import com.icia.memberboard.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService{
    private final MemberRepository mr;

    @Override
    public Long save(MemberSaveDTO memberSaveDTO) {
        MemberEntity memberEntity = MemberEntity.saveMember(memberSaveDTO);
        return mr.save(memberEntity).getId();
    }


    @Override
    public boolean login(MemberLoginDTO memberLoginDTO) {
        MemberEntity memberEntity = mr.findByMemberEmail(memberLoginDTO.getMemberEmail());
        if (memberEntity != null) {
            if (memberEntity.getMemberPassword().equals(memberLoginDTO.getMemberPassword())) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @Override
    public List<MemberDetailDTO> findAll() {
        List<MemberEntity> memberEntityList = mr.findAll();
        List<MemberDetailDTO> memberList = new ArrayList<>();
        for(MemberEntity m: memberEntityList) {
            memberList.add(MemberDetailDTO.toMemberDetailDTO(m));
        }
        return memberList;
    }

    @Override
    public MemberDetailDTO findById(Long memberId) {
        return MemberDetailDTO.toMemberDetailDTO(mr.findById(memberId).get());
    }

    @Override
    public void deleteById(Long memberId) {
        mr.deleteById(memberId);
    }

    @Override
    public MemberDetailDTO findByEmail(String memberEmail) {
        MemberEntity memberEntity = mr.findByMemberEmail(memberEmail);
        MemberDetailDTO memberDetailDTO = MemberDetailDTO.toMemberDetailDTO(memberEntity);
        return memberDetailDTO;
    }

    @Override
    public Long update(MemberDetailDTO memberDetailDTO) {
        MemberEntity memberEntity = MemberEntity.toUpdateMember(memberDetailDTO);
        Long memberId = mr.save(memberEntity).getId();
        return memberId;
    }

    @Override
    public String emailDp(String memberEmail) {
        MemberEntity emailCheckResult = mr.findByMemberEmail(memberEmail);
        if (emailCheckResult ==null) {
            return "ok";
        }else {
            return "no";
        }
    }




}
