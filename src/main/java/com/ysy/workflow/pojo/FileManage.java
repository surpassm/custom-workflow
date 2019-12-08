package com.ysy.workflow.pojo;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author mc
 * Create date 2019/4/1 9:21
 * Version 1.0
 * Description
 */
@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "act_file_manage")
@org.hibernate.annotations.Table(appliesTo = "act_file_manage", comment = "文件管理")
public class FileManage implements Serializable {

	@Id
	@Column(columnDefinition="bigint COMMENT '系统标识'")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * 文件名称
	 */
	@Column(columnDefinition="varchar(255) COMMENT '文件名称'")
	private String fileOldName;
	/**
	 * 文件名称
	 */
	@Column(columnDefinition="varchar(255) COMMENT '文件名称'")
	private String fileNewName;
	/**
	 * 文件后缀
	 */
	@Column(columnDefinition="varchar(255) COMMENT '文件后缀'")
	private String fileSuffix;
	/**
	 * 文件路径
	 */
	@Column(columnDefinition="varchar(255) COMMENT '文件路径'")
	private String url;
}
