package com.spittr.data;

import java.util.List;

/**
 * Created by ayates on 7/4/17.
 */
public interface SpittleRepository
{
    List<Spittle> findSpittles(long max, int count);
}
