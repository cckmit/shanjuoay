package com.shanjupay.merchant.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/*
 * @auther: sqx
 * @Date: 2022/8/20
 */
@Data
@ApiModel(value="AppDTO", description="应用信息")
public class AppDTO implements Serializable {

    //private static final long serialVersionUID = 1L;

    @ApiModelProperty("应用id，新增时无需传入")
    private String appId;

    @ApiModelProperty(value = "商店名称")
    private String appName;

    @ApiModelProperty(value = "所属商户")
    private Long merchantId;

    @ApiModelProperty(value = "应用公钥(RSAWithSHA256)")
    private String publicKey;

    @ApiModelProperty(value = "授权回调地址")
    private String notifyUrl;


}

