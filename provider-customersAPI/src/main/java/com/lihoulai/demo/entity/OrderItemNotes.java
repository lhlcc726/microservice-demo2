package com.lihoulai.demo.entity;

import com.baomidou.mybatisplus.annotation.TableField;
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
public class OrderItemNotes implements Serializable {

    private static final long serialVersionUID=1L;

      private Integer noteId;

    @TableField("order_Id")
    private Integer orderId;

    private Integer productId;

    private String note;


}
