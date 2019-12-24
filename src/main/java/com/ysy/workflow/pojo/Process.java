package com.ysy.workflow.pojo;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;

/**
 * @author Administrator
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "act_process", uniqueConstraints = {@UniqueConstraint(name = "process_unique", columnNames = {"uniqueId"})})
@org.hibernate.annotations.Table(appliesTo = "act_process", comment = "流程表")
public class Process {

    @Id
    @Min(0)
    @Column(columnDefinition="bigint COMMENT '系统标识'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition="varchar(255) COMMENT '流程名称'")
    private String name;
    @Column(columnDefinition="varchar(255) COMMENT '流程标识'")
    private String uniqueId;

    /**
     * 所属文件
     */
    @ManyToOne(targetEntity = FileManage.class)
    @JoinColumn(name = "file_manage_id", referencedColumnName = "id")
    private Long fileManageId;


}
