package com.alvy.dao;  
  
import java.io.Serializable;  

import com.alvy.entity.User;
  
public interface UserDao 
{  
    public Serializable save(User o);  
}  