package com.shanjupay.transaction.api;

import com.shanjupay.common.domain.BusinessException;
import com.shanjupay.transaction.api.dto.PlatformChannelDTO;

import java.util.List;

/**
 * 支付渠道服务 管理平台支付渠道，原始支付渠道，以及相关配置
 * @auther: sqx
 * @Date: 2022/8/23
 */
public interface PayChannelService {
    /**
     * 获取平台服务类型
     * @return
     * @throws BusinessException
     */
    List<PlatformChannelDTO> queryPlatformChannel() throws BusinessException;




}
