package com.miaoshaproject.service;

import com.miaoshaproject.service.model.PromoModel;
import org.springframework.stereotype.Service;


public interface PromoService {

    //根据itemId获取当前正在秒杀或者即将秒杀的秒杀信息
    PromoModel getPromoByItemId(Integer itemId);
}
