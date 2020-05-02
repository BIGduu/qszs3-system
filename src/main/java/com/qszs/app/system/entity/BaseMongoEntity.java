package com.qszs.app.system.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.time.LocalDate;

/**
 * @author bigduu
 * @title: BaseMongoEntity
 * @projectName service
 * @description: TODO
 * @date 2020/5/212:28
 */
@Data
public class BaseMongoEntity {
    @Id
    private String id;
    @Version
    private Integer version;
    @CreatedDate
    private LocalDate createdDate;
    @LastModifiedDate
    private LocalDate lastModifiedDate;
}
