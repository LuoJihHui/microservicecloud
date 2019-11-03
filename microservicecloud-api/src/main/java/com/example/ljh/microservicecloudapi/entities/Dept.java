package com.example.ljh.microservicecloudapi.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 部门信息表
 *
 * @author luojihui
 * @date 2019/11/3 20:16
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Dept implements Serializable {
    /**
     * 部门编号，主键
     */
    private Long deptno;
    /**
     * 部门名称
     */
    private String dnamel;
    /**
     * 数据来源
     */
    private String db_source;
}
