package com.soak.invest.bond.dao;

import com.soak.invest.bond.model.Bond;

public interface BondDao {
  
  public void addBond(Bond bond);
  
  
  // 清空 债券数据
  public boolean wipeBonds();
  
  
}