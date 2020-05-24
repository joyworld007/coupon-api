package com.kakaopay.server.repository.coupon;

import com.kakaopay.server.domain.coupon.entity.Coupon;
import java.time.LocalDateTime;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponJpaRepository extends JpaRepository<Coupon, Long> {

  Page<Coupon> findAllByCouponIssue_UserId(String userId, Pageable pageable);

  Page<Coupon> findByExpireDateIsBetween(LocalDateTime start, LocalDateTime end, Pageable pageable);
}
