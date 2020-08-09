package kr.co.fastcampus.eatgo.interfaces;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class SessionResponseDto {

    private String accessToken;

}
