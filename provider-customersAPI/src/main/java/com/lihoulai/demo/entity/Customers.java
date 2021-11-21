package com.lihoulai.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author lihoulai
 * @since 2021-11-21
 */
@Data
  @EqualsAndHashCode(callSuper = false)
  @Accessors(chain = true)
public class Customers implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "customer_id", type = IdType.AUTO)
      private Integer customerId;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private String phone;

    private String address;

    private String city;

    private String state;

    private Integer points;


}
