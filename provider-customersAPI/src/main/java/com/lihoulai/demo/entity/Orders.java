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
public class Orders implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "order_id", type = IdType.AUTO)
      private Integer orderId;

    private Integer customerId;

    private LocalDate orderDate;

    private Integer status;

    private String comments;

    private LocalDate shippedDate;

    private Integer shipperId;


}
