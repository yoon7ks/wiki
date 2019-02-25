package com.yoon.data;

import com.yoon.vo.Spittle;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SpittleRepository {
    List<Spittle> findSpittles(long max, int count);
}
