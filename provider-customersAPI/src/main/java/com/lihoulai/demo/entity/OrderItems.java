package com.lihoulai.demo.entity;

import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.IdType;
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
public class OrderItems implements Serializable {

    private static final long serialVersionUID=1L;

      @TableId(value = "order_id", type = IdType.AUTO)
      private Integer orderId;

    private Integer productId;

    private Integer quantity;

    private BigDecimal unitPrice;


}
