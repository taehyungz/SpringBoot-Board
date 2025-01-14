package com.kdt.Board.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
public class UserResponse {

    private Long userId;
    private String name;
    private Integer age;
    private String hobby;
    private LocalDateTime createdAt;
    private LocalDateTime modifiedAt;

    @Builder
    public UserResponse(Long userId, String name, Integer age, String hobby, LocalDateTime createdAt, LocalDateTime modifiedAt) {
        this.userId = userId;
        this.name = name;
        this.age = age;
        this.hobby = hobby;
        this.createdAt = createdAt;
        this.modifiedAt = modifiedAt;
    }
}
