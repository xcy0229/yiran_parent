package com.yiran.service;

import com.yiran.pojo.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


/**
 * @Author 小番茄
 * @Date 2022/11/7 9:08
 */
@Service
@Repository
public interface RefreshDataService extends ElasticsearchRepository<Product,Integer> {
//    List<Product>findByproId(String proId);
//    List<Product> findByproName(String proName);
//    List<Product> findByproMainImageAddress(String proMainImageAddress);
//    List<Product> findBysellingPrice(BigDecimal sellingPrice);
//    List<Product> findByproPrice(BigDecimal proPrice);
}
